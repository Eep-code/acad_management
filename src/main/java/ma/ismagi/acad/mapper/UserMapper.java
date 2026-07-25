package ma.ismagi.acad.mapper;

import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.entity.User;

import java.util.List;

public interface UserMapper {

    UserResponse toResponse(User user);

    List<UserResponse> toResponseList(List<User> users);
}
