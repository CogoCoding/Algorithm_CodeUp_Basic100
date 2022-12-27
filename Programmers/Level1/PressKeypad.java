package Programmers.Level1;
import java.util.Arrays;

class Solution {
    public static Integer[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
    public static char h;
    public static int[] leftThumbPos = new int[]{0, 3};
    public static int[] rightThumbPos = new int[]{2, 3};
    public static int[] targetPos = new int[2];

    public String solution(int[] numbers, String hand) {
        h = Character.toUpperCase(hand.charAt(0));
        char[] ans = new char[numbers.length];

        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                findTargetPos(numbers[i]);
                ans(0,1);
                ans[i]='L';
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                findTargetPos(numbers[i]);
                ans(1,0);
                ans[i]='R';
            }
            else{
                findTargetPos(numbers[i]);
                ans[i]=ans(distant(leftThumbPos),distant(rightThumbPos));
            }
        }
        String s = new String(ans);
        return s;

    }
    public static char ans(int distL, int distR){
        if(distL==distR){
            if(h=='L'){leftThumbPos[0]=targetPos[0];leftThumbPos[1]=targetPos[1];}
            else{rightThumbPos[0]=targetPos[0];rightThumbPos[1]=targetPos[1];}
            return h;
        }
        else if (distL<distR){leftThumbPos[0]=targetPos[0];leftThumbPos[1]=targetPos[1];return 'L';}
        else {rightThumbPos[0]=targetPos[0];rightThumbPos[1]=targetPos[1];return 'R';}
    }

    public static void findTargetPos(Integer input){
        targetPos[0] = -1 ;
        targetPos[1] = -1 ;
        for(int i = 0;i<4;i++){
            int targetIdx = Arrays.asList(keypad[i]).indexOf(input);
            if(targetIdx!=-1){
                targetPos[0] = targetIdx;
                targetPos[1] = i;
            }
        }
    }

    public static int distant(int[] thumbpos){
        return Math.abs(thumbpos[0]-targetPos[0])+Math.abs(thumbpos[1]-targetPos[1]);
    }
}
