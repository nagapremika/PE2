package com.stackroute.pe2;

public class Palindrome {
    public String palindrome(String input) {
        if(input.equals("")) {
            return "Error";
        }
        int length=input.length();

        String output="",result="";
        for(int i=length-1;i>=0;i--)
            output=output+input.charAt(i);
        if(input.equals(output))
            result="Given input is a palindrome";
        else
            result="Given input is not a palindrome";
                 if(length==0)
        result= null;
                 return result;

    }
}
