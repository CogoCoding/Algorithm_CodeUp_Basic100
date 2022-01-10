package com.company.Programmers.Level1;
import java.util.HashMap;

public class PhoneKetMon {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            int x=1;
            if(m.containsKey(nums[i])){x=m.get(nums[i])+1;}
            m.put(nums[i],x);
        }

        int keyN = m.size();
        if(keyN>=nums.length/2){return nums.length/2;}
        else{return keyN;}

    }
}
