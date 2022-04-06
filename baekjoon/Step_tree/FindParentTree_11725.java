package baekjoon.Step_tree;

// 루트 없는 트리가 있을 때
// 트리 루트 1이라고 하면
// 각 노드의 부모를 구하는 프로그램을 작성하시오
// 노드의 개수 n이 주어지고 1부터 n까지의 노드를 만들고, 1은 늘 루트노드이다.
// 트리상에서 연결된 두 정점들이 주어진다
// 첫째줄부터 2노드부터 n노드까지의 부모 노드 번호를 순서대로 출력한다.
// BFS든 DFS 아무거나 둘 중 하나로
// 참고 링크 https://dhbang.tistory.com/24?category=910553


import java.util.ArrayList;
import java.util.Scanner;

public class FindParentTree_11725 {
    static int n ;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //n개의 노드

        list = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int j = 1; j <n ; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b); //a인덱스에 b저장
            list[b].add(a); //b인덱스에 a저장
        }

        for (int k = 1; k <=n ; k++) {
            // check[k]
            if(!check[k]){ //check 배열에 없으면 dfs(k)를 하면 됨
                dfs(k);
            }
        }

        for (int i = 2; i <=n ; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v] =true; // check배열에 있는데 check
        for (int vv: list[v]) {
            if(!check[vv]){
                parents[vv] = v;
                dfs(vv);
            }

        }

    }

}

