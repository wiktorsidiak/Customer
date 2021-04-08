package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Klient;
import com.inteca.Inteca.service.KlientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class CreateCustomerController {

    private KlientServiceImpl klientService;

    @RequestMapping(value= {"/addCustomer"}, method= RequestMethod.POST)
    public void createCustomer(Klient klient){
        klientService.createCustomer(klient);

    }
}
