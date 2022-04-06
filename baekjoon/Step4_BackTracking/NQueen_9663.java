package baekjoon.Step4_BackTracking;
import java.util.Scanner;

//https://idea-sketch.tistory.com/29
// 나는 n*n배열로해서
// 하나 놓을때마다 1기입, 불가능해지는 자리를 -1, 미정인 자리를 0으로 설정하고
// 위에서부터 한 행씩 자리 정해서 가능한 경우 찾아보기
// 현재 문제 : remove 후에 다른 remove함수들때문에 queen도 -1표시로 지워질 수 있음. 그래서 queen 위치 확인할거면 다시 출력해주어야 함.
public class NQueen_9663 {
    public static int cnt = 0;
    public static int[][] queen;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        queen = new int[n][2];
        int[][] chess = new int[n][n]; //배열 초기화 0
        FindCandidate(chess);
        UpdateQueen(chess);
        System.out.println("cnt : "+cnt);
        print(chess);
    }

    public static void UpdateQueen(int[][] arr){
        for(int i =0;i<queen.length;i++){
            arr[queen[i][0]][queen[i][1]]=1;
        }
    }

    public static void FindCandidate(int[][] arr){
        // # 일단, 각 행에 하나만 놓을 수 있잖아
        // # 첫 줄에 하나 놓는다 생각하고 그 하나의 위치(=i)를 0~n-1까지 옆으로하나씩 옮겨가며 바꿔보자
        // # 첫 줄에 하나 놓았을 때 둘 째줄에도 놓아야겠지. 그때는 첫 행에 놓은 열 제외한 열에 놓아야겠지.
        // # 그걸 j가 n-1이 될 때까지 반복해야겠지
        // # 우선은 (0,0)에 놓았을 때 가능한 경우의수를 구해보자
        // # 그 후엔 (0,1),(0,2) 등등
        for(int i=0;i<n;i++) {
            int depth = 0;
            // 첫 행부터 마지막 행까지
            while (depth <= n) {
                // 우선 0열에 add해보고
                boolean res = AddQueen(arr, depth, i);
                if(res==true){
                    System.out.print("depth : "+depth + res);
                    cnt++;
                    FindCandidate(arr);
                }
                depth++;
            }
            System.out.println();
            cnt++;
        }
    }

    public static boolean AddQueen(int[][] arr, int x, int y){
        boolean possibility;
        if(arr[x++][y]==-1){
            System.out.println(x+","+y+" 에 queen을 놓을 수 없습니다");possibility= false;
            AddQueen(arr,x,y);
        }
        else{
            arr[x][y]=1;
            queen[cnt][0]=x;
            queen[cnt][1]=y;
            cnt++;
            RemoveCross(arr,x,y);
            RemoveDiagonal(arr,x,y);
            possibility= true;
        }
        return possibility;
    }

    public static void RemoveCross(int[][] arr, int x, int y){
        for(int i = x; i<arr.length;i++){
            for(int j =0;j<arr[x].length;j++){
                arr[x][j]=-1;
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int j =y;j<arr[y].length;j++){
                arr[i][y]=-1;
            }
        }
    }

    public static void RemoveDiagonal(int[][] arr, int x, int y){
        // # 좌측 상단 대각선
        int i = x;
        int j = y;
        while(true){
            i--;
            j--;
            if(i<0|j<0||i==arr.length||j==arr.length){break;}
            arr[i][j]=-1;
        }
        // # 좌측 하단 대각선
        i = x;
        j = y;
        while(true){
            i--;
            j++;
            if(i<0|j<0||i==arr.length||j==arr.length){break;}
            arr[i][j]=-1;
        }
        // # 우측 상단 대각선
        i = x;
        j = y;
        while(true){
            i++;
            j--;
            if(i<0|j<0||i==arr.length||j==arr.length){break;}
            arr[i][j]=-1;
        }
        // # 우측 하단 대각선
        i = x;
        j = y;
        while(true){
            i++;
            j++;
            if(i<0|j<0||i==arr.length||j==arr.length){break;}
            arr[i][j]=-1;
        }
    }

    public static void print(int[][] arr) {
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                int t= arr[i][j];
                if(t==-1)System.out.print(" "+t+"  ");
                if(t==1)System.out.print(" ["+t+"] ");
                else{System.out.print("  "+t+"  ");}
            }System.out.println();
        }
    }
//  for(int i = 0; i<arr.length;i++){
//            while(cnt<=n){
//                if(arr[i][cnt]==0) {
//                    {
//                        System.out.println(i + "," + cnt + " 에 queen을 놓아볼게");
//                        AddQueen(arr, i, cnt );
//                    }
//                }
//            }
//        }
//        System.out.println();
}
