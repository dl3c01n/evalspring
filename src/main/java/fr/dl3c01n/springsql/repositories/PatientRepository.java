package fr.dl3c01n.springsql.repositories;

import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query("SELECT p FROM Patient p WHERE p.name = :name AND p.firstName = :firstName")
    public Set<Patient> findByNameContainingWord(@Param("name") String name, @Param("firstName") String firstName);

    @Query("SELECT n FROM Nurse n Patient n WHERE Patient.id = :patientid")
    public Set<Nurse> findNursesByPatient(@Param("patientid") Long id);
}
