package baekjoon.RandomBronze12;

import java.util.Scanner;

public class SangSu_2908 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int n2 = sc.nextInt();
       n= reverse(n);
       n2 = reverse(n2);
       int max;
       if(n>n2)System.out.println(n);
       else System.out.println(n2);
    }

    private static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(n);
        for(int i = s.length()-1;i>=0;i--){
            String c = String.valueOf(s.charAt(i));
            sb.append(c);
        }
        return Integer.valueOf(String.valueOf(sb));
    }
}

