package Programmers.Level1;
//미완 테케 2,6
import java.util.*;
// 먼저 1*1 배열을 2진수 2*2배열로 변환
// 두 2*2 배열의 같은 인덱스 비교해서 둘다 공백이면 공백(0)으로, 나머지는 다 벽(1)으로
// 출력형식 맞추기

public class Kakao_SecretMap {

    public static void main(String[] args) {
        int n=6;//5
        int[] arr1={46,33,33,2,31,50};//{9, 20, 28, 18, 11}
        int[] arr2={27,56,19,14,14,10};//{30, 1, 21, 17, 28}
        String[] ans= solution(n,arr1,arr2);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+"|");
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        // 여기까지 decoding
        // int로 받으면 앞에 0이 사라져서 5*5 배열인데 //1001 등이 되기도 한다. 따라서 문자열로 처리
        String[] ans = new String[n];
        int[][] ar1 = new int[n][n];
        int[][] ar2 = new int[n][n];

        String s1 = "", s2="" ;
        // 먼저 1*1 배열을 2진수 2*2배열로 변환
        for (int i = 0; i < n; i++) {
            //2진법 처리 https://21413011.tistory.com/49
            // (1) arr의 원소인 int를 2진법 string으로 바꾸고
            // (2) 그걸 다시 integer.parseInt로 int형변환 후
            // (3) String.format으로 다시 int로 바꿔줌

            s1 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            s2 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr2[i])));

            for (int m = 0;m < s1.length(); m++) {
                ar1[i][m] = Integer.parseInt(s1.charAt(m)+"");
                ar2[i][m] = Integer.parseInt(s2.charAt(m)+"");
            }
        }

        // 두 2*2 배열의 같은 인덱스 비교해서 둘다 공백이면 공백(0)으로, 나머지는 다 벽(1)으로
          for (int k = 0; k < ar1.length; k++) {
            String str="";
            System.out.println();
            for (int f = 0; f < ar1[k].length; f++) {
//                모범답안
                String s = (ar1[k][f] | ar2[k][f])==1 ? "#":" ";
                str=s;
//                내꺼
//                if(ar1[k][f]+ar2[k][f]>0){
//                    str+="#";
//                }else if(ar1[k][f]+ar2[k][f]==0){
//                    str+=" ";
//                }
            }
            System.out.println();
            ans[k]=str;
        }
        return ans;
    }
}

//    for(int i = 0; i < n; i++){
//        ans[i] = ans[i].replaceAll("[1]", "#");
//        ans[i] = ans[i].replaceAll("[0]", " ");
//            s1 = s1.replaceAll("0", " ");
//            s2 = s2.replaceAll("1", "#");
//        }

//모범 답안
// String[] map 만들고
//int[] 이거 2개 먼저
//int[]
// append로 (map1[j]|

// 배열 출력 확인용 코드
// ar1,ar2
//        for (int k = 0; k < ar1.length; k++) {
//        for (int f = 0; f < ar1[k].length; f++) {
//        System.out.print(ar1[k][f]);
//        }
//        System.out.println();
//        }
//        System.out.println("------------------------");
//
//        for (int k = 0; k < ar1.length; k++) {
//        for (int f = 0; f < ar2[k].length; f++) {
//        System.out.print(ar2[k][f]);
//        }
//        System.out.println();
//        }
// ans
//    System.out.println("------------------------");
//            for (int k = 0; k < ans.length; k++) {
//    for (int f = 0; f < ans[k].length; f++) {
//    System.out.print(ans[k][f]);
//    }
//    System.out.println();
//    }
//    System.out.println("------------------------");