package Programmers.Level1;
import java.util.*;

public class SumNumbersOfDigits {

    public static void main(String[] args) {
        System.out.print(solution(123));
    }

    public static int solution(int n) {
            int answer = 0;
            int t = 0;
            String s = Integer.toString(n);
            System.out.println(s);
            for(int i=0; i<s.length();i++){
                t = Integer.parseInt(String.valueOf(s.charAt(i)));
                answer+=t;
            }
            return answer;
        }
}

