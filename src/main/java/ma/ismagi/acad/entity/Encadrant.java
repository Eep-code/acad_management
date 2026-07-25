package ma.ismagi.acad.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Entity
@Table(name = "encadrants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("ROLE_ENCADRANT")
public class Encadrant extends User{

    @OneToMany(mappedBy = "encadrant")
    private List<Groupe> groupes;

}
