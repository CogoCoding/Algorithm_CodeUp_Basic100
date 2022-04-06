package baekjoon.step1_recursion;

import java.util.Scanner;

public class Factorial_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 1;
        for(int i = a ; i>0 ; i--){
            ans*=i;
        }
        System.out.print(ans);
    }
}
