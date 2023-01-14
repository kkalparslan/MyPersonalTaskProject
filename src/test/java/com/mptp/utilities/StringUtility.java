package com.mptp.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        if (expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }
}
