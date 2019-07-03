package com.stackroute.pe2;

public class Factorial {        //This class gives the output as factorial with in the range
    int i, number = 1;
    String result = "";

    public String factorial(int digit) {
        if (digit <=0) {
            result = "Number not accepted";
        }
        else if(digit>0) {
            for (i = 1; i <= digit; i++) {
                for (int j = 1; j <= i; j++)
                    number = number * j;
            }

            if (number == 0) {
                result = "Out of range";
            } else {
                result = "success";
            }
        }
        return result;
    }
}
