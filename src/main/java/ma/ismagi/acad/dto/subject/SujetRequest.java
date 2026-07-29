package ma.ismagi.acad.dto.subject;

import lombok.*;


@Getter @Setter

public class SujetRequest {

    private String titre;
    private String description;

    private Long projetId;
    private Long etudiantId;
    private Long encadrantId;
}
