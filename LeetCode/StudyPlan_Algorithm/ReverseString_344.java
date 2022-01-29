package LeetCode.StudyPlan_Algorithm;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        print(s);
    }

    public static void print(char[] s) {
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        if (s.length==0 || s.length== 1) {
            return;
        }
        int l = 0;
        int r = s.length-1;
        while(l<r){
            char tmp;
            tmp = s[r];
            s[r]=s[l];
            s[l]=tmp;
            r--;
            l++;
        }
    }
}
