//전신 보고 영혼 완전 꽂혓넹ㅋ 공부 방송 중 몸매 클래스로는 나지 ㅎㅅㅎ
package baekjoon.Step9_Stack;
import java.util.Scanner;
import java.util.Stack;
// 300 끈팅 7번 제한 뽀뽀 33개 가슴 올리구 핏줄 보이게

// vps () 괄호문제는 stack으로
public class gualho_9012 {
    // # 입력 받기
    public static void main(String[] args) {
        // # 입력받고
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sc.next();
        }
        // # stack 만들어서 일단 push하고 (1) input이 ")"이고 (2) idx-1이 "("이면 pop 시키기
        // # 받은 괄호 문장들 중에
        for (int k = 0; k < n; k++) {
            // # ans배열에서 "(())(())" 하나씩 빼와서 스택잔여여부 다시 ans배열 idx자리에
            Stack<Character> stack = new Stack<Character>();
            String str = ans[k];
            for (int i = 0; i < ans[k].length(); i++) {
                char c = str.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.size()!=0&&stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.size() == 0) {
                ans[k] = "YES";
            } else {
                ans[k] = "NO";
            }
            print(ans);
        }
    }
    public static void print(Stack<Character> stack){
        System.out.print("\nstack print: ");
        for (char c : stack) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void print(String[] ans){
        for (String s : ans) {
            System.out.println(s);
        }
    }
}

