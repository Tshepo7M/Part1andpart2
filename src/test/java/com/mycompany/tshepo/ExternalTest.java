/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tshepo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ExternalTest {
    
    public ExternalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkPassword method, of class External.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String pass = "";
        External instance = new External();
        boolean expResult = false;
        boolean result = instance.checkPassword(pass);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of User method, of class External.
     */
    @Test
    public void testUser() {
        System.out.println("User");
        String user = "";
        External instance = new External();
        boolean expResult = false;
        boolean result = instance.User(user);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class External.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        External instance = new External();
        instance.registerUser();
        fail("The test case is a prototype.");
    }
    
}
