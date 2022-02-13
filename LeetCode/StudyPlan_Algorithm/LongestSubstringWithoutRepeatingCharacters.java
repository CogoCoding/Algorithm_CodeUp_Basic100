package LeetCode.StudyPlan_Algorithm;

import java.util.HashMap;

//unique들 찾아내고
// 그것부터 반복시or문장끝까지 length재기
// max에 저장 후 만약 그것보다 큰게 생기면 max 정정
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s  = "abb"; //"abcabcbb" pwwkew
//        String s1 = "au";
//        String s2 = "aab"; //abb

        System.out.println("ans :  "+solution(s));
//        System.out.println("ans :  "+solution(s1));
//        System.out.println("ans :  "+solution(s2));
    }
// 모범답안
// 중복인데 왜 hashMap,hashSet생각을 못했을까...
    private static int solution(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}

// 오답
//private static int solution(String s) {
//    int max = 0;
//    int i, j,cnt;
//    char c;
//    boolean same =false;
//
//    if(s.length()==0 ){ return 0;}
//
//    for (i = 0; i < s.length(); i++) {
//        cnt=1;
//        System.out.println("[현재 i"+i+"번째 c] : "+s.charAt(i));
//        c = s.charAt(i);
//        for (j = i+1; j < s.length(); j++) {
//            System.out.println("현재 j"+j+"번째 c : "+s.charAt(j));
//            if (s.charAt(j) == c) {
//                System.out.println("same->cnt : "+cnt);
//                same=true;
//                i=j;
//                if(i!=j-1)cnt++;
//                break;
//            }
//            if(j<s.length() -1 && s.charAt(j)==s.charAt(j+1)){
//                System.out.println("same2->cnt : "+cnt);
//                same=true;
//                if(i!=j-1)cnt++;
//                break;
//            }
//            cnt++;
//        }
//        if (max < cnt) {
//            max = cnt;
//            System.out.println("max교체: " + max);
//        }
//    }
//    if(same==false){return s.length();}
//    return max;
//}