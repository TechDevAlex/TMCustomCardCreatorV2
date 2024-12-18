package com.techdevalex.tmcardeditor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;


    

// Load the entire application for this test and use the test  properties (for now there is no testdb, so they are the same as the normal ones)
@SpringBootTest("application-test")

class TmcardeditorIntegrationTests {


    // Inject an instance of JdbcTemplate into the Spring context
    // JdbcTemplate is just a Spring Java Database Connectivity implementation which makes the JDBC API simpler to use
    @Autowired
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    // Mark as testmethod so Junit knows its part of the test suite & for test reports etc.
    @Test

    // Write the testmethod, use the SQL "SELECT 1". This doesn't actually query anything, it just tries to connect to the db and returns 1 if successful
    // execute the query using the jdbc template
    // assert that 1 is returned
    void testDatabaseConnection(){
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        assertEquals(1, result);
    }


}