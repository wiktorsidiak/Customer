package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Klient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KlientMapper implements RowMapper<Klient> {
    @Override
    public Klient mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Klient klient = new Klient();
        klient.setName(resultSet.getString("first_name"));
        klient.setPesel(resultSet.getString("pesel"));
        klient.setSurname(resultSet.getString("surname"));
        return klient;
    }
}
