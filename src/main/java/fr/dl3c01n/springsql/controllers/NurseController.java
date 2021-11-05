package fr.dl3c01n.springsql.controllers;

import fr.dl3c01n.springsql.models.Address;
import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.services.AddressService;
import fr.dl3c01n.springsql.services.NurseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurses")
@CrossOrigin
public class NurseController {
    private NurseService nurseService;

    public NurseController(NurseService nurseService){
        this.nurseService = nurseService;
    }

    @GetMapping
    public List<Nurse> findAll(){
        return this.nurseService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Nurse nurse){
        this.nurseService.create(nurse);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.nurseService.delete(id);
    }

    @GetMapping("/{id}")
    public Nurse findOne(@PathVariable Long id){
        return this.nurseService.findOne(id);
    }
}
