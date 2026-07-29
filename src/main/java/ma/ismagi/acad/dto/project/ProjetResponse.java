package ma.ismagi.acad.dto.project;

import lombok.*;
import ma.ismagi.acad.dto.subject.SujetSummary;

@Setter @Getter
public class ProjetResponse {
    private Long id;
    private String titre;
    private String description;
    private String etat;
    private SujetSummary sujet;
}
