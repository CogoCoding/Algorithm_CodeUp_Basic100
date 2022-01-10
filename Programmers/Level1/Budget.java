package com.company.Programmers.Level1;
import java.util.*;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        for(int b: d){System.out.print(b);}
        int cnt =0;
        for(int i=0;i<d.length;i++){
            budget-=d[i];
            cnt++;
            if(budget<0){cnt--;break;}
            if(budget==0){break;}
        }
        return cnt;
    }
}
