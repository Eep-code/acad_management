package ma.ismagi.acad.dto.groupe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.ismagi.acad.entity.Encadrant;
import ma.ismagi.acad.entity.Etudiant;

import java.util.List;

@Getter @Setter
public class GroupeResponse {

    private Long id;
    private String nom;
    private String annee;
    private List<Etudiant> etudiants;
    private Encadrant encadrant;
}
