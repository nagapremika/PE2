package com.stackroute.pe2;

public class Power {
    public String power(int number){
        String string="";
        number=Math.abs(number);
        while(number>1)
            number=number/4;
        if(number==1)
        string="Given number is a power of 4";
        else
            string="Given number is not a power of 4";
        return string;
    }
}
