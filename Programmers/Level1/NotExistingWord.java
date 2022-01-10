package com.company.Programmers.Level1;

public class NotExistingWord {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        for(int n : numbers){sum+=n;}
        answer-=sum;
        return answer;
    }
}