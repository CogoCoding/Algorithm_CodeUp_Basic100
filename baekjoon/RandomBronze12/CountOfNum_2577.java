package baekjoon.RandomBronze12;
import java.util.Scanner;

public class CountOfNum_2577 {
    public static void main(String[] args) {
        Integer[] cnt = new Integer[11];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a*b*c;
        String mulRes = String.valueOf(mul);
        System.out.println(mulRes);
        for(int i = 0;i<mulRes.length();i++){
            int x = Character.getNumericValue(mulRes.charAt(i));
            System.out.print ("num : "+x  + "--- ");
            cnt[x]++;
            print(cnt);
        }
    }
    public static void print(Integer[] arr){
        for(int i : arr){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
