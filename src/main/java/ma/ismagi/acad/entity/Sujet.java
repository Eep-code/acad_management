package ma.ismagi.acad.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sujets")
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private LocalDateTime dateCreation;
    private String statut;

    @OneToOne(mappedBy = "sujet")
    private Projet projet;




}
