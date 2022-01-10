package com.company.Programmers.Level1;

public class PickMiddleWord {
    public String solution(String s) {
        String answer = "";
        // 실수 : (1) s.substring 인덱스 주의 (시작,끝+1) (2) char을 string에 넣으려면 String.valueOf 필요
        answer = (s.length()%2==0) ? s.substring((s.length()/2)-1,(s.length()/2)+1) : String.valueOf(s.charAt((s.length()/2)));
        return answer;
    }
}
