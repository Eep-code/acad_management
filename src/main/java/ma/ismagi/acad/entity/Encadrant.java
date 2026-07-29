package ma.ismagi.acad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.ismagi.acad.enums.Role;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "encadrants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Encadrant {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @OneToMany(mappedBy = "encadrant")
    private List<Groupe> groupes = new ArrayList<>();
}