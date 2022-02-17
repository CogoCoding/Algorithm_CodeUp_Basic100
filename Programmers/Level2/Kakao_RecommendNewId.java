package Programmers.Level2;

// 미완
// failed testcase : 1,6,17,18,26
public class Kakao_RecommendNewId {
    public static void main(String[] args) {
        String new_id = "a...a"; //".....abcdefghijkln...mop.""...!@BaT#*..y.abcdefghijklm" //"z-+.^."
        String a =solution(new_id);
        System.out.println(a+'\n'+a.length());
    }
    public static String solution(String new_id){
        StringBuilder ans = new StringBuilder();

        // 1단계 대소문자 치환
        new_id = new_id.toLowerCase();

        // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        // 정규식사용 new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
        for(int i=0;i<new_id.length();i++){
            char c = new_id.charAt(i);
            if('a'<=c && c<='z'||'0'<c && c<'9'||c=='-' || c=='_'||c=='.'){ans.append(c);}
            //[추가] 숫자판별 Character.isDigit(c)도 가능 //[추가] append 대신 String형태로 더할꺼면 +=String.valueOf(c);
        }
        // 3 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        String imsi = ans.toString();
        while(imsi.contains(".."))imsi = imsi.replace("..","."); //[오답]replace를 한번만 하면 .의 개수가 1/2될 뿐이다

        // 4 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        while(imsi.startsWith(".")){imsi=imsi.substring(1,imsi.length());}
        while(imsi.endsWith(".")){imsi=imsi.substring(0,imsi.length()-1);}

//        while(imsi.charAt(0)=='.'){imsi=imsi.substring(1,imsi.length());if(imsi.length()==0)return "aaa";}
//        while(imsi.length()>=1 && imsi.charAt(imsi.length()-1)=='.'){imsi=imsi.substring(0,imsi.length()-1);}


        // 5 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(imsi.equals("")){imsi +="a";}

        // 6 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(imsi.length()>15){
            imsi = imsi.substring(0,15);
            while(imsi.endsWith(".")){
                imsi=imsi.substring(0,imsi.length()-1);
            }
        }
        // 7 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(imsi.length()<=2){
            while(imsi.length()<3){
                imsi+=imsi.charAt(imsi.length()-1);
            }
        }
        return imsi;
    }
}
