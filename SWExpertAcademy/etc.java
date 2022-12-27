package SWExpertAcademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class etc {
    public static int[] arr;
    public static int cnt;
    public static boolean fix;
    public static void main(String[] args) {
        List<int[]> pos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            cnt =0;
            int n = sc.nextInt();
            if(n==1){sc.nextInt();}
            else{
                int sum0 = 0;
                int sum1 = 0;
                arr = new int[n];
                for(int i=0;i<n;i++) {
                    int a=sc.nextInt();
                    if(a%2==0) {arr[i]=1;sum0++;}
                    else {arr[i]=-1;sum1++;}
                    if(i>=1&&arr[i]+arr[i-1]!=0){
                        pos.add(new int[]{i-1,i});
                    }
                }

                if(Math.abs(sum0-sum1)>1){cnt=-1;}
                else {
                    fix=false;
                    if(sum0==sum1){
                        //짝수 시작
                        if(arr[0]==1){
                            for(int i=1;i+2<arr.length;i++){
                                if(arr[i]!=0){swap(i+1,i+2);}
                            }
                        }
                        //홀수 시작
                        if(arr[0]==-1){}
                    }
                    else if(sum0>sum1){ // 짝수 테두리
                        //짝수 시작
                        //홀수 시작
                    }
                    else if(sum0<sum1){ // 홀수 테두리
                        //짝수 시작
                        //홀수 시작
                        find(0);
                    }
                }
            }
            System.out.println("#" + test_case+" "+cnt);
        }
        sc.close();
    }

    private static void find(int idx) {
        if(fix==false){
            for(int i=idx;i+2<arr.length-1;i++) {
                if(arr[i]+arr[i+1]!=0){swap(i+1,i+2);find(arr[i+1]);}
            }
            if(arr[arr.length-1]+arr[arr.length-2]==0) {fix=true;}
        }
    }

    public static void swap(int x,int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        cnt++;
    }
}
