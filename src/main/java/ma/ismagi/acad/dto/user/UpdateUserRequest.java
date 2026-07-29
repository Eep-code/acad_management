package ma.ismagi.acad.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UpdateUserRequest {

    @NotNull
    private Long id;

    private String nom;

    private String prenom;

    @Email
    private String email;

    private String password;
}
