package ma.ismagi.acad.repository;

import ma.ismagi.acad.entity.Livrable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}
