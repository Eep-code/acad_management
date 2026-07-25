package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.user.CreateUserRequest;
import ma.ismagi.acad.dto.user.UpdateUserRequest;
import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.enums.Role;

import java.util.List;

public interface UserService {

    UserResponse create(CreateUserRequest request);

    UserResponse update(UpdateUserRequest request);

    void delete(Long id);

    UserResponse getById(Long id);

    List<UserResponse> getAll();

    void changeRole(Long id, Role role);

    void activate(Long id);

    void deactivate(Long id);
}
