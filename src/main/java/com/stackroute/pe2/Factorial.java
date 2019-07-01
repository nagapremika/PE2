package com.stackroute.pe2;

public class Factorial {
    int i,number=1;
    public String factorial(int digit)
    {
if(digit<0)
    return "Error";
            for(i=1;i<=digit;i++)
            {
                for(int j=1;j<=i;j++)
                number=number*j;
            }

if(number==0)
    return "Out of range";
else
        return "success";
    }
}
