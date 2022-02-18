package Programmers.Level1;
//미완
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
        // int로 받으면 앞에 0이 사라져서 5*5 배열인데 //1001 등이 되기도 한다. 따라서 문자열로 처리
        String[] ans = new String[n];
        int[][] ar1 = new int[n][n];
        int[][] ar2 = new int[n][n];

        // 먼저 1*1 배열을 2진수 2*2배열로 변환
        for (int i = 0; i < n; i++) {
            //2진법 처리 https://21413011.tistory.com/49
            String s1 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            String s2 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
            System.out.println("1 : "+ s1);
            System.out.println("2 : "+s2);
            for (int m = 0;m < s1.length(); m++) {
                ar1[m][i] = Integer.parseInt(s1.charAt(m)+"");
                ar2[m][i] = Integer.parseInt(s2.charAt(m)+"");
            }
        }
        // 2
        // 두 2*2 배열의 같은 인덱스 비교해서 둘다 공백이면 공백(0)으로, 나머지는 다 벽(1)으로
        for (int k = 0; k < ar1.length; k++) {
            String str="";
            for (int f = 0; f < ar1[k].length; f++) {
                if(ar1[k][f]+ar2[k][f]>0){
                    str+="#";
                }else{
                    str+=" ";
                }
            }
            ans[k]=str;
        }
        return ans;
    }
}


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