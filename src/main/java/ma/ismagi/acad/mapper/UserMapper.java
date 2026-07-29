package ma.ismagi.acad.mapper;

import ma.ismagi.acad.dto.user.CreateUserRequest;
import ma.ismagi.acad.dto.user.UpdateUserRequest;
import ma.ismagi.acad.dto.user.UserResponse;
import ma.ismagi.acad.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);

    List<UserResponse> toResponseList(List<User> users);

    User toEntity(CreateUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
