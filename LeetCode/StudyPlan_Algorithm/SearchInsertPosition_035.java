package LeetCode.StudyPlan_Algorithm;

// #문제
//
public class SearchInsertPosition_035 {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,6}; //2->1 , 4->3, 7->4
        int[] nums = {1,3,5,6,7}; //2->1 , 4->3, 8->5

        int target = 8;
        System.out.print(searchInsert(nums,target));
    }

    private static int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length;
        int mid=0;

        if(nums==null){return 0;}
        if(nums[0]>=target){return 0;}
        if(nums[nums.length-1]<target){return nums.length;}

        while (l <= h) {
            mid = l + (h-l) / 2;
            if(nums[mid]==target){return mid;}
            else if(nums[mid] > target){
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
