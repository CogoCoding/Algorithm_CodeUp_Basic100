package Programmers.Level1;
// 2가지 풀이방법 정규식.ver , (정규식사용안한)안정규식.ver
public class Kakao_RecommendNewId {

    public static void main(String[] args) {
        String new_id = "a...a"; //".....abcdefghijkln...mop.""...!@BaT#*..y.abcdefghijklm" //"z-+.^."
        String a =solution(new_id);
        System.out.println(a+'\n'+a.length());
    }
//정규식.ver
    public static String solution(String new_id) {
        // 1
        String answer = new_id.toLowerCase();
        // 2
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3
        answer = answer.replaceAll("\\.+", ".");
        // 4
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5
        if (answer.equals("")) answer = "a";
        // 6
        if (answer.length() > 15){ answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", ""); }
        // 7
        while (answer.length() < 3) answer += answer.charAt(answer.length() - 1);
        return answer;
    }
//안정규식.ver
//    public static String solution(String new_id){
//        StringBuilder ans = new StringBuilder();
//
//        // 1
//        new_id = new_id.toLowerCase();
//
//        // 2
//        for(int i=0;i<new_id.length();i++){
//            char c = new_id.charAt(i);
//            if(('a'<=c && c<='z')||('0'<=c && c<='9')||c=='-' || c=='_'||c=='.'){ans.append(c);}
//        }
//
//        //[오답코드] if('a'<=c && c<='z'||'0'<c && c<'9'||c=='-' || c=='_'||c=='.'){ans.append(c);}
//        //[오답][실수] 'a'랑 'z'는 <=,=>로 잘했는데 '0'이랑 '9'는 <,>로 한거 실화
//        //[오답][실수] a~z, 0~9 괄호 안해서 ||와 &&가 모두 중복처리됨
//        //[추가] if c!= 조건으로 아닌걸 제거해도 됨 ex) new_id = new_id.replace(idx,"")로 해도 됨
//        //[추가] 영어판별 Character.isAlphabetic(c)도 가능
//        //[추가] 숫자판별 Character.isDigit(c)도 가능
//        //[추가] append 대신 String형태로 더할꺼면 +=String.valueOf(c);
//
//        // 3
//        String imsi = ans.toString();
//        while(imsi.contains(".."))imsi = imsi.replace("..","."); //[오답]replace를 한번만 하면 .의 개수가 1/2될 뿐이다
//        //[추가] while(imsi.indexOf("..")!=-1 도 가능
//
//        // 4
//        while(imsi.startsWith(".")){imsi=imsi.substring(1);}
//        while(imsi.endsWith(".")){imsi=imsi.substring(0,imsi.length()-1);}
//        //[추가] starts,endsWith 대신 charAt(0)등 가능
//
//
//        // 5
//        if(imsi.equals("")){imsi +="a";}
//
//        // 6
//        if(imsi.length()>15){
//            imsi = imsi.substring(0,15);
//            while(imsi.endsWith(".")){
//                imsi=imsi.substring(0,imsi.length()-1);
//            }
//        }
//
//        // 7
//        if(imsi.length()<=2){
//            while(imsi.length()<3){
//                imsi+=imsi.charAt(imsi.length()-1);
//            }
//        }
//        return imsi;
//    }
}

