package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.Address;
import fr.dl3c01n.springsql.models.Nurse;
import fr.dl3c01n.springsql.repositories.AddressRepository;
import fr.dl3c01n.springsql.repositories.NurseRepository;

import java.util.List;

public class NurseServiceImpl implements NurseService {
    private NurseRepository nurseRepository;

    public NurseServiceImpl(NurseRepository nurseRepository){
        this.nurseRepository = nurseRepository;
    }

    public List<Nurse> findAll() {
        return this.nurseRepository.findAll();
    }

    public void create(Nurse nurse){
        this.nurseRepository.save(nurse);
    }

    public void delete(Long id){
        this.nurseRepository.deleteById(id);
    }

    public Nurse findOne(Long id){
        return this.nurseRepository.findById(id).orElse(null);
    }
}
