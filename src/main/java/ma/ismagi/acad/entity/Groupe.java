package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "groupes")
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String annee;

    @OneToMany(mappedBy = "groupe")
    private List<Etudiant> etudiants;

    @ManyToOne
    @JoinColumn(name = "encadrant_id")
    private Encadrant encadrant;

}
