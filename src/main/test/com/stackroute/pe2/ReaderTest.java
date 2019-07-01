package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class ReaderTest {
    Reader read;
    @Before
    public  void setUp()
    {
        System.out.println("Before");
        read=new Reader();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        read=null;
    }
    @Test
    public void givenOneFileNumberShouldReturnMessageRead() throws IOException
    {
//        act
        String result=read.reader("/home/premika/Desktop/apple");
//        assert
        assertEquals("Read",result);
    }
    @Test
    public void givenOneFileShouldReturnEmptyFile() throws IOException {
//        act
        String result=read.reader("/home/premika/Desktop/empty");
//        assert
        assertEquals("Empty File",result);
    }
    @Test
    public void givenFileThatDoesnotExistsShouldReturnAsError() throws IOException {
//        act
        String result = read.reader("/fan/desktop");
//        assert
        assertEquals("File Doesnot exists",result);
    }



}