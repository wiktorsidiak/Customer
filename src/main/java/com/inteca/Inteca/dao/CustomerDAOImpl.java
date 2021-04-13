package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.CustomerMapper;
import com.inteca.Inteca.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
@RequiredArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createCustomer(Customer customer) {
        String SQLCustomer = "INSERT INTO customer (credit_id,first_name, pesel, surname) VALUES (?,?, ?, ?)";
        jdbcTemplate.update(SQLCustomer, customer.getCreditId(),customer.getName(), customer.getPesel(), customer.getSurname());
    }

    @Override
    public List<Customer> getCustomers() {
        String SQL = "SELECT * FROM customer";
        RowMapper<Customer> klientMapper = new CustomerMapper();
        return jdbcTemplate.query(SQL, klientMapper);

    }
}
