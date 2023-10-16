package org.example.arraysProblems;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//logic-->IV--we will check if next value of i in loop is less than i,ie-(if i<i+1) then we will take it as (-) subtract
    // and if more than i then we will take (+) addition,,, we will also check for the next value always i.e-(i + 1) < s.length()
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((i + 1) < s.length() && getValue(ch) < getValue(s.charAt(i + 1))) {
                sum = sum - getValue(ch);
            } else {
                sum = sum + getValue(ch);
            }
        }
        return sum;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
