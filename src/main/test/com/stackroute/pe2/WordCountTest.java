package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class WordCountTest {
    WordCount count;
    @Before
    public  void setUp()
    {
        System.out.println("Before");
        count=new WordCount();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        count=null;
    }
    @Test
    public void givenOneFileNumberShouldReturnCount() throws IOException {
//        act
        String result=count.reader("/home/premika/Desktop/apple");
//        assert
        assertEquals("This-1 is-1 apple-2 ",result);
    }

}