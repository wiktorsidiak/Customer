package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Klient;
import com.inteca.Inteca.service.KlientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetAllCustomersController {
    private KlientServiceImpl klientService;

    @RequestMapping(value= {"/customers"}, method= RequestMethod.GET)
    public List<Klient> getAllCustomers() {
        return klientService.getCustomers();
    }
}
