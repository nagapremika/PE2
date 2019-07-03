package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTester even;
    @Before
    public  void setUp()
    {

        even=new EvenNumTester();
    }
    @After
    public void tearDown()
    {

        even=null;
    }
    @Test
    public void givenNumberShouldReturnEvenNumber()
    {
//        act

//        assert
        assertTrue(even.isEven(23432));
    }
    @Test
    public void givenOneNumberShouldReturnNotEven()
    {
//        act

//        assert
        assertFalse(even.isEven(343));
    }

}