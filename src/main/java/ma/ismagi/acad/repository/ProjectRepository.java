package ma.ismagi.acad.repository;

import ma.ismagi.acad.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends JpaRepository<Projet,Long> {
}
