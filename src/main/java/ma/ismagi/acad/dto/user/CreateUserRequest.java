package ma.ismagi.acad.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import ma.ismagi.acad.enums.Role;


@Getter
@Setter
public class CreateUserRequest {

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;


    private Role role;
}
