package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("beforeAllMethod method executed before any test case");
    }
    @AfterAll
    public static void afterAllMethod(){
        System.out.println("afterAllMethod method executed after all the test case");
    }
    @BeforeEach
    public void setUp(){
        System.out.println("setUp method executed before every test case");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("tearDown method executed after every test case");
    }
    @Test
    public void testAdd(){
        Calculator calculator=new Calculator();
        assertEquals(30,calculator.add(10,20));

    }
    @Test
    public void testGetName() throws Exception {
        Calculator calculator=new Calculator();
        assertEquals("yalabs",calculator.getName("ideyalabs"));
    }
    @Test
    public void testGetNameException(){
        Calculator calculator=new Calculator();
        assertThrows(Exception.class,()->{calculator.getName("id");});
    }
}