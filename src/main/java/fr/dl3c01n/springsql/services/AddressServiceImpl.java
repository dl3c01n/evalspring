package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.Address;
import fr.dl3c01n.springsql.repositories.AddressRepository;

import java.util.List;
import java.util.Set;

public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll() {
        return this.addressRepository.findAll();
    }

    public void create(Address address){
        this.addressRepository.save(address);
    }

    public void delete(Long id){
        this.addressRepository.deleteById(id);
    }

    public Address findOne(Long id){
        return this.addressRepository.findById(id).orElse(null);
    }

    public Address update(Address address){
        return this.addressRepository.save(address);
    }

    public Set<Address> findByCityName(String city){
        return this.addressRepository.findByCityName(city);
    }
}
