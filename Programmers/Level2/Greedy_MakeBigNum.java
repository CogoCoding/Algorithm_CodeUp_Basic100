package com.company.Programmers.Level2;

public class Greedy_MakeBigNum {
    public static void main(String[] args){
        String number = "4177252841";
        int k = 4;
        System.out.print("ans : "+solution(number,k));
    }

    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length();
        int left = len-k;
        int startIdx = 0;
        int maxIdx =0 ;

        while(left>0) {
            char max = 0;
            for (int i = startIdx; i <= len-left; i++) {
                if (number.charAt(i) > max) {
                    maxIdx = i;
                    max = number.charAt(maxIdx);
                }
            }
            startIdx = maxIdx + 1;
            sb.append(max);
            left--;
        }
        return sb.toString();
    }
}

// trial 3 _ 10번 테스트케이스 시간초과 -> StringBr로 정정
// 출력 버전
//     public static String solution(String number, int k) {
//        String answer = "";
//        int len = number.length();
//        int left = len-k;
//        int startIdx = 0;
//        int maxIdx =0 ;
//
//        while(left>0) {
//            char max = 0;
//            System.out.println(number.charAt(startIdx)+"~" + number.charAt(len-left));
//            for (int i = startIdx; i <= len-left; i++) {
//                if (number.charAt(i) > max) {
//                    maxIdx = i;
//                    max = number.charAt(maxIdx);
//                }
//            }
//            System.out.println("found max : " + max);
//            startIdx = maxIdx + 1;
//            answer += max;
//            left--;
//        }
//        return answer;
//    }

// trial 2
// 출력 버전
//public static String solution(String number, int k) {
//    String answer = "";
//    int len = number.length();
//    int left = len-k;
//    System.out.println("len : "+len+" & left : "+left);
//
//    int startIdx = 0;
//    int cnt = 0;
//    int i;
//    int maxIdx =0 ;
//    boolean s = true;
//    while(cnt<left) {
//        System.out.println("\nfor문 현재 cnt : " + cnt + " & startIdx : " + startIdx + " & startMax : " + number.charAt(startIdx));
//        char max = number.charAt(startIdx);
//        for (i = startIdx; i < k + cnt + 1; i++) {
//            System.out.print("[");
//            System.out.print(number.charAt(i));
//            System.out.print("]");
//            if (number.charAt(i) >= max) {
//                maxIdx = i;
//                  if(answer.length()>0&&max==answer.charAt(answer.length()-1)){
//                            maxIdx+=1;
//                        }
//                max = number.charAt(i);
//            }
//        }
//        System.out.println("\nfound max : " + max);
//        answer += max;
//        cnt++;
//        startIdx = maxIdx + 1;
//        System.out.println("startIdx : " + startIdx);
//    }
//    return answer;
//}



// trial 1
//  문제 오독 : 순서 상관없는줄 앎 (ex_ 1924345, k=4면 답:954)
//    public static String solution(String number, int k) {
//        String answer = "";
//        int len = number.length();
//        System.out.println("len"+len);
//
//        Integer[] numArr = new Integer[len];
//        for(int i=0;i<len;i++){
//            numArr[i]=Integer.parseInt(String.valueOf(number.charAt(i)));
//            System.out.print(numArr[i]);
//        }
//        System.out.println();
//        Arrays.sort(numArr,Collections.reverseOrder());
//        for (int i =0; i<len-k; i++) {
//            System.out.print(numArr[i]);
//            answer+=numArr[i];
//            System.out.println();
//        }
//        return answer;
