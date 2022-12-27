//package SWExpertAcademy;
//
//import java.util.Scanner;
//
//public class D4 {
//        static int[][] board;
//        static int[] start;
//        static int[] end;
//        static boolean ans;
//        static int[] dx = {1,0,-1,0};
//        static int[] dy = {0,+1,0,-1};
//        static boolean[][] visited;
//    public static void main(String args[]) throws Exception {
//            StringBuffer sb = new StringBuffer();
//            Scanner sc = new Scanner(System.in);
//            int T = sc.nextInt();
//            sc.nextLine();
//            for (int test_case = 1; test_case <= 1; test_case++) {
//                sb.append("#" + test_case + " ");
//                sb.append("\n");
//                board = new int[16][16];
//                visited = new boolean[16][16];
//                start = new int[2];
//                end = new int[2];
//                ans=false;
//
//                // #1 board 입력 받기
//                for(int i=0;i<16;i++){
//                    String line = sc.next();
//                    System.out.println(line);
//                    System.out.println(line.charAt(1));
//                    for(int j=0;j<16;j++){
//                        char c1 = line.charAt(0);
//                        char c2 = line.charAt(2);
//                        System.out.println(c1+","+c2);
//                        char c =line.charAt(j);
//                        String s = String.valueOf(c);
//                        int su = Integer.parseInt(s);
//                        if(su==2){start[0]=i;start[1]=j;}
//                        if(su==3){end[0]=i;end[1]=j;}
//                        board[i][j]= su;
//                    }
//                    System.out.println();
//                }
//
//                // #2. start 지점 부터 dfs
//                dfs(start[0],start[1]);
//            }
//            System.out.print(sb);
//        }
//
//        public static void dfs(int x,int y){
//            System.out.println("현재 위치 : "+x+" , "+y);
//            if(x==end[0] && y==end[1]){
//                ans=true;
//                return;
//            }
//            visited[x][y]=true;
//            for(int i=0;i<4;i++){
//                int to_x=x+dx[i];
//                int to_y=y+dy[i];
//                if(to_x<0 || to_x>=16||to_y<0 || to_y>=16||visited[to_x][to_y])continue;
//                visited[to_x][to_y]=true;
//                dfs(to_x,to_y);
//                visited[to_x][to_y]=false;
//            }
//        }
//}
