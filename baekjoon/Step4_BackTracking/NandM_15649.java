package baekjoon.Step4_BackTracking;


import java.util.Scanner;

// 1~n까지 수중에 m개를 가진 수열 출력
// stack이 깊이 우선 탐색이고, queue가 넓이 우선 탐색이라구..?
// stack에 자식 노드를 넣기전에 유망한지 확인 후 2,3에 queen을 넣어보기
public class NandM_15649 {
    public static int n;
    public static int m;
    public static int[] arr1;
    public static int[] arr2;
    public static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[m];
        for(int i=1;i<=n;i++){
            arr1[i-1]=i;
        }
        visit = new boolean[n];
        dfs(n,m,0);
    }

    public static void dfs(int n,int m,int depth){
        //depth=m이면 break 하고 return하기
        if(depth == m){
            for(int val:arr2){System.out.print(val+" ");}
            return;
        }

        for(int i=0;i<n;i++){
            if(visit[i]==false){
                visit[i] = true;
                arr1[depth]=i+1;
                dfs(n,m,depth+1);
                visit[i]=false;
            }
        }
    }
    public static void print(int[] arr) {
        for(int i = 0; i<arr.length;i++){
             System.out.print(arr[i]);
        }
    }
}