package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.Address;

import java.util.List;
import java.util.Set;

public interface AddressService {
    List<Address> findAll();
    void create(Address videoGame);
    void delete(Long id);
    Address findOne(Long id);
    Address update(Address address);
    Set<Address> findByCityName(String city);
}
