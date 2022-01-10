package com.company.Programmers.Level1;
import java.util.*;
public class Lottery {
    public int[] solution(int[] lottos, int[] win_nums) {

        int numberOf0 = 0;// 모르는 번호 개수
        int numberOf1 = 0;// 맞은 번호 개수

        for (int i=0 ; i<lottos.length ; i++){
            if (lottos[i]==0){
                numberOf0++;
            }
            else{
                for(int j=0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        numberOf1++;
                    }
                }
            }
        }

        int[] answer = new int[2];
        int Best = (7-numberOf0-numberOf1);
        int Worst = (7-numberOf1);
        if(Best<1)Best=1;
        if(Best>6)Best=6;
        if(Worst<1)Worst=1;
        if (Worst>6)Worst=6;
        answer[0] = Best;
        answer[1]= Worst;
        return answer;
    }
}
