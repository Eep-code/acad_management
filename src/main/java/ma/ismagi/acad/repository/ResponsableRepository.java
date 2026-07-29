package ma.ismagi.acad.repository;

import ma.ismagi.acad.entity.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
