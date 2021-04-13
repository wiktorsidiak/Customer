package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Customer;
import com.inteca.Inteca.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CreateCustomerController {

    private final CustomerServiceImpl klientService;

    @RequestMapping(value= {"/addCustomer"}, method= RequestMethod.POST)
    public void createCustomer(@RequestBody Customer customer){
        klientService.createCustomer(customer);
    }
}
