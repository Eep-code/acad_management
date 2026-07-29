package ma.ismagi.acad.repository;

import ma.ismagi.acad.entity.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectJpaRepository extends JpaRepository<Sujet, Long> {

    List<Sujet> findByEtudiantId(Long etudiantId);

}
