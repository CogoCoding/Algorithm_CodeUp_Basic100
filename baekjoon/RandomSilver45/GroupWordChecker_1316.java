package baekjoon.RandomSilver45;
// 모범답안 이것도 알파벳 개수 크기의 배열 생성해서 진행
import java.util.Scanner;

public class GroupWordChecker_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int su = sc.nextInt();
        for(int i = 0;i<su;i++){
            String words = sc.next();
            if(groupWords(words)==true){cnt++;}
        }
        System.out.println(cnt);
    }

    private static boolean groupWords(String words) {
        boolean[] check = new boolean[26];
        int prev = 0;
        for(int i = 0; i <words.length();i++){
            int now = words.charAt(i);
            if(prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}
