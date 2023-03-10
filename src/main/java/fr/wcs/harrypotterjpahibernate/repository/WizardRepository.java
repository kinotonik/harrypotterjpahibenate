package fr.wcs.harrypotterjpahibernate.repository;

import fr.wcs.harrypotterjpahibernate.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardRepository extends JpaRepository<Wizard, Long> {
}
