package LeetCode.StudyPlan_Algorithm;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    // 모범답안 1
    // 0이 아닌 원소들로 신배열을 채운 후 나머지는 0으로 채움
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    // 모범답안 2
//    public void moveZeroes(int[] nums) {
//        int snowBallSize = 0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==0){
//                snowBallSize++;
//            }
//            else if (snowBallSize > 0) {
//                int t = nums[i];
//                nums[i]=0;
//                nums[i-snowBallSize]=t;
//            }
//        }
//    }

//    public static int[] moveZeroes(int[] nums) {
//        if(nums.length==1){
//            print(nums);
//        }
//        for(int i=0;i<nums.length;i++){
//            for(int j=i;j<nums.length-1;j++){
//                if(nums[i]==0){
//                    while(nums[j]==0&&j<=nums.length-2){
//                        j++;
//                    }
//                    if(nums[j]!=0){
//                        int p =nums[j];
//                        nums[i]=p;
//                        nums[j]=0;
//                    }
//                }
//            }
//        }
//        return nums;
//    }

    public static void print(int[] ans){
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
