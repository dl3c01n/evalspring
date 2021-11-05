package fr.dl3c01n.springsql.services;
import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.models.Patient;
import fr.dl3c01n.springsql.repositories.PatientRepository;

import java.util.List;
import java.util.Set;

public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    public void create(Patient patient){
        this.patientRepository.save(patient);
    }

    public void delete(Long id){
        this.patientRepository.deleteById(id);
    }

    public Patient findOne(Long id){
        return this.patientRepository.findById(id).orElse(null);
    }

    public Set<Patient> findByName(String name, String firstName){
        return this.patientRepository.findByNameContainingWord(name, firstName);
    }

    public Set<Nurse> findNursesByPatient(Long id){
        return this.patientRepository.findNursesByPatient(id);
    }
}
