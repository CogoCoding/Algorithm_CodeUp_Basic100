package baekjoon.RandomBronze12;
//[XXX] 소수 나눗셈으로 소수점 아래까지 구할 땐 1.0을 곱해주어 double형으로 변환해준다
import java.util.Scanner;
public class average_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        double[] arr = new double[a];
        int max = 0;
        double sum = 0;
        for(int i = 0; i<a;i++){
            b = sc.nextInt();
            arr[i]=b*1.0;
            if(b>max){max=b;}
        }
        for(int i =0;i<a;i++){
            double score = arr[i]/max*100;
            sum+=score;
        }
        System.out.println(sum/a);
    }
}
