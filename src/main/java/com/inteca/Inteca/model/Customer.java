package com.inteca.Inteca.model;

import lombok.Data;
import javax.persistence.*;


@Entity(name = "Customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private long CreditId;
    @Column(name = "first_name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "pesel")
    private String pesel;


}
