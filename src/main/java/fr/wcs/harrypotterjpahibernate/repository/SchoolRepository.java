package fr.wcs.harrypotterjpahibernate.repository;

import fr.wcs.harrypotterjpahibernate.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
}
