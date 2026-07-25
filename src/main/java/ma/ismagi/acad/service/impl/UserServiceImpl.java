package ma.ismagi.acad.service.impl;

import ma.ismagi.acad.dto.user.CreateUserRequest;
import ma.ismagi.acad.dto.user.UpdateUserRequest;
import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.enums.Role;
import ma.ismagi.acad.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserResponse create(CreateUserRequest request) {
        return null;
    }

    @Override
    public UserResponse update(UpdateUserRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserResponse getById(Long id) {
        return null;
    }

    @Override
    public List<UserResponse> getAll() {
        return List.of();
    }

    @Override
    public void changeRole(Long id, Role role) {

    }

    @Override
    public void activate(Long id) {

    }

    @Override
    public void deactivate(Long id) {

    }
}
