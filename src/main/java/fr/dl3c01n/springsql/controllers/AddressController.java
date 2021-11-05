package fr.dl3c01n.springsql.controllers;

import fr.dl3c01n.springsql.models.Address;
import fr.dl3c01n.springsql.services.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/addresses")
@CrossOrigin
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> findAll(){
        return this.addressService.findAll();
    }


    @PostMapping("/create")
    public void create(@RequestBody Address videoGame){
        this.addressService.create(videoGame);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.addressService.delete(id);
    }

    @GetMapping("/{id}")
    public Address findOne(@PathVariable Long id){
        return this.addressService.findOne(id);
    }

    @PutMapping("/update")
    public Address update(Address address){
        return this.addressService.update(address);
    }

    //@GetMapping("/{id}/nurses")

    @GetMapping("/address")
    @ResponseBody
    public Set<Address> findByCityName(@RequestParam String city){
        return this.addressService.findByCityName(city);
    }
}
