package baekjoon.Step12_BinarySearch;
// 이진탐색 o(logN)은 무조건 정렬!!!
// mid 와 비교해서 반씩 접어가는 탐색법
// 예로 mid보다 작으면, 그 이상은 뒤로 접어서 아예 안보이고
// 앞 종이에서 다시 mid 정해서 계속 반 접어서 보내버리는

import java.util.Arrays;
import java.util.Scanner;

public class FindNum_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

       Arrays.sort(arr);
        int m = sc.nextInt();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<m;i++){
            if(bs(arr,sc.nextInt())>=0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int bs(int[] arr, int key){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(key<arr[m]){
                h=m-1;
            }else if(key>arr[m]){
                l= m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
