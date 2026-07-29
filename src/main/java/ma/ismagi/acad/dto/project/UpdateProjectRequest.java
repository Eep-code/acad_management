package ma.ismagi.acad.dto.project;

import lombok.*;

@Setter
@Getter
public class UpdateProjectRequest {

    private Long id;
    private String titre;
    private String description;
    private String etat;
}
