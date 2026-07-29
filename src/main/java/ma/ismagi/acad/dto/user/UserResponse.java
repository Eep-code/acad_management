package ma.ismagi.acad.dto.user;

import lombok.Getter;
import lombok.Setter;
import ma.ismagi.acad.enums.Role;

@Getter
@Setter
public class UserResponse {

    private Long id;

    private String nom;

    private String prenom;

    private String email;

    private Role role;

    private boolean active;
}
