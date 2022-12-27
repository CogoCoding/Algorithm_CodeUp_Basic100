package SWExpertAcademy;

//2072. 홀수만 더하기
import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    public static void main(String args[]) throws Exception
    {
 	Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int sum;
        int num;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            sum=0;
            for(int j=0;j<10;j++){
                num = sc.nextInt();
                if(num%2!=0)sum+=num;
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}
//2071. 평균값 구하기
//import java.io.FileInputStream;
//import java.text.DecimalFormat;
//
//class Solution
//{
//	public static void main(String args[]) throws Exception
//	{
//   		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//        	int sum;
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//            	sum=0;
//           	 for(int j=0;j<10;j++){
//             		sum+=sc.nextInt();
//         	 }
//            	System.out.println("#"+test_case+" "+(int)Math.round(sum/10.0));
//
//      }
//}
//[자바 문법]
//1. Math.round() 는 항상 소수점 아래 첫 번째 자리에서만 반올림한다.
//
//2. 소수점 아래 몇 자리 DecimalFormat df = new DecimalFormat
//
//import java.text.DecimalFormat;
//
//double d = 1.23456
//DecimalFormat df = new DecimalFormat("0.0");
//System.out.print(df.format(d)); //여기서 반환값은 String형
//2070. 큰 놈, 작은 놈, 같은 놈
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//class Solution
//{
//	public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//                int num1;
//                int num2;
//                char c;
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//                    num1=sc.nextInt();
//                    num2=sc.nextInt();
//                    if(num1==num2){c='=';}
//                    else if(num1>num2){c='>';}
//                    else{c='<';}
//                    System.out.println("#"+test_case+" "+c);
//		}
//	}
//}
//1545. 거꾸로 출력해 보아요
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//    class Solution
//    {
//        public static void main(String args[]) throws Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            int T;
//            T=sc.nextInt();
//            for(int test_case =  T; test_case >=1; test_case--)
//            {
//                System.out.print(test_case+" ");
//            }
//            System.out.print(0);
//        }
//    }
//2068. 최대수 구하기
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//class Solution
//{
//	public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//                int max;
//                int num;
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//            	max=-1;
//       		for(int j=0;j<10;j++){
//                num=sc.nextInt();
//                if(num>max){max=num;}
//            }
//            System.out.println("#"+test_case+" "+max);
//		}
//	}
//}
//2063. 중간값 찾기
//* 로직
//5개의 수가 주어졌을 때 3번째 수( 3 = (5/2)+1 )가 중앙값이다.
//
//단, nums배열은 0번째 idx부터 수가 들어가 있으므로
//
//배열에서 3번째 수는 nums[3]이 아닌 nums[2]이다.
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//    class Solution
//    {
//        public static void main(String args[]) throws Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            int T;
//            T=sc.nextInt();
//            int[] nums = new int[T];
//            for(int i = 0; i <T; i++)
//            {
//                nums[i]=sc.nextInt();
//            }
//            Arrays.sort(nums);
//            System.out.println(nums[(T/2)]);
//        }
//    }
//2058. 자릿수 더하기
//* 자바 문법
//Integer.toString() : int to string
//
//Integer.parseInt() : string to int
//
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//    class Solution
//    {
//        public static void main(String args[]) throws Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            int T;
//            T=sc.nextInt();
//            String s = Integer.toString(T);
//            int sum=0;
//            for(int i=0;i<s.length();i++){
//                sum+=Integer.parseInt(s.charAt(i)+"");
//            }
//            System.out.print(sum);
//        }
//    }
//2046. 스탬프 찍기
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//    class Solution
//    {
//        public static void main(String args[]) throws Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            int T;
//            T=sc.nextInt();
//            for(int test_case = 1; test_case <= T; test_case++){
//                System.out.print('#');
//            }
//        }
//    }
//2047. 신문 헤드라인
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//    class Solution
//    {
//        public static void main(String args[]) throws Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            String s;
//            s=sc.nextLine();
//            System.out.print(s.toUpperCase());
//        }
//    }
//* 자바 문법 - 대문자 소문자 변환
// public static void main(String[] args) {
//        String s = "aBcDe123";
//        // #1 문자열 전체를 한가지로 변환
//        String output1 = s.toLowerCase(); //전체 소문자로
//        String output2 = s.toUpperCase(); //전체 대문자로
//
//        // #2 대문자<->소문자 변환
//        // 아스키코드 범위 : 대문자(65~90),소문자(97~122)
//        // 대문자+32 = 소문자 // 소문자-32 = 대문자
//        String output3 = "";
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (65 <= c && c <= 90) {
//                output3 += (char)(c + 32);
//            } else if (97 <= c && c <= 122) {
//                output3 += (char)(c - 32);
//            } else {
//                output3 += (char)c;
//            }
//        }
//        System.out.println(output1); //abcde123
//        System.out.println(output2); //ABCDE123
//        System.out.println(output3); //AbCdE123
//    }
//
//2056. 연월일 달력
//[자바 문법]
//1 ) 날짜 포맷
//2) StringBuffer
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public static void main(String[] args) throws ParseException {
//
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        String s;
//        StringBuffer sb = new StringBuffer();
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            sb.append("#"+test_case+" ");
//            s = sc.next();
//            sb.append(format(check(s)));
//            if(test_case!=T)sb.append('\n');
//        }
//        System.out.print(sb);
//    }
//
//    private static String format(String check) throws ParseException {
//        if(check.equals("-1")) return check;
//        else{
//         	// Date 날짜 형식에서 MM은 날짜의 월을, mm은 시간의 분을 의미하기에 구분이 필요
//            SimpleDateFormat originFormat = new SimpleDateFormat("yyyyMMdd"); // 외부 지정 형식
//            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd"); // 나의 지정 형식
//            Date date = originFormat.parse(check); // '날짜+형식'의 외부 데이터에서 '날짜' 데이터만 추출
//            return myFormat.format(date); // '날짜' 데이터를 내가 원하는 형식과 더해 '날짜+형식' 반환
//        }
//    }
//
//    private static String check(String s) {
//        int month = Integer.parseInt(s.substring(4, 6));
//        int day = Integer.parseInt(s.substring(6, 8));
//        if (month == 2) {
//            if (1 <= day && day <= 28) return s;
//            else return "-1";
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            if (1 <= day && day <= 30) return s;
//            else return "-1";
//        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            if (1 <= day && day <= 31) return s;
//            else return "-1";
//        } else return "-1";
//    }
//2050. 알파벳을 숫자로 변환
//      StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        for(int i=0;i<s.length();i++)
//        {
//            sb.append(s.charAt(i)-64);
//            if(i!=s.length()-1)sb.append(" ");
//        }
//        System.out.print(sb);
//1938. 아주 간단한 계산기
//class Solution
//{
//	public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//        System.out.println(n1+ n2);
//        System.out.println(n1- n2);
//        System.out.println(n1* n2);
//        System.out.println(n1/ n2);
//	}
//}
//1936.1대1 가위바위보
//public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int n1 =sc.nextInt();
//        int n2 =sc.nextInt();
//
//        if(n1==1){
//            if(n2==2){System.out.print('B');}
//            else{System.out.print('A');}
//		}else if(n1==2){
//        	if(n2==3){System.out.print('B');}
//            else{System.out.print('A');}
//        }else if(n1==3){
//            if(n2==1){System.out.print('B');}
//            else{System.out.print('A');}
//        }
//    }
//2043.서랍의 비밀번호
//	public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int n1 =sc.nextInt();
//		int n2 =sc.nextInt();
//
//        if(n1>=n2)System.out.print(n1+1-n2);
//        else{
//        	System.out.print(n1+(999+1-n2));
//        }
//	}
//2025.N줄덧셈
//public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//        	int sum=0;
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//			sum+=test_case;
//		}
//        System.out.print(sum);
//	}
//2019.더블더블
// public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//           	int mul=1;
//      	 	System.out.print(mul+" ");
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//                mul*=2;
//                if(test_case!=T)System.out.print(mul+" ");
//                else{System.out.print(mul);}
//		}
//	}
//2027.대각선 출력하기
// public static void main(String args[]) throws Exception
//	{
//        int cnt =0;
//		for(int i=0;i<5;i++){
//        	for(int j=0;j<5;j++){
//            	if(j==cnt){System.out.print('#');}
//                else{System.out.print('+');}
//            }
//            cnt++;
//            System.out.println();
//        }
//	}
//1933.간단한 N 의 약수
//public static void main(String args[]) throws Exception{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//		for(int test_case = 1; test_case <= T; test_case++) {if (T % test_case == 0) {System.out.print(test_case+" ");}}
//}
//2029.몫과 나머지 출력하기
//public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T =sc.nextInt();
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//            int n1 =sc.nextInt();
//            int n2 =sc.nextInt();
// 		    System.out.println("#"+test_case+" "+n1/n2+" "+n1%n2);
//        }
//	}
