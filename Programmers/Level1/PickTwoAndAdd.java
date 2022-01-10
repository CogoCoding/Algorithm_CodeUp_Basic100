package com.company.Programmers.Level1;
import java.util.*;

public class PickTwoAndAdd {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                set.add(sum);
            }
        }
        Integer[] answer = set.toArray(new Integer[0]);
        int[] answer2 = Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer2);
        return answer2;
    }
}
