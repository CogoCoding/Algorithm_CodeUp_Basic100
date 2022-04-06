package baekjoon.RandomSilver45;

import java.util.Arrays;
import java.util.Scanner;

public class SortInSide_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<10){System.out.println(n);}
        else{
            StringBuilder sb = new StringBuilder();
            char[] cArr = String.valueOf(n).toCharArray();
            Arrays.sort(cArr);
            for(int i = cArr.length-1;i>=0;i--){
                System.out.print(cArr[i]);
            }
        }
    }
}

