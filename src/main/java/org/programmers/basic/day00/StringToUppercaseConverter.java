package org.programmers.basic.day00;

public class StringToUppercaseConverter {

    static String solution(String myString) {
        return myString.toUpperCase();
    }
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        System.out.println("[ result ] : " +  solution(myString));
    }
}
