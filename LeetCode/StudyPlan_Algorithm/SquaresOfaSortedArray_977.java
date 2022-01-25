package LeetCode.StudyPlan_Algorithm;

import java.util.Arrays;

public class SquaresOfaSortedArray_977 {
    public static void main(String[] args) {
//        int nums[]={-4,-1,0,3,10};
        int nums[]={-7,-3,2,3,11};
        int sqr[] = sortedSquares(nums);
        for(int i =0;i<nums.length;i++){
            System.out.print(sqr[i]+" ");
        }
    }

    private static int[] sortedSquares(int[] nums) {
        int[] sqr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            sqr[i]= (int) Math.pow(nums[i],2);
        }
        Arrays.sort(sqr);
        return sqr;
    }
}
