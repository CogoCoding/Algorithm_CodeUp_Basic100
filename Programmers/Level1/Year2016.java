package com.company.Programmers.Level1;

public class Year2016 {
    public String solution(int a, int b) {
        String[] yoil = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] ilsu = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i =0; i<a-1;i++){
            sum+=ilsu[i];
        }
        sum+=b;
        String answer = "";
        answer += yoil[sum%7];
        return answer;
    }
}
