package com.stackroute.pe2;

public class PalindromeChecker {        //Checks input is Palindrome or not
    public String palindrome(String input) {
        String output = "", result = "";
        if (input.equals("")) {
            result = "Empty String";

    }
        else {
            int length = input.length();
            for (int i = length - 1; i >= 0; i--) {
                output = output + input.charAt(i);
            }

            if (input.equals(output)) {
                result = "Given input is a palindrome";
            } else {
                result = "Given input is not a palindrome";
            }
        }
                 return result;

    }
}
