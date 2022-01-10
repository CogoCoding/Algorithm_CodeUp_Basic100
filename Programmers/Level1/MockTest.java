package com.company.Programmers.Level1;
import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        int[] score ={0,0,0};

        for(int i = 0; i < answers.length; i++){
            if(p1[i%p1.length]==answers[i]){score[0]++;};
            if(p2[i%p2.length]==answers[i]){score[1]++;};
            if(p3[i%p3.length]==answers[i]){score[2]++;};
        }

        ArrayList<Integer> answerlist = new ArrayList<Integer>();
        int maxScore = Math.max(score[0],Math.max(score[1],score[2]));
        for(int i = 0; i < score.length; i++){
            if(score[i]==maxScore)answerlist.add(i+1);
        }
        return answerlist.stream().mapToInt(Integer :: intValue).toArray();
    }
}
