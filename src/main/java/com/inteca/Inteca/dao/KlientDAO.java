package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Klient;
import java.util.List;

public interface KlientDAO {

    void createCustomer(Klient klient);

    List<Klient> getCustomers();
}
