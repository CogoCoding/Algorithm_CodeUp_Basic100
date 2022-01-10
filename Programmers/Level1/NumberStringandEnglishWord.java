package com.company.Programmers.Level1;
import java.lang.Integer;
import java.util.regex.Pattern;
public class NumberStringandEnglishWord {
     public int solution(String s) {
            if (!Pattern.matches("^[0-9]*$", s)){
                if(s.contains("z")){s = engTonum("zero",s); }
                if(s.contains("one")){s = engTonum("one",s); }
                if(s.contains("two")){s = engTonum("two",s); }
                if(s.contains("three")){s = engTonum("three",s);}
                if(s.contains("four")){s = engTonum("four",s); }
                if(s.contains("five")){s = engTonum("five",s); }
                if(s.contains("x")){s = engTonum("six",s);}
                if(s.contains("seven")){s = engTonum("seven",s);}
                if(s.contains("eight")){s = engTonum("eight",s);}
                if(s.contains("nine")){s = engTonum("nine",s);}
            }
            int answer =  Integer.parseInt(s);
            return answer;
        }

        static String engTonum(String num, String eng){
            String res ="";
            switch(num){
                case "zero": res = eng.replaceAll("zero","0");break;
                case "one": res = eng.replaceAll("one","1");break;
                case "two": res = eng.replaceAll("two","2");break;
                case "three": res = eng.replaceAll("three","3");break;
                case "four": res = eng.replaceAll("four","4");break;
                case "five": res = eng.replaceAll("five","5");break;
                case "six": res = eng.replaceAll("six","6");break;
                case "seven": res = eng.replaceAll("seven","7");break;
                case "eight": res = eng.replaceAll("eight","8");break;
                case "nine": res = eng.replaceAll("nine","9");break;
            }
            return res;
        }

    }