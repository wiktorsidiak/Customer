package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setCreditId(resultSet.getLong("credit_id"));
        customer.setName(resultSet.getString("first_name"));
        customer.setPesel(resultSet.getString("pesel"));
        customer.setSurname(resultSet.getString("surname"));
        return customer;
    }
}
