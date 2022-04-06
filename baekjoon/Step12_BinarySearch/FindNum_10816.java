//package baekjoon.Step12_BinarySearch;
////https://st-lab.tistory.com/267
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class FindNum_10816 {
//    public static void main(String[] args) throws IOException {
//            // [배움]BufferReader은 br.readLine할 때 IOExeption이 필수이다.
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//            int n = Integer.parseInt(br.readLine());
//            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            for(int i=0; i<n;i++){
//                int key = Integer.parseInt(st.nextToken());
//                map.put(key,map.getOrDefault(key,0)+1);
//            }
//            int m = Integer.parseInt(br.readLine());
//            StringBuilder sb= new StringBuilder();
//            st = new StringTokenizer(br.readLine()," ");
//            for(int i =0;i<m;i++){
//                int key = Integer.parseInt(st.nextToken());
//                sb.append(map.getOrDefault(key,0)).append(' ');
//            }
//            System.out.println(sb);
//    }
//
//            Scanner sc = new Scanner(System.in);
//            // # 여기서 sg가 갖고있는 수 하나씩 가져와서 탐색
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for(int i = 0; i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            Arrays.sort(arr);
//
//            int m = sc.nextInt();
//            int[] ans = new int [m];
//            int[] sg = new int [m];
//            for(int j =0; j < m; j++){
//                ans[j] = bs(arr,sg[j]);
//            }
//            System.out.println();
//            for(int i =0;i< ans.length;i++){
//                System.out.print(ans[i]);
//            }
////            for(int i : ans){
////                System.out.print(i);
////            }
//    }
//
//    private static int bs(int[] arr, int target) {
//        System.out.println();
//        System.out.print("arr : ");
//        for(int i : arr){
//                System.out.print(i);
//            }
//        System.out.println();
//        int cnt = 0;
//        int l = arr[0];
//        int h = arr[arr.length - 1];
//        while (l <= h) {
//            int m = (l + h) / 2;
//            System.out.println(m);
//            if (target < arr[m]) {
//                h = m - 1;
//                System.out.print("h : "+h);
//                print(arr,l,h);
//            } else if (target > arr[m]) {
//                l = m + 1;
//                System.out.print("l : "+ l);
//                print(arr,l,h);
//            } else {
//                for(int i=0;i<3;i++){
//                    if(arr[m-3+i]==target){cnt++;System.out.println("find : "+cnt);}
//                }
//            }
//        }return cnt;
//    }
//    public static void print(int[] arr,int l, int h){
//        System.out.print("-- l/h------->"+l+","+h);
//        for(int i=l;i<h;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }
//
//}
