package com.stackroute.pe2;

public class Power {        //Describes whether number is power of 4 or not
    public String power(int number){
        String string="";
       if(number<=0){
           string="input not allowed";
       }else {
           while (number > 1)
               number = number / 4;
           if (number == 1) {
               string = "Given number is a power of 4";
           } else {
               string = "Given number is not a power of 4";
           }
       }
        return string;
    }
}
