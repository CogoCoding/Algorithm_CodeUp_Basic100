package com.company.Programmers.Level1;

public class DivisorCount {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i =left ; i<=right;i++){
            if(yaksuGaesu(i)%2==0){answer+=i;}
            else{answer-=i;}
        }
        return answer;
    }
    public int yaksuGaesu(int su){
        int cnt =0;
        for(int i =1 ; i<=su ; i++){
            if(su%i==0)cnt++;
        }
        return cnt;
    }
}
