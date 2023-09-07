package com.amazon.utilities;

public class Assertions {
    public static String verifyEquals(String actual,String expected){
        if (actual.equals(expected)){
            return "PASS";
        } else return "FAIL";
    }
}
