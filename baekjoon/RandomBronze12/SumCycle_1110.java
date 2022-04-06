package baekjoon.RandomBronze12;
// 0보다 크거나 같고, 99보다 작거나 같은 정수일 때
// 문제와 예제이해못함
import java.util.Scanner;
public class SumCycle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int su = 0;
        while(true) {
            n = ((n%10)*10)+((n/10)+(n%10)%10);
            cnt++;
            if(su==n){break;}
        }
    }
}
