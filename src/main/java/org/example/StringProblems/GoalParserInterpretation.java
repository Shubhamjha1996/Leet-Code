package org.example.StringProblems;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str = "(al)G(al)()()G";
        System.out.println(interpret(str));
    }

    public static String interpret(String command) {
      return   command = command.replace("()", "o").replace("(", "").replace(")", "");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < command.length(); i++) {
//
//            if (command.charAt(i) == '(' && command.charAt(i + 1) != ')') {
//                sb.append(command.replace("(", "").replace(")", ""));
//
//            }
//        }
//        return sb.toString();

        //if string inputs are fixed
//        String newString = "";
//        for(int i = 0; i < command.length(); i++){
//            if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
//                newString += "o";
//                i += 1;
//            }else if(command.charAt(i) == 'G'){
//                newString += "G";
//            }else{
//                newString+= "al";
//                i += 3;
//            }
//        }
//        return newString;
    }
}
