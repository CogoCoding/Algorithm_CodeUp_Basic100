package baekjoon.RandomSilver45;

import java.util.Arrays;
import java.util.Scanner;

public class FindNum_1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            System.out.println(bs(a, b[i]));
        }
    }

    private static int bs(int[] a,int target) {
        int l = 0;
        int r = a.length-1;
        while (l<= r) {
            int mid = l+(r-l)/2;
            if (target == a[mid]) {
                l = mid + 1;
            }
            else if (target > a[mid]) {
                return 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }
}

//        if (target == a[0]) {
//                return 1;
//                }
//                if (target == a[r]) {
//                return 1;
//                }
// 시간초과 (순차탐색)
//    private static void bs(int[] a, int n,int[] b, int m) {
//        for(int i =0 ; i < b.length ; i++){
//            int target = b[i];
//            int res =0;
//            for(int j=0;j<a.length;j++){
//                if(a[j]==target) {
//                    res = 1;
//                }
//            }
//            System.out.print(res);
//        }
//    }

