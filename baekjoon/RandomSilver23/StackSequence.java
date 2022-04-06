package baekjoon.RandomSilver23;
// 스택에다가
// 오름차순으로 수를 넣었을 때
//수열을 만들 수 있는지와 push와 pop 순서 정하기
// 난 존나 쎄니까 걱정마
// 난 내가 너무 소중하기 때문에. 내가 상처받을 일은 하지 않아. ㅇㅇ. 도전하지 않아도. 충분히 행복할 수 있어.
// 나는 항상 슬퍼하고 울면서 공부해야 사랑받을 수 있나봐
//

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackSequence {
//어케야할지 모루겟당
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        String[] ans= new String[n];
        int cnt= 0;

        // #1 일단 다 푸쉬
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            st.push(arr[i]);
        }

        for(int i =0;i<n;i++){
            int target = arr2[i];
            while(true){
                if(st.peek()!=target){
                    ans[cnt]= String.valueOf(st.pop()); //니맘가는 그대로 //이제 내손을 잡아 //지금 내손을 잡아
                }else{
                   st.push(arr[i]);
                }
            }
        }








    }
}
