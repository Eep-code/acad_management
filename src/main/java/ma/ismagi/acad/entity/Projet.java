package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "projets")
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String etat;


    @OneToOne
    @JoinColumn(name = "sujet_id")
    private Sujet sujet;

    @OneToOne
    @JoinColumn(name = "echeance_id")
    private Echeance echeance;

    @OneToOne(mappedBy = "projet", cascade = CascadeType.ALL)
    private Soutenance soutenance;

    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<TraceProjet> traces;
}
