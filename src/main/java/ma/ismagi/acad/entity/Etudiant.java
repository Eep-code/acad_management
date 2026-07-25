package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "etudiants")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("ROLE_ETUDIANT")
public class Etudiant extends User {

    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;
}
