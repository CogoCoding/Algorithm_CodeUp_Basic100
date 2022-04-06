package baekjoon.Step9_Stack;

import java.util.Scanner;
import java.util.Stack;


public class Zero_10773 {
    public static int size = 0;
    public static void main(String[] args) {
        // # 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int sum =0;
        for(int i = 0; i<n ; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        for(int i : stack){
            sum+=i;
        }
        System.out.println(sum);
    }
}
//            System.out.println();
//내꺼
// for(int i=0;i<n;i++) {
//        if(stack[i]==0){
//        System.out.println(pop());
//        }else{
//        push();
//        }
//        }
//        }
//
//private static int pop() {
//        if(size==0){return -1;}
//        else{
//        int n = 0;
//        return n;
//        }
//
//        }
//
//private static void push() {
//
//        }
//        }
// 모범답안 1
//    Stack<Integer> stack = new Stack<Integer>();
//
//    int K = input();	// K 정수 입력(입력 개수)
//
//for(int i = 0; i < K; i++) {
//        int number = input();	// 정수 입력
//
//        if(number == 0) {	// 0이라면 스택에 저장된 top 원소를 지운다.
//        stack.pop();
//        }
//        else {	// 아닐경우는 스택에 원소 추가
//        stack.push(number);
//        }
//        }
//
//        int sum = 0;
//        for(int o : stack) {	// 스택에 담긴 원소 합 구하기
//        sum += o;
//        }