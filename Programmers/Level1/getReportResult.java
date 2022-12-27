package Programmers.Level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class getReportResult {
    public static void main(String[] args) {
        String[] id_ls={"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k=2;

        int[] ans  = new int[id_ls.length];
        Map<String, HashSet<String>> reportedMap = new HashMap<>();
        Map<String, Integer> answerMap = new HashMap<>();

        for(int i=0;i<id_ls.length;i++) {
            reportedMap.put(id_ls[i], new HashSet<>()); //id별 이 아이디에 신고한 사람 set으로 정리
            answerMap.put(id_ls[i], 0);
        }

        for(String s : report){
            String[] reportStr = s.split(" ");
            String from = reportStr[0];
            String to = reportStr[1];
            reportedMap.get(to).add(from);
        }

        for(String reportedUser : reportedMap.keySet()){
            HashSet<String> userForSend = reportedMap.get(reportedUser);
            if(userForSend.size()>=k){
                for(String userId:userForSend){
                    answerMap.put(userId,answerMap.get(userId)+1);
                }
            }
        }

        for(int i=0;i<id_ls.length;i++){
            ans[i]=answerMap.get(id_ls[i]);
        }
//        return ans;
    }
}
