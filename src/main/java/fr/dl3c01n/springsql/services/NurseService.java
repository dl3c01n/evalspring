package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.Nurse;

import java.util.List;

public interface NurseService {
    List<Nurse> findAll();
    void create(Nurse videoGame);
    void delete(Long id);
    Nurse findOne(Long id);
}
