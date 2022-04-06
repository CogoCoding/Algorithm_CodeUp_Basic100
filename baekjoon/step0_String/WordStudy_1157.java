package baekjoon.step0_String;

import java.util.*;
public class WordStudy_1157 {
    public static void main(String[] args) {
        // #1. 입력받아서 해쉬맵에 정리
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int cnt = map.get(c);
                map.put(c, cnt + 1);
            }
        }
        // #2. max(최대 중복 횟수)와 maxKey(max인 알파벳) 구하기
        int max = -1;
        char maxKey =' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cnt = map.get(c);
            if (max < cnt) {
                max = cnt;
                maxKey = c;
            }
        }

        // #3. 해쉬맵을 순회하며 max= key 인 알파벳의 중복여부 및 알파벳 확인
        // hashmap 해쉬맵 value 값 탐색 참고링크 https://hianna.tistory.com/576 [어제 오늘 내일]
        int maxCnt = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue().equals(max)) {
                maxKey =entry.getKey();
                maxCnt++;
            }
        }
       if(maxCnt==1){System.out.println(maxKey);}
       else{System.out.println("?");}
    }
}

