package ma.ismagi.acad.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.user.CreateUserRequest;
import ma.ismagi.acad.dto.user.UpdateUserRequest;
import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.entity.Encadrant;
import ma.ismagi.acad.entity.Etudiant;
import ma.ismagi.acad.entity.User;
import ma.ismagi.acad.enums.Role;
import ma.ismagi.acad.mapper.UserMapper;


import ma.ismagi.acad.repository.EncadrantRepository;
import ma.ismagi.acad.repository.EtudiantRepository;
import ma.ismagi.acad.repository.UserRepository;
import ma.ismagi.acad.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final EncadrantRepository encadrantRepository;
    private final EtudiantRepository etudiantRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse create(CreateUserRequest request) {

        User user = userMapper.toEntity(request);
        user.setRole(request.getRole());
        user.setActive(true);

        user = userRepository.save(user);

        switch (request.getRole()) {

            case ENCADRANT -> {
                Encadrant encadrant = new Encadrant();
                encadrant.setUser(user);
                encadrantRepository.save(encadrant);
            }

            case ETUDIANT -> {
                Etudiant etudiant = new Etudiant();
                etudiant.setUser(user);
                etudiantRepository.save(etudiant);
            }

            default -> throw new IllegalArgumentException("Unsupported role");
        }

        return userMapper.toResponse(user);
    }

    @Override
    public UserResponse update(UpdateUserRequest request) {

        User user = userRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        userMapper.update(request, user);

        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public void delete(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        switch (user.getRole()) {
            case ENCADRANT -> encadrantRepository.deleteById(id);
            case ETUDIANT -> etudiantRepository.deleteById(id);
        }

        userRepository.delete(user);
    }

    @Override
    public UserResponse getById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return userMapper.toResponse(user);
    }

    @Override
    public List<UserResponse> getAll() {
        return userMapper.toResponseList(userRepository.findAll());
    }

    @Override
    public void changeRole(Long id, Role role) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (user.getRole() == role) {
            return;
        }

        switch (user.getRole()) {
            case ENCADRANT -> encadrantRepository.deleteById(id);
            case ETUDIANT -> etudiantRepository.deleteById(id);
        }

        user.setRole(role);
        userRepository.save(user);

        switch (role) {
            case ENCADRANT -> {
                Encadrant encadrant = new Encadrant();
                encadrant.setUser(user);
                encadrantRepository.save(encadrant);
            }

            case ETUDIANT -> {
                Etudiant etudiant = new Etudiant();
                etudiant.setUser(user);
                etudiantRepository.save(etudiant);
            }
        }
    }

    @Override
    public void activate(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setActive(true);

        userRepository.save(user);
    }

    @Override
    public void deactivate(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setActive(false);

        userRepository.save(user);
    }
}