package fr.dl3c01n.springsql.controllers;

import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.models.Patient;
import fr.dl3c01n.springsql.services.NurseService;
import fr.dl3c01n.springsql.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/patients")
@CrossOrigin
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> findAll(){
        return this.patientService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Patient patient){
        this.patientService.create(patient);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.patientService.delete(id);
    }

    @GetMapping("/{id}")
    public Patient findOne(@PathVariable Long id){
        return this.patientService.findOne(id);
    }

    @GetMapping("/patient")
    @ResponseBody
    public Set<Patient> findByContainingName(@RequestParam String name, @RequestParam String firstname){
        return this.patientService.findByName(name, firstname);
    }

    @GetMapping("/{id}/nurses")
    @ResponseBody
    public Set<Nurse> findNursesByPatient(@RequestParam Long id){
        return this.patientService.findNursesByPatient(id);
    }
}
