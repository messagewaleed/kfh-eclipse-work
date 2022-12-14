package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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


//    Get all developers
    List<Developer> getAllDevelopers(){

        return jdbcTemplate.query("select * from developer", new DeveloperMapper());
    }

//    Get all details of a developer by id
    Developer getDeveloperDetailsById(Integer id){
        return jdbcTemplate.queryForObject(
                "select * from developer where id = ?",
                new DeveloperMapper(),
                id
        );
    }

//    Add a new Developer
    void addNewDeveloper(Developer developer){

        jdbcTemplate.update(
                "insert into developer (name, skills) values (?, ?)",
                developer.getName(),
                developer.getSkills());

        System.out.println("Developer registered...");
    }



//    Create a sub class of RowMapper
    class DeveloperMapper implements RowMapper<Developer>{

    @Override
    public Developer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Developer(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("skills")
        );

//        developer.setId(resultSet.getInt("id"));
//        developer.setName(resultSet.getString("name"));
//        developer.setSkills(resultSet.getString("skills"));

    }
}



}
