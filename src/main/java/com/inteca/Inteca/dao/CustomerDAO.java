package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Customer;
import java.util.List;

public interface CustomerDAO {

    void createCustomer(Customer customer);

    List<Customer> getCustomers();
}
