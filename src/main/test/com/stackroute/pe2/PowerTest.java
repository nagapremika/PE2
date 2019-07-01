package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power four;
    @Before
    public  void setUp()
    {
        System.out.println("Before");
        four=new Power();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        four=null;
    }
    @Test
    public void givenIntegerNumberShouldReturnPowerOfFour()
    {
//        act
        String result=four.power(64);
//        assert
        assertEquals("Given number is a power of 4",result);
    }
    @Test
    public void givenIntegerShouldReturnNotPowerOfFour()
    {
//        act
        String result=four.power(44);
//        assert
        assertEquals("Given number is not a power of 4",result);
    }
    @Test
    public void givenNegativeNumberShouldReturnPowerOfFour()
    {
//        act
        String result=four.power(-16);
//        assert
        assertEquals("Given number is a power of 4",result);
    }


}