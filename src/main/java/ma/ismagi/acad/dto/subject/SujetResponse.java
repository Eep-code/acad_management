package ma.ismagi.acad.dto.subject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.ismagi.acad.entity.Encadrant;
import ma.ismagi.acad.entity.Etudiant;
import ma.ismagi.acad.entity.Projet;

import java.time.LocalDateTime;

@Getter @Setter
public class SujetResponse {

    private Long id;
    private String titre;
    private String description;
    private LocalDateTime dateCreation;
    private String statut;
    private ProjetSummary projet;
    private Etudiant etudiant;
    private Encadrant encadrant;
}
