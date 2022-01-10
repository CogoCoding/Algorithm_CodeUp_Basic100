package com.company.Programmers.Level1;
import java.lang.*;
import java.util.Stack;

public class Crane {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //1. basket 스택 만들기
        Stack<Integer> bsk = new Stack<>();
        //2. moves 순회하면서 board의 move열 중 위에서부터 0보다 큰 수 찾기 => 열 고정
        for(int m=0; m<moves.length;m++){
            //3. board[0]길이만큼 행만 순회하기 => 행 지정
            for(int row = 0;row<board[0].length;row++){
                //4. 인형 뽑아서 doll에 넣고 인형 있던 자리는 0으로 만들어주기
                if(board[row][moves[m]-1]>0){
                    int doll = board[row][moves[m]-1];
                    board[row][moves[m]-1]=0;
                    //5. basket이 비어있지 않고, 최상위 요소와 뽑은 인형이 같으면
                    //(1)basket에서 pop하고 (2) answer+=2
                    if(!bsk.empty() &&  bsk.peek()==doll){
                        bsk.pop();
                        answer+=2;
                    }
                    //5. basket이 비어있거나, 최상위 요소와 뽑은 인형이 다르면 push하고
                    else{bsk.push(doll);}
                    break;
                }
            }
        }
        return answer;
    }
}