package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "echeances")
public class Echeance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long echeanceId;
    private LocalDateTime dateCahierCharge;
    private LocalDateTime dateV1Rapport;
    private LocalDateTime dateFinalRapport;
    private LocalDateTime dateSoutenance;

    @OneToOne(mappedBy = "echeance")
    private Projet projet;
}
