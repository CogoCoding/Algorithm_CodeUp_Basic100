package com.company.Programmers.Level1;
import java.util.Arrays;

public class NumberAtK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++ ){
            int[] array2 = array.clone();
            int start = commands[i][0]-1;
            int end = commands[i][1];
            Arrays.sort(array2,start,end);
            int index =commands[i][0]+commands[i][2]-2;
            answer[i] = array2[index];
        }
        return answer;
    }
}
