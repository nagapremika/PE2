package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest even;
    @Before
    public  void setUp()
    {
        System.out.println("Before");
        even=new EvenNumTest();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        even=null;
    }
    @Test
    public void givenNumberShouldReturnEvenNumber()
    {
//        act
        boolean result=even.isEven(23432);
//        assert
        assertEquals(true,result);
    }
    @Test
    public void givenOneNumberShouldReturnNotEven()
    {
//        act
        boolean result=even.isEven(343);
//        assert
        assertEquals(false,result);
    }

}