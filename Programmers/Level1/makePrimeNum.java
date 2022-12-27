package Programmers.Level1;

import java.util.ArrayList;
// 주어진 수 중 3개를 더해서 소수가 되는 개수 구하기


public class makePrimeNum {
    public static void main(String args[]) throws Exception{
        int ans =0;
        int[] nums = {1,2,7,6,4};
        ArrayList<Integer> ls = new ArrayList<>();

        // #1 ls에 3수의 합들을 구한다
        for(int i=0;i<nums.length;i++){
            if(i+2>=nums.length)break;
            for(int j=i+1;j<nums.length;j++){
                for(int k = j+1; k<nums.length;k++){
                    ls.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        // #2 prime number 소수 여부 판별
        for(Integer i: ls){
            int divisor = 2;
            ans++;
            while(divisor<i){ //cnt는 i보다 작고 1이 아닌 수, 즉 소수인지를 판별.
                if(i%divisor==0){ans--; break;}
                divisor++;
            }
        }
//        return ans;
    }
}
