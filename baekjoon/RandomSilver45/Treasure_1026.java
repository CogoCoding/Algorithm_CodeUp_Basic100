package baekjoon.RandomSilver45;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 배열 a를 재배열해서 s의 최솟값을 구하려면
// b를 재배열하지 말라고 했지만
// 배열을 반환하는 것이 아니므로 그냥 둘다 재배열

public class Treasure_1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        String[] as = br.readLine().split(" ");
        String[] bs = br.readLine().split(" ");

        for(int i =0;i<n;i++){
            a[i]=Integer.parseInt(as[i]);
            b[i]=Integer.parseInt(bs[i]);
        }

        //[중요][새지식]
        // 내림차순 하려면 Comparator.reverseOrder()해야하고
        // Integer[]을 int[]대신 써줘야한다.
        Arrays.sort(b, Comparator.reverseOrder());
        Arrays.sort(a);
        int sum=0;
        for(int i = 0;i<n;i++){
            sum+= a[i]*b[i];
        }
        System.out.print(sum);
    }
}