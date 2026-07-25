package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "livrables")
public class Livrable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livrableId;
    private String type;
    private LocalDate dateDepot;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;
    @OneToMany(mappedBy = "livrable", cascade = CascadeType.ALL)
    private List<Commentaire> commentaires;
}
