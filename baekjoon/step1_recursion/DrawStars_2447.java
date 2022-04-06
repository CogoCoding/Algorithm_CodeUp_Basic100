package baekjoon.step1_recursion;

//미완
import java.util.Scanner;

// n은 3의 거듭제곱이고
// n/3의 재귀적인 패턴으로 별을 찍는데
// 먼저 3인 경우와 3이상인 경우를 분리
// 3이상인 경우 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태
// 만약 3*3으로 돌리다가 공백은 왜생기는건지는 위 문장 구현하다보면 나옴

public class DrawStars_2447{
    static char[][] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];
        int exp = (int) Math.sqrt(n); //exception
//        if(n==1){arr[][]=

//
    }
}

//3인 경우
//for(int i =0;i<n;i++){
//            if(i%3==1){ //[* *][* *]
//                for(int j =0;j<n;j++) {
//                    if(j%3==1){System.out.print(" ");}
//                    else{System.out.print("*");}
//                }
//            }else {
//                for (int j = 0; j < n; j++) {
//                    System.out.print("*");
//                }
//            } System.out.println();
//        }

// 모범답안
//import java.util.Scanner;
//
//    public class Main {
//        static char[][] arr;
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int N = in.nextInt();
//
//            arr = new char[N][N];
//
//            star(0, 0, N, false);
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    sb.append(arr[i][j]);
//                }
//                sb.append('\n');
//            }
//            System.out.print(sb);
//        }
//
//        static void star(int x, int y, int N, boolean blank) {
//
//            // 공백칸일 경우
//            if (blank) {
//                for (int i = x; i < x + N; i++) {
//                    for (int j = y; j < y + N; j++) {
//                        arr[i][j] = ' ';
//                    }
//                }
//                return;
//            }
//
//            // 더이상 쪼갤 수 없는 블록일 때
//            if (N == 1) {
//                arr[x][y] = '*';
//                return;
//            }
//
//		/*
//		   N=27 일 경우 한 블록의 사이즈는 9이고,
//		   N=9 일 경우 한 블록의 사이즈는 3이듯
//		   해당 블록의 한 칸을 담을 변수를 의미 size
//
//		   count는 별 출력 누적을 의미
//		 */
//
//            int size = N / 3;
//            int count = 0;
//            for (int i = x; i < x + N; i += size) {
//                for (int j = y; j < y + N; j += size) {
//                    count++;
//                    if (count == 5) { // 공백 칸일 경우
//                        star(i, j, size, true);
//                    } else {
//                        star(i, j, size, false);
//                    }
//                }
//            }
//        }
//    }
//3보다 큰 경우 내 오답

//        for(int i =0;i<n;i++){
//            if(i%3==1){ //[* *][* *]
//                for(int j =0;j<n;j++) {
//                    // 여기부터 3 이상 수 가운데 구멍
//                    if(n>3){
//                        if( exp<=i && i< 2*exp && exp<= j && j<2*exp ){
//                            if(exp==i){System.out.print("exp : "+exp + "i : "+i+" j : "+j);}
//                            System.out.print(" ");
//                        }
//                        else if(j%3==1){System.out.print(" ");}
//                        else{System.out.print("*");}
//                    }
//                    if(j%3==1){
//
//                        System.out.print(" ");
//                    }
//                    else{System.out.print("*");}
//                }
//            }else {
//                for (int j = 0; j < n; j++) {
//                    System.out.print("*");
//                }
//            } System.out.println();
//        }

