package baekjoon.step3_Sort;
// 처음에 n과 n개의 수가 주어지면 오름차순으로 정리
// O(nlogn) 퀵,병합(=합병),힙 정렬 2가지가 있지만 어려운 알고리즘이라 내장된 정렬함수(Arrays.sort()<Collections.sort())로구현
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNums2_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = sc.nextInt();
//        int n = sc.nextInt(); // N장의 카드 중 3장을 골라
//        int[] arr = new int[n]; // 카드 수 배열
//        for(int i = 0 ; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//      시간초과:  Arrays.sort(arr);

        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            ls.add(sc.nextInt());
        }
        Collections.sort(ls); //이게 더
//        for(int i = 0 ; i < n ; i++) {
//            System.out.println(i);
//        }
        for(Integer i : ls){
            System.out.println(i);
        }
    }
}
