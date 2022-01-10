package com.company.Programmers.Level1;
import java.util.*;

public class Sort_in_DescendingOrder {
    public String solution(String s) {
        String answer ="";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(Character c : arr){
            answer= c+answer;
        }
        return answer;
    }
}
