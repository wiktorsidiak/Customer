package com.inteca.Inteca.service;

import com.inteca.Inteca.dao.CustomerDAO;
import com.inteca.Inteca.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private  final CustomerDAO customerDAO;

    @Override
    public void createCustomer(Customer customer) {
    customerDAO.createCustomer(customer);

    }

    @Override
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
