package ma.ismagi.acad.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trace_projet")
public class TraceProjet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traceId;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;
}
