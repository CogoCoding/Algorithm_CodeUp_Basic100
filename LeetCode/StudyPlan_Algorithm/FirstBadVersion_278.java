package LeetCode.StudyPlan_Algorithm;

// # 문제
// BinarySearch 기본양식 암기하기

public class FirstBadVersion_278 {
     private static int firstBadVersion(int n) {
      int low=1;
      int high=n;

      while(low<=high){
          //int mid = (low+high)/2로 하면 overflow 가능성있으므로 아래처럼
          int mid = low+(high-low)/2;
          if(isBadVersion(mid)){high=mid-1;}
          else{low=mid+1;}
      }
      return low;
    }

    private static boolean isBadVersion(int mid) {
         // given Api
         // given below is just stopgap
         return true;
    }
}