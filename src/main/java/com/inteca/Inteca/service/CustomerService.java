package com.inteca.Inteca.service;

import com.inteca.Inteca.model.Customer;

import java.util.List;

public interface CustomerService {

    void createCustomer(Customer customer);

    List<Customer> getCustomers();

}
