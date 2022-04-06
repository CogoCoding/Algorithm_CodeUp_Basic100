package baekjoon.RandomBronze12;
//0, 1, 1, 2, 3, 5, 8
// 거의 다했음 조금만 다시 보자
// 피보나치 n=1일 때 0부터 시작하는 거임
import java.util.Scanner;

public class Fibonacci_Num2_2748 {
    public static int cnt;
    public static int su1;
    public static int su2;
    public static void main(String[] args) {
        int n=0;
        while(true){
            cnt =0;
            su1 = 0;
            su2 = 1;
            while(true){
                if(n==1||n==2){
                    System.out.println(su1);
                    for(int i = 0;i<n;i++){
                        fibo(su1,su2);
                   }
                    n++;break;
               }
            fibo(su1,su2);
            if(cnt==n){
                System.out.println(+su1);
                n++;break;}
            }
        if(n==20)break;
        }
    }
    public static void fibo(int a,int b){
        cnt++;
        int temp;
        temp=a+b;
        su1=b;
        su2=temp;
    }
}

// 출력.ver
//public class Fibonacci_Num2_2748 {
//    public static int cnt;
//    public static int su1;
//    public static int su2;
//    public static void main(String[] args) {
//        int n=0;
//        while(true){
//            cnt =0;
//            su1 = 0;
//            su2 = 1;
//            while(true){
//                if(n==1||n==2){
//                    System.out.println(su1);
//                    for(int i = 0;i<n;i++){
//                        fibo(su1,su2);
//                   }
//                 break;
//               }
//            fibo(su1,su2);
//            if(cnt==n){
//                System.out.println(+su1);
//                n++;break;}
//            }
//        if(n==20)break;
//        }
//    }
//    public static void fibo(int a,int b){
//        cnt++;
//        int temp;
//        temp=a+b;
//        su1=b;
//        su2=temp;
//    }
//}


// 제출용.ver
//import java.util.Scanner;
//public class Fibonacci_Num2_2748 {
//    public static int cnt;
//    public static int su1;
//    public static int su2;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        cnt =0;
//        su1 = 0;
//        su2 = 1;
//        while(true){
//            if(n==0){System.out.println(0);break;}
//            if(n==1||n==2){
//                for(int i = 0;i<n;i++){
//                    fibo(su1,su2);
//                }
//                System.out.println(su1);
//                break;
//            }
//            fibo(su1,su2);
//            if(cnt==n){
//                System.out.println(+su1);
//                break;}
//        }
//    }
//    public static void fibo(int a,int b){
//        cnt++;
//        int temp;
//        temp=a+b;
//        su1=b;
//        su2=temp;
//    }
//}

//제출용2.ver
//import java.util.Scanner;
//public class Fibonacci_Num2_2748 {
//    public static int cnt;
//    public static int su1;
//    public static int su2;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        cnt = 0;
//        su1 = 0;
//        su2 = 1;
//        while(true){
//            if(n==1||n==2){
//                System.out.println(su1);
//                for(int i = 0;i<n;i++){
//                    fibo(su1,su2);
//                }
//                break;
//            }
//            fibo(su1,su2);
//            if(cnt==n){
//                System.out.println(+su1);
//                break;}
//        }
//    }
//    public static void fibo(int a,int b){
//        cnt++;
//        int temp;
//        temp=a+b;
//        su1=b;
//        su2=temp;
//    }
//}