package fr.dl3c01n.springsql;

import fr.dl3c01n.springsql.repositories.AddressRepository;
import fr.dl3c01n.springsql.repositories.NurseRepository;
import fr.dl3c01n.springsql.repositories.PatientRepository;
import fr.dl3c01n.springsql.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public AddressService addressService(AddressRepository addressRepository){
        return new AddressServiceImpl(addressRepository);
    }

    @Bean
    public NurseService nurseService(NurseRepository nurseRepository){
        return new NurseServiceImpl(nurseRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }
}
