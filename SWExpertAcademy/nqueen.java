//package SWExpertAcademy;
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//public class nqueen {
//    static int n;
//    static int count=0;
//    public static void main(String args[]) throws Exception
//    {
//
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            n = sc.nextInt();
//            if(n==1){
//                System.out.println("#"+test_case+" " +1);
//            }
//            count =0;
//            for(int i=0; i<n; i++){
//                boolean[][] visited = new boolean[n][n];
//                dfs(visited,i,0);
//                System.out.println("대"+n+"번째--------------------");
//            }
//            System.out.println("#"+test_case+" "+count);
//        }
//
//    }
//    static public void dfs(boolean[][] visited, int y ,int stage){
//        System.out.println("Dfs 함수 들어옴");
//        print(visited);
//        if(stage ==n-1){
//            count +=1;
//            System.out.println(" & "+y+" "+ stage);
//            return;
//        }
//        for(int i=0; i<n; ++i){
//            visited[i][stage]=true;
//        }
//        for(int i=0;i<n; ++i){
//            visited[y][i] = true;
//            if(stage+i>=0 && stage+i<n &&y+i>=0&&y+i<n)  visited[y+i][stage+i] = true;
//            if(stage+i>=0 && stage+i<n &&y-i>=0&&y-i<n)  visited[y-i][stage+i] = true;
//            if(stage-i>=0 && stage-i<n &&y+i>=0&&y+i<n)  visited[y+i][stage-i] = true;
//            if(stage-i>=0 && stage-i<n &&y-i>=0&&y-i<n)  visited[y-i][stage-i] = true;
//        }
//        for(int i=0; i<n; ++i){
//            int a = stage+1;
//            System.out.println("for문----------"+i+" "+a+" ");
//            print(visited);
//            if(visited[i][stage+1])continue;
//            else{dfs(visited,i,stage+1);}
//        }
//
//    }
//    public static void print(boolean[][] visited){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                int map = visited[i][j]? 1:0;
//                System.out.print(map+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//
