package baekjoon.RandomSilver45;

import java.util.Scanner;

public class size_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int maxH;
        int maxW;
        int gijunH;
        int gijunW;
        // 1. 일단 다 넣고
        for(int i = 0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=1;
        }
        // 2. 하나씩 꺼내서 나머지들과 비교해서 등수 매기기
        int cnt = 0;
        while(true) {
            if(cnt==n){break;}
            gijunW = arr[cnt][0];
            gijunH = arr[cnt][1];
            for (int i = 0; i < n; i++) {
                if (gijunW < arr[i][0] && gijunH < arr[i][1]) {
                    arr[cnt][2]++;
                }
            }
            cnt++;
        }
        StringBuilder s = new StringBuilder();

        for(int i=0;i<n;i++){
            if(i==n-1){s.append(arr[i][2]);}
            else{s.append(arr[i][2]+" ");}
        }
        System.out.println(s);
    }
}
