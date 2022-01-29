package LeetCode.StudyPlan_Algorithm;
// Given a 1-indexed array of integers numbers
// sorted in non-decreasing order
// find two numbers such that they add up to a specific target number

public class twosum2_InputArrSorted_167 {
    public void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target = 9;
        System.out.print(twoSum(nums,target));
    }
// 모범답안 1
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target)
                return new int[]{l+1,r+1};
            else if(numbers[l]+numbers[r]<target)
                l++;
            else
                r--;
        }
        return new int[]{-1,-1};
    }

// 모범답안2 를 조금 수정 https://gaebal-goebal.tistory.com/67
//        public static int[] twoSum(int[] nums, int target) {
//           int[] res = new int[]{};
//           for(int i=0;i<nums.length;i++) {
//               int val = nums[i];
//               if (target >= val) {
//                   int tmpTarget = target - val;
//                   int targetIdx = findTarget(nums, i + 1, tmpTarget);
//                   if (targetIdx != -1) {
//                       res = new int[]{i + 1, targetIdx + 1};
//                       break;
//                   }
//               }
//           }
//           return res;
//        }
//
//    private static int findTarget(int[] nums, int leftIdx,int target){
//        int rightIdx = nums.length-1;
//        int res= -1;
//        while(rightIdx>=leftIdx){
//            int midIdx = (rightIdx+leftIdx)/2;
//            int mid = nums[midIdx];
//            if(mid==target) return midIdx;
//            if(mid>target){
//                rightIdx=midIdx-1;
//            }else if(mid<target){
//                leftIdx=midIdx+1;
//            }
//        }
//        return res;
//    }


//    public int[] twoSum(int[] numbers, int target) {
//        for(int i=0;i<numbers.length;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                if(numbers[i]+numbers[j]==target)
//                    return new int[]{i+1,j+1};
//            }
//        }
//        return new int[]{-1,-1};
//    }

}
