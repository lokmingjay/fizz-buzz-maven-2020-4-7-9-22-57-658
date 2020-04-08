package com.oocl;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result+= "Buzz";
        }
        return result=="" ? String.valueOf(number): result;
    }
}
