package fr.dl3c01n.springsql.services;
import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.models.Patient;

import java.util.List;
import java.util.Set;

public interface PatientService  {
    List<Patient> findAll();
    void create(Patient patient);
    void delete(Long id);
    Patient findOne(Long id);
    Set<Patient> findByName(String name, String firstName);
    Set<Nurse> findNursesByPatient(Long id);
}
