package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.KlientMapper;
import com.inteca.Inteca.model.Klient;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
@RequiredArgsConstructor
public class KlientDAOImpl implements KlientDAO{

    private JdbcTemplate jdbcTemplate;

    @Override
    public void createCustomer(Klient klient) {
        String SQLCustomer = "INSERT INTO customer (first_name, pesel, surname) VALUES (?, ?, ?)";
        jdbcTemplate.update(SQLCustomer,klient.getName(), klient.getPesel(), klient.getSurname());
    }

    @Override
    public List<Klient> getCustomers() {
        String SQL = "SELECT * FROM customer";
        RowMapper<Klient> klientMapper = new KlientMapper();
        return jdbcTemplate.query(SQL, klientMapper);

    }
}
