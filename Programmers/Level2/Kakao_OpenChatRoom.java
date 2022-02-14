package Programmers.Level2;
import java.util.*;

public class Kakao_OpenChatRoom {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] ans = solution(record);
        for(int i = 0 ; i<ans.length;i++){
            System.out.print(ans[i]+"\n");
        }
    }

    public static String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> ls = new ArrayList();

        for(String r : record){
            if(!r.startsWith("L")){
                String[] arr = r.split(" ");
                map.put(arr[1],arr[2]);
            }
        }

        for(String r : record){
            String[] arr = r.split(" ");
            if(r.startsWith("E")){
                ls.add(map.get(arr[1])+"님이 들어왔습니다.");
            }else if(r.startsWith("L")){
                ls.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }

        String[] ans = new String[ls.size()];
        for(int i =0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}
