package com.company.Programmers.Level1;

public class YinYang {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(signs[i]){answer+=absolutes[i];}
            else{answer-=absolutes[i];}
        }
        return answer;
    }
}

