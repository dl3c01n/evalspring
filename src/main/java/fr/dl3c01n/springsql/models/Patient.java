package fr.dl3c01n.springsql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String firstName;
    private Date birthDate;
    private String gender;
    private BigInteger socialNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nurse_id", referencedColumnName = "id")
    private Nurse nurse;

}