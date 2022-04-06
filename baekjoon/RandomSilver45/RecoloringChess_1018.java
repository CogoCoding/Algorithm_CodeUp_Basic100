package baekjoon.RandomSilver45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 첫 줄 후부터는 w/b/w 교차 여부만 확인
// 틀린 부분은 board에 1로 체크

//[오답] nextLine
public class RecoloringChess_1018 {
    public static void main(String[] args) throws IOException {
        // #Scanner 사용
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

//        // #BufferReader 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int h = Integer.parseInt(st.nextToken());
//        int w = Integer.parseInt(st.nextToken());

        int[][] board = new int[h][w];

        for (int i = 0; i < h; i++) {
            String s = sc.nextLine();
            System.out.println(s);
//            String s = br.readLine();
            if (s.charAt(0) == 'W') {
                for (int j = 1; j < w; j++) {
                    if (j % 2 == 0 && s.charAt(j) != 'W') {
                        board[i][j] = 1;
                    }
                    else if (j % 2 == 1 && s.charAt(j) != 'B') {
                        board[i][j] = 1;
                    }
                }
            }else if(s.charAt(0)=='B') {
                for (int j = 1; j < w; j++) {
                    if (j % 2 == 0 && s.charAt(j) != 'B') {
                        board[i][j] = 1;
                    }
                    else if (j % 2 == 1 && s.charAt(j) != 'W') {
                        board[i][j] = 1;
                    }
                }
            }
            System.out.println();
            System.out.println("-----------------"+i+"-----------------");
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j]);
            }
        }
    }
}
