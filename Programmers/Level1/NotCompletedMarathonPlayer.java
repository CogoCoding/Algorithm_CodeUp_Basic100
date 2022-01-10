package com.company.Programmers.Level1;
import java.util.HashMap;

public class NotCompletedMarathonPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<participant.length;i++){
            String Key = participant[i];
            int Value = 0;
            if(map.containsKey(Key)){
                Value =map.get(Key)+1;
            }else{Value++;}
            map.put(Key,Value);
        }
        for(int i=0;i<completion.length;i++){
            String Key1 = completion[i];
            int Value1 = 0;
            if(map.containsKey(Key1)){
                Value1 =map.get(Key1)-1;
            }
            map.put(Key1,Value1);
        }
        for(String key : map.keySet()){
            Integer value = map.get(key);
            if(value>0){
                answer = answer.concat(key);
            }
        }
        return answer;
    }
}
