package LeetCode.StudyPlan_Algorithm;

public class ReverseWordsInaString3_557 {
    public void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseString(s);
        System.out.print(ans);
    }


// Runtime : 10 ms Memory : 50.6 M
public String reverseString(String s) {
    s +=" ";
    StringBuilder ans = new StringBuilder();
    int start=0,idx;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            ans.append(" ");
            idx=i;
            while(i>start) {
                ans.append(s.charAt(--i));
            }
            i=idx;
            start=idx+1;
        }
    }
       return ans.toString().trim();
    }

// 모범답안 10 ms	54.3 MB - https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
//    public static String reverseString(String s) {
//        String[] str = s.split(" ");
//        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
//        StringBuilder result = new StringBuilder();
//        for (String st : str) result.append(st + " ");
//        return result.toString().trim();
//    }

// 비효율코드1 Runtime : 129 ms Memory : 117.3 MB
//  private static String reverseString(String s) {
//       if (s.length()==0 || s.length()== 1) {
//               return s;
//               }
//        String ans = "";
//        String[] splitStr = s.split("\\s+"); //문자열 공백 split 정규식
//        for(int i=0;i<splitStr.length;i++) {
//            char[] charArr = splitStr[i].toCharArray();
//            int l = 0;
//            int r = splitStr[i].length() - 1;
//            while (l < r) {
//                char tmp;
//                tmp = charArr[r];
//                charArr[r] = charArr[l];
//                charArr[l] = tmp;
//                r--;
//                l++;
//            }
//            ans+=String.valueOf(charArr);
//            if(i<splitStr.length-1){
//              ans+=" ";
//            }
//        }
//        return ans;
//    }

// 문제 잘못 읽음 - 문장 전체 reverse 코드
//    public static String reverseString(String s) {
//        if (s.length()==0 || s.length()== 1) {
//            return null;
//        }
//        char[] charArr = s.toCharArray();
//        int l = 0;
//        int r = s.length()-1;
//        while(l<r){
//            char tmp;
//            tmp = charArr[r];
//            charArr[r]=charArr[l];
//            charArr[l]=tmp;
//            r--;
//            l++;
//        }
//        return String.valueOf(charArr);
//    }

//    public static void print(String s) {
//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i));
//        }
//    }
}