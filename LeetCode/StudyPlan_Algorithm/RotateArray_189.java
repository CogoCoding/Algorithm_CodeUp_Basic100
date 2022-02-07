package LeetCode.StudyPlan_Algorithm;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
//        int[] nums= {-1,-100,3,99};
        int k = 3;
        rotate(nums,k);
        }

// 모범답안1   https://steady-coding.tistory.com/493
    public static void rotate(int[] nums, int k){
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }

// 모범답안2 https://freepanda.tistory.com/70
//    public static void rotate(int[] nums, int k) {
//        int[] ans = new int[nums.length];
//        if(nums==null||nums.length==0){
//            return;
//        }
//        for(int i=0;i<nums.length;i++) {
//            ans[(i + k) % nums.length] = nums[i];
//        }
//        copy(ans,nums);
//    }
//
//    public static void copy(int[] ans,int[] nums){
//        for(int i=0;i<nums.length;i++) {
//            nums[i] = ans[i];
//        }
//    }

// 잘못된 풀이
//    public static void rotate(int[] nums, int k) {
//        int[] ans = new int[nums.length];
//        int cnt = 0;
//        for(int i=nums.length-k;i<nums.length;i++){
//            ans[cnt++]=nums[i];
//        }
//        for(int i=0;i<nums.length-k;i++){
//            ans[cnt++]=nums[i];
//        }

//    }
}

