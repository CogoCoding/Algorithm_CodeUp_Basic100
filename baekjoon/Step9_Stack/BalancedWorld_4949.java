package baekjoon.Step9_Stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
// [오답]항상 peek할 때는 size==0인지 확인
// 피부하얗고,쇄골,어깨,다리가 젤 예쁘고,다리길고,가슴이야 뭐 좀 없어도 골반 없지않고, 마르고,손가락 예쁘고,집안좋고
// 소괄호와 대괄호 2가지 stack을 만들어서
// 미완

public class BalancedWorld_4949 {
    public static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
//      [오답] while(true)의 함정
//      while(sc.hasNext())대신 while(true)로 하면 마지막에 엔터를 한번 더 쳐야 함 왜지.

      while (sc.hasNext()) {
//        while(true){
            System.out.print("while문 진입");
            String s = sc.nextLine();
            if(s.charAt(0)=='.'){break;}
            System.out.print(cnt+"번째 문자열 ["+s+"] 탐색 : ");
            //[오답] s.equals(".")안되고
            Stack<Character> stack_small = new Stack<>();
            Stack<Character> stack_big = new Stack<>();
            for(int i= 0; i<s.length();i++){
                char c = s.charAt(i);
                switch (c){
                    case '(' : stack_small.push(c);
                    case ')' :
                        if(stack_small.size()!=0&&stack_small.peek()=='(') {
                            stack_small.pop();
                            System.out.print("small_pop");
                        }
                        else{stack_small.push(c);}
                    case '[' :stack_big.push(c);
                    case ']' :
                        if(stack_big.size()!=0&&stack_big.peek()=='['){
                            stack_big.pop();
                            System.out.print("big pop");
                        }
                        else{
                            stack_big.push(c);
                            System.out.print("big push");
                        }
                    default :
                }
            }
            System.out.println(cnt+"번째 문자열 탐색 끝");
            if(stack_big.size()!=0||stack_small.size()!=0){ans.add("no");}
            else{ans.add("yes");}
            cnt++;
        }
        System.out.println("이게 출력이 안되는게 말이 되냐 답 :" + ans.toString());
    }
}