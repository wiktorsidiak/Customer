package com.inteca.Inteca.service;

import com.inteca.Inteca.dao.KlientDAOImpl;
import com.inteca.Inteca.model.Klient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KlientServiceImpl implements KlientService{

    private KlientDAOImpl klientDAO;

    @Override
    public void createCustomer(Klient klient) {
    klientDAO.createCustomer(klient);

    }

    @Override
    public List<Klient> getCustomers() {
        return klientDAO.getCustomers();
    }
}
