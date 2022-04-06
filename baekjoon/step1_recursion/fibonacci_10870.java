package baekjoon.step1_recursion;

import java.util.Scanner;

public class fibonacci_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int su1 = 0;
        int su2 = 1;
        int newsu2= 0;


        for(int i=1;i<n;i++){
            newsu2 = su1+su2;
            su1=su2;
            su2= newsu2;
        }
        //[오답] n이 0이나 1일 때는 0과 1을 그대로 출력해야 함!
        if(n==0||n==1){System.out.println(n);}
        else{System.out.println(newsu2);}
    }
}
