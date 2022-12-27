package Programmers.Level2;

public class numberOf124country {
    public static void main(String[] args) {
        int n= 123;
        //하나씩 숫자를 올려가며 하려고 했는데 최대 n이 5억 이므로 불가능
        String[] nums = {"4","1","2"};
        String ans = "";
        int num = n;

        while(num>0){
            int remainder = num%3;
            num/=3;
            if(remainder == 0) num--;
            ans= nums[remainder]+ans;
        }
        System.out.println(ans);
    }
}
