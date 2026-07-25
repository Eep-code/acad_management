package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "soutenances")
public class Soutenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long soutenanceId;
    private LocalDate dateSoutenance;

    @OneToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;

}
