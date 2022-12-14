package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class DbOperations {
    String qry;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //Get count of all registered developers
    int getNumberOfDevelopers(){

        return jdbcTemplate.queryForObject("select count(name) from developer", Integer.class);
    }

//    Get developer name by id
    String getDeveloperNameById(Integer id){

        return jdbcTemplate.queryForObject("select name from developer where id = ?",
                String.class,
                id);
    }


}
