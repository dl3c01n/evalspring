package fr.dl3c01n.springsql.repositories;

import fr.dl3c01n.springsql.models.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Long> {
}
