package baekjoon.step3_Sort;
// 처음에 n과 n개의 수가 주어지면 오름차순으로 정리
// O(n) 삽입정렬, 버블정렬 2가지로 구현

import java.util.Scanner;

public class SortNums_2750 {
    public static void main(String[] args) {
        // # 삽입정렬
        // 삽입 정렬 == 비교정렬 == 제자리 swap 정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N장의 카드 중 3장을 골라
        int[] arr = new int[n]; // 카드 수 배열
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int idx =1; idx<arr.length;idx++){
            for(int compareIdx=0;compareIdx<idx;compareIdx++){ //idx이전을 탐색하며 idx보다 작은 수가 있으면 swap
                if(arr[compareIdx]>arr[idx]){
                    int temp= arr[compareIdx];
                    arr[compareIdx]=arr[idx];
                    arr[idx]=temp;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
}