package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome reverse;
    @Before
    public  void setUp()
    {
        System.out.println("Before");
        reverse=new Palindrome();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        reverse=null;
    }
    @Test
    public void givenOneStringNumberShouldReturnPalindrome()
    {
//        act
        String result=reverse.palindrome("23432");
//        assert
        assertEquals("Given input is a palindrome",result);
    }
    @Test
    public void givenOneStringShouldReturnNotPalindrome()
    {
//        act
        String result=reverse.palindrome("acba");
//        assert
        assertEquals("Given input is not a palindrome",result);
    }
    @Test
    public void givenEmptyStringShouldReturnAsError()
    {
//        act
        String result=reverse.palindrome("");
//        assert
        assertEquals("Error",result);
    }

}