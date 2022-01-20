package LeetCode.StudyPlan_Algorithm;

// 타인 모범 풀이
// The crux over here is that the array is already sorted.
// We are comparing the first and last elements because after square these have the possibility of being the highest element.
// Both the extremes contain the max element (after square ofc), so we are inserting these elements to the last of the new array to make it sorted.

//   public int[] sortedSquares(int[] A) {
//        int[] res = new int[A.length];
//        int start = 0, end = A.length-1;
//        int resIndex = A.length-1;
       
//        while(start <= end){
//            if(A[start]*A[start] > A[end]*A[end]){
//                res[resIndex--] = A[start]*A[start];
//                start++;
//            }else{
//                res[resIndex--] = A[end]*A[end];
//                end--;
//            }
//        }
       
//        return res;
//    }

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
