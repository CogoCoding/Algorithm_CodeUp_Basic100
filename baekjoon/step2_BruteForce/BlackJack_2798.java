package baekjoon.step2_BruteForce;

// brute-force 기본 완전 탐색 알고리즘
// 블랙잭
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 첫줄에 나온
//에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합
// 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
// 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

// 모범답안 보고 풂
// 그냥 정말 통째로 무식하게 완전 탐색
public class BlackJack_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N장의 카드 중 3장을 골라
        int m = sc.nextInt(); // m의 천장 함수인 수
        int[] arr = new int[n]; // 카드 수 배열
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int ans = search(arr,n,m);
        System.out.println(ans);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < N - 2; i++) {
            // 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
            for (int j = i + 1; j < N - 1; j++) {
                // 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
                for (int k = j + 1; k < N; k++) {
                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];
                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if (M == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신 ( 0에서 부터 temp대부분을 받음)
                    if(result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        // 모든 순회를 마치면 result 리턴
        return result;
    }
}