package baekjoon.RandomSilver45;

import java.util.Scanner;

public class CroatiaAlphabet_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i= 0;i<s.length();i++){
            char c = s.charAt(i);
            char c2 ='/';
            if(i<s.length()-1){c2= s.charAt(i+1);}

            switch(c){
                case 'c':
                    cnt++;
                    if (c2 == '='||c2 =='-') {
                        i++;
                    }
                    break;
                case 'd':
                    cnt++;
                    if(c2 == 'z'&&i<s.length()-2&&s.charAt(i+2)=='='){
                            i+=2;
                    }
                    if(c2 == '-'){
                        i++;
                    }
                    break;
                case 'l':
                    cnt++;
                    if(c2=='j'){
                        i++;
                    }
                    break;
                case 'n':
                    cnt++;
                    if(c2=='j'){
                        i++;
                    }
                    break;
                case 's':
                    cnt++;
                    if(c2=='='){
                        i++;
                    }
                    break;
                case 'z':
                    cnt++;
                    if(c2=='='){
                        i++;
                    }
                    break;
                default:
                    cnt++;
                    break;
            }
        }
        System.out.println(cnt);
    }
}


