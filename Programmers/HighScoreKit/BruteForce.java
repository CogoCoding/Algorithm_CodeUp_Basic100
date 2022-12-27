package Programmers.HighScoreKit;
//[미완]
import java.util.ArrayList;
import java.util.List;

public class BruteForce {
    static String[] nums;
    static List<String> comb;
    public static void main(String args[]) throws Exception {
        String s = "12345";
        nums = s.split("");
        comb = new ArrayList<>();

        // #1 조합 만들기
        // cnt가 -1 이 아닌 동안(=자리수 끝까지 다함)
        // cnt를 1부터 ++해주면서 계속 makeCombination을 해주면서
        // ls에 넣어준다
        int cnt =1;
        // (1) 1의자리
        for(int i=0;i< nums.length;i++) {
            String str = s.charAt(i)+"";
            comb.add(str);
            // (2) 2의자리
            for(int j=1;j<nums.length;j++){
//                String str2 = str+s.charAt(j);
//                comb.add(str2);
//                for(int k =2;k<nums.length;k++){
//                    String three = one+s.charAt(k);
//                    comb.add(three);
//                }
            }
        }
        // (3) 3의자리
        // (4) s.length의 자리


        Integer[] nums2 = new Integer[nums.length] ;
        for(int i=0;i<nums.length;i++){
            nums2[i]= Integer.parseInt(nums[i]);
        }

    }

//    public static String makeCombination (int cnt, String prev, String s) {
//        if (cnt == nums.length) {
//            return s;
//        }
//        for (int i = cnt - 1; i < nums.length; i++) {
//            String str = s.charAt(i) + "";
//            comb.add(str);
//            makeCombination(cnt,str,s);
//        }
//        cnt++;
//        return s;
//    }
}
