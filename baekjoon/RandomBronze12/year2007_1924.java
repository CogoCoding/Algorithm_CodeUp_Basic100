package baekjoon.RandomBronze12;

import java.util.Scanner;

public class year2007_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        String[] yoil= {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int idx=0;
        for(int i =1;i<m;i++){
            idx+= dayCount(i);
        }
        idx+=d;
        System.out.println(yoil[idx%7]);
    }
    public static int dayCount(int m){
        int dayCnt = 0;
        if(m==2){dayCnt=28;}
        else if(m==4||m==6||m==9||m==11){
            dayCnt=30;
        }
        else{dayCnt=31;}
        return dayCnt;
    }
}
