package org.example.StringProblems;

import java.util.Stack;

public class ValidParenthetis {

    public static void main(String[] args) {
        String str="{}()[]";
//        System.out.println(valid(str));
        System.out.println(isValid(str));

        String[] st= str.split("");
//        System.out.println(valid(st));
    }

    public static boolean valid(String[] s){
        int countStart=0;
        int countEnd=0;
        for(int i=0;i<s.length;i++){
            if(s[i]=="[" || s[i]=="{" || s[i]=="("){
                countStart++;

            }else  if(s[i]=="]" || s[i]=="}" || s[i]==")"){
                countEnd++;

            }else if(s == null){
                return false;
            }
        }if(countStart==countEnd){
            return true;
        }
        return false;
    }

    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                s.push(str.charAt(i));
              //  System.out.println(s);
            } else if (s.isEmpty()) {
                return false;
            } else if (s.peek()=='(' && str.charAt(i)==')') {
                s.pop();
            }else if (s.peek()=='{' && str.charAt(i)=='}') {
                s.pop();
            }else if (s.peek()=='[' && str.charAt(i)==']') {
                s.pop();
            }else {
                return false;
            }
        }
        return s.isEmpty();
    }
}
