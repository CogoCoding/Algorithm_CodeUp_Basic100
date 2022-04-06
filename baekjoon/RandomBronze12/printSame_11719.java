package baekjoon.RandomBronze12;

import java.util.Scanner;
// 모범답안
// [새지식] while(sc.hasNextLine())
public class printSame_11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}
