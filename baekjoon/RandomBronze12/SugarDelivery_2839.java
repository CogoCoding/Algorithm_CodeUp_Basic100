package baekjoon.RandomBronze12;

import java.util.Scanner;
//먼저 cnt5최대치로해보고 안되면 하나씩 줄이고 cnt3을 늘려보기
// 5a+3b = sum으로 두고
// a+b가 최소치가 되는 것을 답
// 가능한 a,b가 없으면 -1 반환

public class SugarDelivery_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%5)%3 != 0) {
            System.out.println(-1);
        }else {
            if(num%5 != 0) {
                System.out.println((num/5)+(num%5)/3);
            }else {
                System.out.println(num/5);
            }
        }
    }
}

// 모범답안
// public static void main(String[] args){
//    Scanner scan = new Scanner(System.in);
//    int num = scan.nextInt();
//
//    if(num%5 == 0 ) {
//        System.out.println(num/5);
//        return;
//    }else{
//        // # 여기서 몫 = maxCnt5 으로 설정하구 1씩 줄여가면서 나머지를 3으로 나눠서 나오면 return
//        int quotient = num/5;
//        for(int i=quotient; i>0; i--) { //몫이 0보다 클때까지
//            int temp = num-(i*5);
//            if(temp%3==0) {
//                System.out.println(i+(temp/3));
//                return;
//            }
//        }
//    }
//    if(num%3==0) {
//        System.out.println(num/3);
//    }else {
//        System.out.println(-1);
//    }
//    return;
//}

// 내 오답 제출.ver
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = sc.nextInt();
//
//        int maxCnt5= sum/5;
//        int maxCnt3 = sum/3;
//        int smallest  = maxCnt3+maxCnt5;
//        if(sum%5==0){smallest = maxCnt5;}
//        else if(sum%3==0&&maxCnt3<maxCnt5){smallest = maxCnt3; }
//
//
//        for (int i = 0; i <= maxCnt5; i++) {
//            for (int j = 0; j <= maxCnt3; j++) {
//                int sum35 = (5 * i) + (3 * j);
//                if (sum35 == sum) {
//                    if (i + j < smallest) {
//                        smallest = i + j;
//                    }
//                }
//            }
//        }
//        if(smallest!=maxCnt5+maxCnt3){System.out.print(smallest);}
//        else{System.out.print(-1);}
//    }

// 내 오답 출력.ver
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = sc.nextInt();
//        int maxCnt5= sum/5;
//        int maxCnt3 = sum/3;
//        int smallest  = maxCnt3+maxCnt5;
//        System.out.println(maxCnt5+" & "+maxCnt3);
//        if(sum%5==0){smallest = maxCnt5;System.out.println("smallest1 : "+smallest);}
//        else if(sum%3==0&&maxCnt3<maxCnt5){smallest = maxCnt3; System.out.println("smallest1 : "+smallest);}
//
//        for (int i = 0; i <= maxCnt5; i++) {
//            for (int j = 0; j <= maxCnt3; j++) {
//                int sum35 = (5 * i) + (3 * j);
//                System.out.println(i + ", " + j + " -> " + sum35);
//                if (sum35 == sum) {
//                    System.out.println("same sum");
//                    if (i + j < smallest) {
//                        smallest = i + j;
//                        System.out.println("smallest : "+smallest);
//                    }
//                }
//            }
//        }
//
//        if(smallest!=maxCnt5+maxCnt3){System.out.print(smallest);}
//        else{System.out.print(-1);}
//    }