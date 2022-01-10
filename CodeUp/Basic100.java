### CODE UP
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// # 1082 # 미완
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        for(int i = 1; i <10 ; i++){
            int mul = c*i;
            System.out.println(c+"*"+i+"="+Integer.toHexString(mul));
        }

// # 1081
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=m; j++)
//            {
//                System.out.println(i+" "+j);
//            }
//        }

// # 1080
//        Scanner sc = new Scanner(System.in);
//        int su = sc.nextInt();
//        int sum =0;
//        int i = 1;
//       while(true){
//           sum+=i;
//           if(sum>=su){break;}
//           i++;
//       }
//        System.out.println(i);

// # 1079
//        String input = "zz";
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            input = sc.next();
//            char c = input.charAt(0);
//            if(c=='q'){System.out.println(c);break;}
//            System.out.println(c);
//        }

// # 1078
//        int sum =0;
//        Scanner sc = new Scanner(System.in);
//        int gaesu = sc.nextInt();
//        for(int i=1;i<=gaesu;i++){
//            if(i%2==0)sum+=i;
//        }
//        System.out.println(sum);

// # 1077
//        Scanner sc = new Scanner(System.in);
//        int gaesu = sc.nextInt();
//
//        for(int i=0;i<=gaesu;i++){
//            System.out.println(i);
//    }

// # 1076
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        char c = input.charAt(0);
//        for(int i=97; i<=c; i++){
//            System.out.print((char)i +" ");
//      }

// # 1075
//        Scanner sc = new Scanner(System.in);
//        int gaesu = sc.nextInt();
//
//        for(int i=gaesu;i>0;i--){
//            System.out.println(i-1);
//    }

// # 1074
//        Scanner sc = new Scanner(System.in);
//        int gaesu = sc.nextInt();
//
//        for(int i=gaesu;i<gaesu;i++){
//            int su = sc.nextInt();
//            System.out.println(su);
//    }
//
// # 1073
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            int su = sc.nextInt();
//            if(su==0)break;
//            System.out.println(su);
//        }

// # 1072
//        Scanner sc = new Scanner(System.in);
//        int gaesu = sc.nextInt();
//
//        for(int i=0;i<gaesu;i++){
//            int su = sc.nextInt();
//            System.out.println(su);
//    }

// # 1071
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            int su = sc.nextInt();
//            if(su==0)break;
//            System.out.println(su);
//        }
    }
}
