package baekjoon.RandomSilver45;
//https://www.acmicpc.net/problem/4673
// d(n) = 양의정수 n이 있을때 n과 n의 각자리수를 더하는 함수
// 1+1 = 2, 2+2 =4 , 4+4=8, 8+8=16,

public class SelfNumber_4673 {
    public static void main(String[] args) {
        int cnt = 0;
        int[] ans = new int[10000];
        for(int i =1;i<10000;i++){
            if(d(i)){ans[cnt++]=i;}

        }
    }

    private static boolean d(int i) {
        boolean res = false;

        return res;
    }
}
