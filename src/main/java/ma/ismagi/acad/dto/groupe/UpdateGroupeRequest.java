package ma.ismagi.acad.dto.groupe;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdateGroupeRequest {

    private Long id;
    private String nom;
    private String annee;

}
