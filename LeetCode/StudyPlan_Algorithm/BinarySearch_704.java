
package LeetCode.StudyPlan_Algorithm;

// # 문제
// 오름차순 정렬된 unique integer 배열 nums 와 int target(줄여서 t)이 주어지고,
// nums 중 target 찾으면 idx를 아니면 -1를 반환

// # 이진 탐색 (BinarySearch)
// *정렬된 배열* 에서 특정한 값의 위치찾기
// 중간에서 시작해서 t보다 작으면 오른쪽으로, 크면 왼쪽으로 이동

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.print(search(nums,target));
    }

    public static int search(int[] nums,int t){
        int len = nums.length;
        if(len==1 && nums[0]==t){
            return 0;
        }
        int idx = -1;
        int startIdx =len/2;
        int cnt=0;
        while(cnt<len/2){
            if(nums[startIdx]<t){startIdx++;}
            if(nums[startIdx]>t){startIdx--;}
            if(nums[startIdx]==t){idx=startIdx;break;}
            cnt++;
        }
        return idx;
    }
}
