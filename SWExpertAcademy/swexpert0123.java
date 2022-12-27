//package SWExpertAcademy;
//
///*import java.util.Scanner;
//import java.io.FileInputStream;
//
//class Solution
//{
//    static int result =0;
//   public static void main(String args[]) throws Exception
//   {
//
//      Scanner sc = new Scanner(System.in);
//      int T;
//      T=sc.nextInt();
//      for(int test_case = 1; test_case <= T; test_case++)
//      {
//            String target =sc.next();
//         int swap = sc.nextInt();
//         if(target.length() <swap) swap = target.length();
//         String[] target_arr = target.split("");
//         result =0;
//         dfs(swap,0,target_arr);
//         System.out.println("#"+test_case+" "+ result);
//
//      }
//   }
//
//    public static void dfs(int swap,int cur, String[] target) {
//
//      if(swap ==0) {
//         String current = String.join("",target);
//         int toint = Integer.parseInt(current);
//         if(toint>result)result = toint;
//         return;
//
//      }
//
//      for(int i =cur; i<target.length-1; ++i) {
//         for(int j = i+i; j<target.length; ++j) {
//            int ta = Integer.parseInt(target[i]);
//            int tb = Integer.parseInt(target[j]);
//
//            target[i] = Integer.toString(tb);
//            target[j] = Integer.toString(ta);
//            dfs(swap-1,i,target);
//            target[j] = Integer.toString(tb);
//            target[i] = Integer.toString(ta);
//
//         }
//      }
//   }
//
//}*/
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class swexpert0123 {
//    static int res;
//    static char[] arr;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= T; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String s = st.nextToken();
//            int N = Integer.parseInt(st.nextToken());
//            arr = new char[s.length()];
//            for (int j = 0; j < s.length(); j++) {
//                arr[j] = s.charAt(j);
//            }
//            if (arr.length < N) {
//                N = arr.length;
//            }
//            res = 0;
//            dfs(N, 0);
//
//            System.out.printf("#%d %d\n",i,res);
//        }
//    }
//
//    public static void dfs(int cnt, int start) {
//        if (cnt == 0) {
//            res = Math.max(res, Integer.parseInt(String.valueOf(arr)));
//            return;
//        }
//        for (int i = start; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                char stri = arr[i];
//                char strj = arr[j];
//
//                arr[i] = strj;
//                arr[j] = stri;
//                dfs(cnt - 1, i);
//                arr[i] = stri;
//                arr[j] = strj;
//            }
//        }
//    }
//}
