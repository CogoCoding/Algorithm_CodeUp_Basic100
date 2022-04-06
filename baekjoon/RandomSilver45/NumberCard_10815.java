package baekjoon.RandomSilver45;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i <n;i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i <m;i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        for(int i = 0 ;i <m;i++) {
            int a = bs(arr1, arr2[i]);
            if(i==m-1){System.out.print(a);}
            else{System.out.print(a+" ");}
        }
    }

    private static int bs(int[] arr1, int target) {
        int ans = 0;
        int l = 0;
        int h = arr1.length-1;
        //[XXX]
        // (1) while문에서 l<h 하면 안됨! l<=h 로
        // (2) l = mid 하면 안됨! l = mid+1 로
        // (3) h = mid 하면 안됨! h = mid-1 로
        while(l<=h){
            int mid =  (l+h)/2;
            if(arr1[mid]<target) {
                l = mid+1;
            }else if(target<arr1[mid]){
                h = mid-1;
            }else if(arr1[mid]==target){
                ans=1;
                break;
            }
        }
        return ans;
    }
}
