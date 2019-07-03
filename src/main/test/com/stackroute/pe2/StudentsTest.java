package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    Student student;
    @Before
    public  void setUp()
    {

        student=new Student();
    }
    @After
    public void tearDown()
    {

        student=null;
    }
    @Test
    public void givenOneArrayAndSizeNumberShouldReturnMinimum()
    {
//        act
        int[] array={12,23,21};
        String result=student.minimum(array,3);
//        assert
        assertEquals("Minimum value is 12",result);
    }
    @Test
    public void givenOneArrayAndSizeShouldReturnMaximum()
    {
//        act
        int[] array={43,22,65};
        String result=student.maximum(array,3);
//        assert
        assertEquals("Maximum value is 65",result);
    }
    @Test
    public void givenOneArrayAndSizeStringShouldReturnAverage()
    {
//        act
        int[] array={20,10,30};
        String result=student.average(array,3);
//        assert
        assertEquals("Average is 20",result);
    }



}