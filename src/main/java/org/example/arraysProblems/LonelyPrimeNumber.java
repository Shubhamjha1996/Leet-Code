package org.example.arraysProblems;


import java.util.*;

public class LonelyPrimeNumber {
    public static void main(String[] args) {
        int[] arr = {11, 3, 5, 7, 4, 9, 78};// prime number which does not repeat or +1 value  and -1 value is not there
        Arrays.sort(arr);//3,4,5,7,9,11,78
        System.out.println(lonelyPrime(arr));

    }

    public static Set<Integer> lonelyPrime(int[] arr) {
        Set<Integer> lonePrime = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                if (arr[i] + 1 == arr[j]) {
                    break;

                }
                if (arr[i] - 1 == arr[j]) {
                    break;
                }
                if (isPrime(arr[i])) {
                    lonePrime.add(arr[i]);


                }
            }
        }
        return lonePrime;
    }

    public static boolean isPrime(int number) {
       // for (int i = 2; i <= number / 2; i++) {
            //or more efficiently to till sqrt on number
            for (int i = 2; i <= Math.round(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
