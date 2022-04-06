package baekjoon.Step_tree;

import java.util.Scanner;

// 30번
// 1~1023 노드를 bfs 순서로 연결시킴
// a와 b의 최대 공통부모노드
// 1024= 2의 10승

public class Num30_13116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(maxSameRoot(a[i], b[i]));
        }
    }

    private static int maxSameRoot(int a, int b) {
        int max = 0;
        int cnt1 = 0, cnt2 = 0, rest1 = 0, rest2 = 0;
        while (a / 2 == 1) {
            a = a / 2;
            rest2 += a % 2;
            cnt1++;
        }
        while (b / 2 == 1) {
            b = b / 2;
            rest2 += a % 2;
            cnt2++;
        }
        int big, small;
        // # (1) cnt1이 더 클때,(2)cnt2가 더클 때 (3) cnt1==cnt2일때
        if (cnt1 > cnt2) {
            big = cnt1;
            small = cnt2;
        } else if (cnt1 < cnt2) {
            big = cnt1;
            small = cnt1;
        } else {
            return sameCnt(a, b);
        }
        return max;
    }

    private static int sameCnt(int a, int b) {
        int sameMax = -1;
        char bigger = bigger(a,b);
        switch(bigger){
            case 'f':
            case 'b':
            default :
        }
        return sameMax;
    }

    public static char bigger(int a, int b) {
        char bigger;
        if (a > b) {
            bigger = 'f'; //front
        } else if (a < b) {
            bigger = 'b'; //back
        } else {
            bigger = 's'; //same
        }
        return bigger;
    }

}



// 내 풀이
//import java.util.Scanner;

// 30번
// 1~1023 노드를 bfs 순서로 연결시킴
// a와 b의 최대 공통부모노드
// 1024= 2의 10승

//public class Num30_13116 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];
//        for(int i=0;i<n;i++){
//            a[i]= sc.nextInt();
//            b[i]= sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(maxSameRoot(a[i],b[i]));
//        }
//    }
//
//    private static int maxSameRoot(int a, int b) {
//        int max =0;
//        int cnt1=0,cnt2=0,rest1=0,rest2=0;
//        while(a/2==1){
//            a = a/2;
//            rest2 += a%2;
//            cnt1++;
//        }
//        while(b/2==1){
//            b = b/2;
//            rest2 += a%2;
//            cnt2++;
//        }
//        // # (1) cnt1이 더 클때,(2)cnt2가 더클 때 (3) cnt1==cnt2일때
//        if(cnt1>cnt2){
//        }else if(cnt1<cnt2){
//        }else(cnt1==cnt2){
//        }
//        return max;
//    }
//}