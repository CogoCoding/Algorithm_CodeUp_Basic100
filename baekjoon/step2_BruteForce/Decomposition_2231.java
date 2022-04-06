package baekjoon.step2_BruteForce;

import java.util.Scanner;

// 분해합 <-> 생성자
// [R] 미완
public class Decomposition_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        int rest = -1;
        // n의 가장 작은 생성자
        // 즉 n이 216일 때 198의 분해합이 198+1+9+8 = 216 이니까 198이 가장 작은 생성자이다.
        // [거꾸로] 생성자를 넣었을 때 분해합 도출하는 코드
        for (int i = n-1; i > 0; i--) {
            System.out.println("처음 rest : "+rest);
            rest = n - i; //우선 자기 자신 빼고
            String strN2 = Integer.toString(rest); // 자리수 계산 해서
            int jarisu2 = strN2.length();
            for (int j = 0; j < jarisu2; j++) {
                rest -= Integer.parseInt(String.valueOf(strN2.charAt(j)));
                System.out.println(Integer.parseInt(String.valueOf(strN2.charAt(j)))+"뺀 후의 rest = "+rest);
            }
           if(rest == 0){
               if(ans>i){
                   ans = i;
                   System.out.println("ans 교체" + ans);
               }
           }
            System.out.println("-------------------------------");
        }
        if(rest ==n){System.out.println(0);}
        else{System.out.println(ans);}
    }
}

// 내가 만든 코드
//    String strN = Integer.toString(n);
//        int jarisu = strN.length(); // 1의 자리수, 10의자리수, 100의 자리수니까 idx를 10의 제곱수라고 보면 됨
//        int sum = n;
// [거꾸로] 생성자를 넣었을 때 분해합 도출하는 코드
//            for (int i = 0; i < n; i++) {
//                System.out.println("sum : " + Integer.parseInt(String.valueOf(strN.charAt(i))));
//                sum += Integer.parseInt(String.valueOf(strN.charAt(i)));
//                jarisu--;
//                if (jarisu == 0) {
//                    break;
//                }
//            }