package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

public class FuncDev {
    public static int[] days;
    public static void main(String[] args){
        int[] progresses = {96, 99, 98,97};
        int[] speeds = {1,1,1,1};
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
        //#1
        days = new int[progresses.length];
        for(int i =0; i<progresses.length;i++){
            days[i]=(int)Math.ceil((100.0-progresses[i])/(speeds[i]+0.0));
            System.out.println("day :"+days[i]);
        }
        //#2
        List<Integer> ans = new ArrayList<>();
        int cnt=0;
        int max=days[0];
        for(int i=0;i<days.length;i++){
            if(max>=days[i]){
                cnt++;
                if(i==days.length-1)ans.add(cnt);
            }else{
             ans.add(cnt);
             if(i==days.length-1){ans.add(1);}
             else{max=days[i];cnt=1;}
            }
        }

        int[] ans2 = ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("ans.length"+ans2.length);
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]);
        }
    }
}
