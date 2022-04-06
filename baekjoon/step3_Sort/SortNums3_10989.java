package baekjoon.step3_Sort;
// 수의 범위가 만 단위로 작을 땐 카운팅(=계수) 정렬이 시간복잡도 O(N)로 좋다
// [R] 미완
import java.util.Scanner;
public class SortNums3_10989 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        //[오답] 숫자가 0부터 10000까지면 int[10000]이 아닌 int[10001]로
        int[] cnt = new int[10001];
        int[] res = new int[100];
        // # 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        // # 과정1 : 0~10000까지 몇개 있는지 count
        for(int i=0; i<arr.length;i++){
            cnt[arr[i]]++;
        }
        // # 과정2 :
        for(int i=1; i<cnt.length;i++){
            cnt[i]+=cnt[i-1];
        }
        // # 과정3 :
        for(int i = arr.length-1; i>=0; i--){
            int val = arr[i];
            cnt[val]--;
            res[cnt[val]]=val;
        }

        // 초기 배열
        System.out.println("array[]");
        for(int i=0;i<arr.length;i++){
            if(i % 20 == 0) {System.out.println();}
            System.out.println(arr[i]+"\t");
        }
        System.out.println("\n\n");

        // Counting 배열
        System.out.println("counting[]");
        for(int i = 0; i < cnt.length; i++) {
            if(i % 20 == 0) {System.out.println();}
            System.out.print(cnt[i] + "\t");
        }
        System.out.println("\n\n");

        // # 정렬된 배열
        System.out.println("result[]");
        for(int i = 0; i < res.length; i++) {
            if(i % 20 == 0) {System.out.println();}
            System.out.print(res[i] + "\t");
        }
        System.out.println();
    }
}


//public class Main {
//    public static void main(String[] args) throws IOException {
//        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
//        int[] cnt = new int[10001];

//        # 입력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        for (int i = 0; i < N; i++) {
//            // 해당 인덱스의 값을 1 증가
//            cnt[Integer.parseInt(br.readLine())] ++;
//        }
//        br.close();
//
//        StringBuilder sb = new StringBuilder();
//
//        // 0은 입력범위에서 없으므로 1부터 시작
//        for(int i = 1; i < 10001; i++){
//            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
//            while(cnt[i] > 0){
//                sb.append(i).append('\n');
//                cnt[i]--;
//            }
//        }
//        System.out.println(sb);
//    }
