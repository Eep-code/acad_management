package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.user.CreateUserRequest;
import ma.ismagi.acad.dto.user.UpdateUserRequest;
import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@RequestParam Long id){
        return userService.getById(id);
    }

    @PostMapping
    public UserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.create(request);
    }

    @PutMapping
    public UserResponse updateUser(@RequestBody UpdateUserRequest request) {
        return userService.update(request);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@RequestParam Long id){
        userService.delete(id);
    }

    @PostMapping("/activate")
    public void activateUser(@RequestParam Long id){
        userService.activate(id);
    }

    @PostMapping("/deactivate")
    public void deactivateUser(@RequestParam Long id){
        userService.deactivate(id);
    }

}
