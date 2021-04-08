package com.inteca.Inteca.service;

import com.inteca.Inteca.model.Klient;

import java.util.List;

public interface KlientService {

    void createCustomer(Klient klient);

    List<Klient> getCustomers();

}
