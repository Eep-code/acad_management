package ma.ismagi.acad.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "commentaires")
public class Commentaire {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    private String text;

    @ManyToOne
    @JoinColumn(name = "livrable_id")
    private Livrable livrable;

    @ManyToOne
    @JoinColumn(name = "encadrant_id")
    private User encadrant;
}
