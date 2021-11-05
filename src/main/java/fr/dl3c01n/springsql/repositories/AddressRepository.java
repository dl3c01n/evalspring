package fr.dl3c01n.springsql.repositories;

import fr.dl3c01n.springsql.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query("SELECT a FROM Address a WHERE a.city = :city")
    public Set<Address> findByCityName(@Param("city") String city);
}
