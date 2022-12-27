package Programmers.Level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
//        String[] s = {"sun", "bed", "car"};
//        int n = 1;
        String[] s = {"abce", "abcd", "cdx","abfd"};
        int n = 2;

        List<Str> ls = new ArrayList<>();
        for(int i=0;i<s.length;i++) {
            ls.add(new Str(s[i], s[i].charAt(n)+""));
        }

        List<String> ans = new ArrayList<>();
        ls.stream()
                .sorted(Comparator.comparing(Str::getC).thenComparing(Str::getStr))
//                .sorted(Comparator.comparing(Str::getC).thenComparing(Str::getStr).reversed()) 도 가능
                .forEach((a)->ans.add(a.getStr()));
//                .forEach(a-> System.out.println(a.getStr()));

        String[] ans2 = ans.toArray(new String[ans.size()]);
        System.out.println(ans2[0]);
    }

    public static class Str{
        private String str;
        private String c;
        public Str(String str,String c){
            this.str=str;
            this.c= c;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }
    }
}