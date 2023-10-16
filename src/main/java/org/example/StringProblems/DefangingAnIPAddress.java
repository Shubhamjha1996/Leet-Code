package org.example.StringProblems;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
       // return address.replace(".","[.]");
        //or this way
        StringBuilder sb=new StringBuilder();
        for(char c:address.toCharArray()){
            sb.append((c=='.' ? "[.]":c));
        }
        return sb.toString();
    }
}
