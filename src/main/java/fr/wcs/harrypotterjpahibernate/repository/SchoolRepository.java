package fr.wcs.harrypotterjpahibernate.repository;

import fr.wcs.harrypotterjpahibernate.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
}
