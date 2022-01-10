package com.company.Programmers.Level1;
import java.util.*;

public class TernaryReversion {
    public int solution(int n) {
        // n을 3진법수로
        String answer = jinbub(n,3);
        // 3진법 된 n을 거꾸로
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        // 거꾸로 string인 reverse를 int로 바꾸고 10진수로
        int answer2 = Integer.parseInt(reverse,3);
        return answer2;
    }
    public String jinbub(int n,int jinsu){
        String ans = "";
        while(n>0){
            ans = n%jinsu + ans;
            n/=jinsu;
        }
        return ans;
    }
}
