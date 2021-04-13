package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Customer;
import com.inteca.Inteca.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class GetAllCustomersController {
    private final CustomerService klientService;

    @RequestMapping(value= {"/customers"}, method= RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return klientService.getCustomers();
    }
}
