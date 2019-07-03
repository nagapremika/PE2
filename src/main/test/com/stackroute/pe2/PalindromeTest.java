package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    PalindromeChecker reverse;
    @Before
    public  void setUp()
    {

        reverse=new PalindromeChecker();
    }
    @After
    public void tearDown()
    {

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
//        ac
        String result=reverse.palindrome("");
//        assert
        assertEquals("Empty String",result);
    }

}