package Programmers.Level2;

import java.util.*;

public class printer {
    public static void main(String[] args) {

        Integer[] priorities = {2, 1, 3, 2};
//        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 2;

        // #1 keyval(현재 순서(=인덱스), 중요도)을 요소로 갖는 Queue를 만들고
        Queue<keyVal> q = new LinkedList();
        int loc = 0;
        for(int i  :priorities){
            q.add(new keyVal(loc++,i));
        }

        // #2 인쇄할 순서 정렬하고
        Arrays.sort(priorities,Collections.reverseOrder());

        // #3
        int[] ans = new int[priorities.length];
        for(int i=0;i<priorities.length;i++){
            int ansIdx = 0;
            int max = priorities[i];
            System.out.println("--------max"+max);
            while(true){
                if(ansIdx == priorities.length)break;
                if(!q.isEmpty()){
                    keyVal poll = q.poll();
                    System.out.println(poll.val+"=="+max);
                    if (max == poll.val) {
                        ans[ansIdx++] = poll.key;
                        System.out.println((ansIdx+1)+"번째 출력 문서 "+poll.key);
                        break;
                    }else {
                        q.add(poll);
                    }
                }else{break;}
            }
        }

        for(int i : ans) {
            System.out.print(i+", ");
        }

        // #4
//        System.out.println(Arrays.asList(ans).indexOf(target)+1);
    }

    public void print(Queue<keyVal> q){
        for(keyVal i:q){
            System.out.println("("+i.key+","+i.val+")");
        }
    }

    static class keyVal{
        int key;
        int val;
        public keyVal(int a, int b){
            this.key=a;
            this.val=b;
        }
    }
}
