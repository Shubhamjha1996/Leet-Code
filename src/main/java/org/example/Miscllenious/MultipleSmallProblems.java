package org.example.Miscllenious;

import java.io.IOException;
import java.util.*;

public class MultipleSmallProblems {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String haystack = "leetcode";
        String needle = "like";

       // System.out.println("index is="+haystack.indexOf(needle));


        int[] arr={1,2,3,4,5};
        Arrays.sort(arr);
//        int element=3;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(removeElementFromArray(arr,element)));

//        String s="rRiya";
//        s=s.toLowerCase();
//        System.out.println(duplicateString(s));

//        String str="This is my world";
//        System.out.println(reverseString(str));
//        String str="mom";
//        System.out.println(palindrome(str));
        String str1 = "axe";
        String str2 = "abcdcaf";
        //   System.out.println(anagramCheck(str1,str2));
          System.out.println(firstUniqueOccur(str2));




        List<Student> list = new ArrayList<>();
        list.add(new Student("shubham", "jhg@gmail", 80, "M"));
        list.add(new Student("shivam", "abc@gmail", 40, "M"));
        list.add(new Student("shreya", "she@gmail", 90, "F"));



        int i=0;
        int j=0;
        double per=0;
        double percentage=0;
        double femalePercent=0;
        for (Student s : list) {
            if (s.getGender() == "M") {
                i = i + 1;
                per=s.getRollNo()/100+percentage;
                percentage=per;
            }
            if (s.getGender() == "F") {
                j = j + 1;
                per=s.getRollNo()/100+femalePercent;
                femalePercent=per;
            }
        }
//        System.out.println("per male:"+percentage);
//        System.out.println("per female:"+femalePercent);
//        System.out.println("No of male :" + i);
//        System.out.println("No of female :" + j);
    }

    public static int firstUniqueOccur(String str) {
       // char[] charStr = str.toCharArray();
        //abcdcaf
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return str.indexOf(i);
            }
//        int first = charStr[0];
//        int second = charStr[1];
//        if (first != second) {
//            return (char) first;

        }


        return -1;
    }

    public static boolean anagramCheck(String str1, String str2) {
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        return Arrays.equals(charStr1, charStr2);
    }

    public static String palindrome(String str) {
        if (str == "" && str.equals(null)) {
            return "No String found";
        }
        StringBuffer sf = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            Character c = str.charAt(i);

            sf.append(c);
        }
        if (sf.toString().equals(str)) {
            return "This is a Palindrome";
        }
        return "This is not the palindrome";
    }


    public static String reverseString(String str) {
        String s[] = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
        return s.toString();
    }

    public static String duplicateString(String str) {
        Set<Character> s = new HashSet<>();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!s.contains(c)) {
                s.add(c);
                sf.append(c);
            }
        }
        return sf.toString();
    }

    public static int[] removeElementFromArray(int[] arr, int element) {
        int[] newArray = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != element) {
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }

}
