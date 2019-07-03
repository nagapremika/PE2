package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial number;
    @Before
    public  void setUp()
    {

        number=new Factorial();
    }
    @After
    public void tearDown()
    {

        number=null;
    }
    @Test
    public void givenNumberShouldReturnSuccess()
    {
//        act
        String result=number.factorial(9);
//        assert
        assertEquals("success",result);
    }
    @Test
    public void givenNumberShouldReturnOutOfRange()
    {
//        act
        String result=number.factorial(13);
//        assert
        assertEquals("Out of range",result);
    }
    @Test
    public void givenNegativeIntegerShouldReturnError()
    {
//        act
        String result=number.factorial(0);
//        assert
        assertEquals("Number not accepted",result);
    }
    @Test
    public void givenZeroIntegerShouldReturnError()
    {
//        act
        String result=number.factorial(-3);
//        assert
        assertEquals("Number not accepted",result);
    }
}