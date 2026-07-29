package ma.ismagi.acad.dto.subject;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjetSummary {

    private Long id;
    private String titre;
    private String etat;

}