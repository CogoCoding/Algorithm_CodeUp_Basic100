//package Programmers.Level2;
//
//import java.util.*;
//
////모범답안 보고 품 https://www.youtube.com/watch?v=22tBC3YXVPA
//public class MenuRenewer {
//    public static void main(String[] args) {
//        List<Map<String,Integer>> foodMaps = new ArrayList<>();
//        int[] MaxCnt = new int[11];
//
//        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//        int[] course = {2,3,4};
//        // 10메뉴 이하만 주문하므로 1~10까지
//        for(int i=0;i<11;++i){
//            foodMaps.add(new HashMap<String,Integer>());
//        }
//        for(String str : orders){
//            char[] charArr = str.toCharArray();
//            Arrays.sort(charArr);
//            comb(arr,0,new StringBuilder());
//        }
//        ArrayList<String> ans = new ArrayList<>();
//        //1.각 문자열을 오름차순 정렬(메뉴 주문할 때 a-z가 아닌 뒤죽박죽 순서로 주문하니까)
//        for(int i = 0;i<order.length;i++){
//
//        }
//        //2. 조합구하기
//        for(int i = 0; i<course.length;i++){
//            map = new HashMap<>();
//            int max = Integer.MIN_VALUE;
//            for(int j = 0; j<order.length;j++){
//                StringBuilder sb = new StringBuilder();
//                if(course[i]<order[j].length()){
//                    combi(order[j],sb,0,0,course[i]);
//                }
//            }
//            for(Map.Entry<String,Integer> entry: map.entrySet()){
//                if(Map<String,Integer> entry : map.entrySet()){
//
//                }
//
//            }
//        }
//    }
//    // 재귀 호출로 조합만드는 함수
//    void comb(char[] str, int pos, StringBuilder candi){
//        if(pos>=str.length){
//            int len = candi.length();//메뉴의 개수
//            if(len>=2){
//                int cnt = foodMaps.get(len).getOrDefault(sb.toString(),0)+1);
//                foodMaps.get(len).put(candi.toString(),cnt);
//                maxCnt[len]
//            }
//            return; //재귀 호출 종료
//        }
//        comb(str,pos+1,candi.append(str[pos]));
//        candi.setLength(candi.length()-1);
//        comb(str,pos+1,candi);
//    }
//}
//
//
////    public static void combi(String str,StringBuilder sb,int idx,int cnt,int n){
////        if(cnt == n){
////            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
////            return;
////        }
////        for(int i = idx;i<str.length();i++){
////            sb.append(str.charAt(i));
////            combi(str,sb,i+1,cnt+1,n);
////            sb.delete(cnt,cnt+1);
////        }
////    }
