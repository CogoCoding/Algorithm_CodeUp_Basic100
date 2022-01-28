package LeetCode.StudyPlan_Algorithm;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
//        int[] nums= {-1,-100,3,99};
        int k = 3;
        rotate(nums,k);
        }

    public static void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int cnt = 0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[cnt++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            ans[cnt++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}

