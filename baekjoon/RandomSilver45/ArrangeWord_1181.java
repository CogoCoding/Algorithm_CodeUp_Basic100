package baekjoon.RandomSilver45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//[XXX] Sort 문제 ㅜㅜ

public class ArrangeWord_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> arr = new ArrayList<String>(20010);
        for(int i =0; i<n; i++){
            String temp= br.readLine();
            if(!arr.contains(temp))
                arr.add(temp);
        }
        Comparator<String> myComparator = new Comparator<String>() {
            public int compare(String x, String y) {
                if(x.length()>y.length()){
                    return 1;
                }
                else if(x.length()==y.length()){
                    return x.compareTo(y);
                }
                return -1;
            }
        };

        Collections.sort(arr, myComparator);

        for(int i =0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}

// 참고 코드
// public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        List<String> n = new ArrayList<String>(20010);
//        for(int i =0; i<T; i++){
//            String temp= br.readLine();
//            if(!n.contains(temp))
//                n.add(temp);
//        }
//        Comparator<String> myComparator = new Comparator<String>() {
//            public int compare(String x, String y) {
//                if(x.length()>y.length()){
//                    return 1;
//                }
//                else if(x.length()==y.length()){
//                    return x.compareTo(y);
//                }
//                return -1;
//            }
//        };
//        Collections.sort(n, myComparator);
//        for(int i =0; i<n.size(); i++){
//            System.out.println(n.get(i));
//        }
//    }
//}

//[XXX][+++]
//        List ***  int[] 아니고 Integer[]로 해야함
//        왜냐하면 List안에 오브젝트아니면 못 담으니 int는 안 담기고 int[] 배열이 담겨있음

//        int[] cntArr = new int[n]; 이 아닌
//        Integer[] cntArr = new Integer[n]; 으로 해야한다.
//        cntArr[0]=1;
//        cntArr[1]=2;
//        if(Arrays.asList(cntArr).contains(1)){
//           System.out.println("yes 1");
//        }else{
//           System.out.println("no 1");
//        }

////
//public static HashMap<String, Integer> map = new HashMap<String, Integer>();
//    public static int n;
//    public static int idx;
//    public static String s;
//    public static String[] arr;
//    public static Integer[] cntArr;
//
//    public static void main(String[] args) {
//        // #1. 해시맵으로 입력받아서 중복을 제거하고
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            s = sc.next();
//            map.put(s, s.length());
//        }
//        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
//        entryList.sort(Map.Entry.comparingByValue());
//
//        // #2. 새 배열 arr에 해시맵 단어들 넣고 길이짧은순으로 정렬
//        arr = new String[n];
//        idx = 0;
//        n = 0;
//        for (Map.Entry<String, Integer> entry : entryList) {
//            s = entry.getKey();
//            arr[idx] = s;
//            idx++;
//            n++;
//        }
//        System.out.print("[1] : ");
//        print(arr);
////        arrange();
//        print(arr);
//    }
//
//    private static void arrange() {
//        cntArr = new Integer[n];
//        int cnt;
//        int end;
//        idx = 0;
//        for (int i = 0; i < n; i++) {
//            cnt = arr[i].length();
//            System.out.println();
//            // 2-(1)만약 중복된 cnt가 없으면 cnt는 cntArr에 넣고 arr은 그대로 pass,
//            if (Arrays.asList(cntArr).contains(cnt)) {
//                System.out.println("현재 통과 cntArr ++ : " + arr[i]);
//                cntArr[idx] = cnt;
//                idx++;
//            } else {
//                System.out.println("cntArr 중복 확인 : " + arr[i]);
//                // 2-(2)만약 중복된 cnt가 있으면 해당 idx-1부터 end까지 arr내부에서 재정렬해주기
//                // 2-(2)-((1)) 길이 같은게 언제끝나는지 확인하고
//                end = -1;
//                for (int j = idx; j < n; j++) {
//                    if (!Arrays.asList(cntArr).contains(arr[i].length())) {
//                        end = j - 1;
//                        break;
//                    }
//                }
//                System.out.println("현재 idx와 end : " +idx+arr[idx]+" , "+end+arr[end]);
//                // 2-(2)-((2))dx부터 end까지 알파벳순 정렬해서 넣어주기
//                alphaOrder(idx, end);
//                idx = end;
//            }
//        }
//    }

//    private static void alphaOrder(int idx, int end) {
//        for (int i = idx; i < end; i++) {
//            for (int j = i + 1; j < end; j++) {
//                if (compareStrings(arr[i], arr[j]) > 0) {
//                    String tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.print("alpha : ");
//        print(arr);
//    }
//
//
//
//    private static void print(String[] arr) {
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }
//    }
//    private static void print(int[] arr) {
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }
//    }
//
//    public static int compareStrings(String word1, String word2)
//    {
//        for(int i = 0; i < Math.min(word1.length(), word2.length()); i++)
//        {
//            if((int)word1.charAt(i) != (int)word2.charAt(i))//comparing unicode values
//                return (int)word1.charAt(i) - (int)word2.charAt(i);
//        }
//        if(word1.length() != word2.length())//smaller word is occurs at the beginning of the larger word
//            return word1.length() - word2.length();
//        else
//            return 0;
//    }