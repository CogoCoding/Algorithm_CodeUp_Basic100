package baekjoon.RandomSilver45;

import java.util.Scanner;

// 배열로 스택, 큐 구현하기
public class Queue_10845 {
    public static int[] queue;
        public static int size;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            queue = new int[n];
            size = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if (s.equals("push")) {
                    int num = sc.nextInt();
                    push(num);
                } else {
                command(s);
                }
            }
        }

    public static void command(String s){
        switch (s) {
            case "pop":
                System.out.println(pop());
                break;
            case "size":
                System.out.println(size());
                break;
            case "empty":
                System.out.println(empty());
                break;
            case "front":
                System.out.println(front());
                break;
            case "back":
                System.out.println(back());
                break;
            default:
        }
    }

    public static void push(int num){
        queue[size++]=num;
    }

    public static int pop(){
        int pop;
        if(size==0) pop = -1;
        else if(size==1) {
            pop = queue[0];
            queue[0]=-1;
            size--;
        }
        else{
            pop = queue[0];
            for(int i=0;i<size-1;i++){
                queue[i]=queue[i+1];
            }
            size--;
        }
        return pop;
    }

    public static int size(){
        return size;
    }

    public static int empty(){
       if(size==0)return 1;
       else return 0;
    }

    public static int front(){
        int front = -1;
        if(size>0){front = queue[0];}
        return front;
    }
    public static int back(){
        int back = -1;
        if(size>1){
            back = queue[size-1];
        }
        return back;
    }
}

// 모범답안
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        int num = sc.nextInt();
//        Queue q = new Queue(num);
//        for(int i = 0; i<num; i++) {
//            String input = sc.next();
//            switch(input) {
//                case "push":
//                    q.push(sc.nextInt());
//                    break;
//                case "pop":
//                    sb.append(q.pop());
//                    sb.append('\n');
//                    break;
//                case "empty":
//                    sb.append(q.empty());
//                    sb.append('\n');
//                    break;
//                case "front":
//                    sb.append(q.front());
//                    sb.append('\n');
//                    break;
//                case "back":
//                    sb.append(q.back());
//                    sb.append('\n');
//                    break;
//                case "size":
//                    sb.append(q.size());
//                    sb.append('\n');
//                    break;
//                default:
//                    System.exit(0);
//            }
//        }
//        System.out.println(sb);
//    }
//
//    static class Queue {
//        int[] array;
//        int size = 0;
//        int front = 0;
//        int back = 0;
//        int popVal;
//
//        public Queue(int a) {
//            array = new int[a];
//        }
//        public int size() {
//            return size;
//        }
//        public int empty() {
//            if(size==0) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        public int front() {
//            if(size==0) {
//                return -1;
//            }
//            return array[front];
//        }
//        public int back() {
//            if(size==0) {
//                return -1;
//            }else {
//                return array[back-1];
//            }
//        }
//        public void push(int b) {
//            array[back++] = b;
//            size++;
//        }
//
//        public int pop() {
//            if(size==0) {
//                return -1;
//            }
//            popVal = array[front++];
//            size--;
//            return popVal;
//        }
//    }
//}
