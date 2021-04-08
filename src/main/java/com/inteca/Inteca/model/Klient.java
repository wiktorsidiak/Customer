package com.inteca.Inteca.model;

import lombok.Data;
import javax.persistence.*;


@Entity(name = "Customer")
@Data
public class Klient {
    @Column(name = "credit_id")
    private long customerCreditId;
    @Column(name = "first_name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "pesel")
    private String pesel;


}
