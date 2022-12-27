package SWExpertAcademy;
// 기본형식
import java.util.*;

public class D3 {
    static int[] heights;
    static int dump;
    public static void main(String args[]) throws Exception
    {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
        for(int test_case = 1; test_case <= 10; test_case++)
        {
            dump = sc.nextInt();
            heights = new int[100];

            // #1 입력받기
            for(int i=0;i<100;i++){
                heights[i]=sc.nextInt();
            }

            // #2 정렬
            while(dump>0){
                if(dump<=0)break;
                dump();
            }
            int ans = heights[99]-heights[0];
            System.out.println("ans: "+ans);
            sb.append("#"+test_case+" "+ans+"\n");
        }
        System.out.print(sb);
    }
    public static void dump(){
        Arrays.sort(heights);
        if(dump<=2){
            System.out.println("현재 dump:" +dump);
            for(int i=0;i<100;i++){
                System.out.print(heights[i]+" ");
            }
            System.out.println("\n"+heights[99]+">"+heights[0]);
        }
        if(heights[99]-heights[0]>=1){
            heights[99]--;
            heights[0]++;
            dump--;
        }else{dump=0;}
    }
}

//1216 회문2 (미완)
//static String[][] board;
//	static int max;
//	public static void main(String args[]) throws Exception {
//		StringBuffer sb = new StringBuffer();
//		Scanner sc = new Scanner(System.in);
////		int T;
////		T=sc.nextInt();
//		for(int test_case = 1; test_case <= 10; test_case++)
//		{
//			int tc=sc.nextInt();
//			// #1 입력받기
//			board = new String[100][100];
//			for(int i=0;i<100;i++){
//				String s = sc.next();
//				String[] sLs = s.split("");
//				board[i]=sLs;
//			}
//
//			String mode = "";
//			// #2 가로 회문 개수 세기
//			max =0;
//			for(int i=0;i<100;i++) {
//				checkPal(i,100,"garo");
//			}
//
//			// #3 세로 회문 개수 세기
//			for(int i=0;i<100;i++){
//				checkPal(i,100,"sero");
//			}
//      		sb.append("#"+test_case+" "+max+"\n");
//		}
//		System.out.println(sb);
//	}
//
//	public static void checkPal(int i,int len,String mode){ // #4 한 줄 탐색
//		boolean check = true;
//		int cnt = 0;
//		if(mode.equals("garo")) {
//			while (cnt < 99) {
//				for (int j = 0; j < cnt + 1; j++) {
//					int start = j;
//					int end = len - 1 + j;
//					check = true;
//
//					while (start < end) {
//						if (!Objects.equals(board[i][start], board[i][end])) {
//							check = false;
//							break;
//						}
//						start++;
//						end--;
//					}
//					if (check) {
//						max = Math.max(max, len);
//						break;
//					}
//				}
//				if (check) break;
//				len--;
//				cnt++;
//			}
//		}else if(mode.equals("sero")){
//			while (cnt < 99) {
//				for (int j = 0; j < cnt + 1; j++) {
//					int start = j;
//					int end = len - 1 + j;
//					check = true;
//					while (start < end) {
//						if (!Objects.equals(board[start][i], board[end][i])) {
//							check = false;
//							break;
//						}
//					}
//					if (check) {
//						max = Math.max(max, len);
//						break;
//					}
//					start++;
//					end--;
//				}
//				if (check) break;
//				len--;
//				cnt++;
//			}
//		}
//	}


//11688
// static int a;
//    static int b;
//    public static void main(String args[]) throws Exception {
//    StringBuffer sb = new StringBuffer();
//    Scanner sc = new Scanner(System.in);
//    int T;
//    T = sc.nextInt();
//    sc.nextLine();
//    for (int test_case = 1; test_case <= T; test_case++) {
//        sb.append("#" + test_case + " ");
//        a=1;
//        b=1;
//        String input = sc.next();
//        int len = input.length();
//        for(int i=0;i<len;i++){
//            char c = input.charAt(i);
//            if(c=='L'){b+=a;}
//            else if(c=='R'){a+=b;}
//        }
//        sb.append(a+" "+b+"\n");
//    }
//    System.out.print(sb);
//    }


// 몇번 문제더라
//StringBuffer sb = new StringBuffer();
//		Scanner sc = new Scanner(System.in);
//		int T=10;
////		T=sc.nextInt();
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//			sb.append("#"+test_case+" "+"\n");
//			arr = new int[100][100];
//			for(int i=0;i<100;i++){
//				for(int j=0;j<100;j++){
//					arr[i][j]=sc.nextInt();
//					if(arr[i][j]==2){x=i;y=j;}
//				}
//			}
//			for(int j=y;j>=0;j--){
//				if(x==0){x=checkR();}
//				if(x==99){x=checkL();}
//				if(x==checkR()&&x==checkL()){y--;}
//				j=y;
//			}
//			if(y==0)sb.append(x+"\n");
//		}
//      System.out.print(sb);
//	}
//	public static int checkR(){
//		while(true) {
//			if(x==99)break;
//			if (arr[x + 1][y] == 0) {
//				if(y>0)y--;
//				break;
//			}
//			x++;
//		}
//		return x;
//	}
//	public static int checkL(){
//		while(true) {
//			if(x==0)break;
//			if (arr[x - 1][y] == 1) {
//				if(y>0)y--;
//				break;
//			}
//			x--;
//		}
//		return x;
//	}

//1220
//	static String[] arr;
//    public static void main(String args[]) throws Exception
//	{
//      StringBuffer sb = new StringBuffer();
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=10;
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//			int n = sc.nextInt();
//			sb.append("#"+test_case+" ");
//			arr = new String[10000];
//			Arrays.fill(arr, "");
//			int cnt = 0;
//			for(int i=0;i<10000;i++){
//				int su = sc.nextInt();
//				arr[i%1000]+=String.valueOf(su);
//			}
//			// 순회하면서 "12" 포함 개수 세기
//			for(int i=0;i<100;i++){
//				arr[i]=arr[i].replaceAll("0","");
////				System.out.print(arr[i]+"->");
//				if(arr[i].contains("12")){
//					cnt += (arr[i].length()- (arr[i].replace("12","").length()))/2;
//				}
////				System.out.println(cnt);
//			}
//			sb.append(cnt+"\n");
//		}
//      System.out.print(sb);
//	}
//}


//1204
//class Solution
//{
//    public static void main(String args[]) throws Exception {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        sc.nextLine();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int tcNum = sc.nextInt();
//            int[] scores = new int[101];
//            for(int i=0;i<1000;i++){
//                int score = sc.nextInt();
//                scores[score]+=1;
//            }
//            int[] scores2=scores.clone();
//            Arrays.sort(scores2);
//            int scoreCntMax = scores2[100];
//            int ans=-1;
//            for(int i=0;i<101;i++){
//                if(scores[i]==scoreCntMax&&ans<i)ans=i;
//            }
//            sb.append("#" + tcNum + " "+ans+"\n");
//        }
//        System.out.print(sb);
//    }
//}

//1206  static int[] arr = new int[100];
//    public static void main(String args[]) throws Exception
//	{
//      StringBuffer sb = new StringBuffer();
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//		for(int test_case = 1; test_case <= T; test_case++) {
//            int tc = sc.nextInt();
//            sb.append("#" + tc + " " + "\n");
//            int max = 0;
//            for (int i = 0; i < 1000; i++) {
//                int score = sc.nextInt();
//                arr[score]++;
//                if (arr[score] > max) max = arr[score];
//            }
//            for(int i=100;i>0;i--){
//                if(arr[i]==max){sb.append(i);}
//            }
//        }
//      System.out.print(sb);
//	}
//}
//static int[] arr;
//    static int cnt;
//    static int w;
//    public static void main(String args[]) throws Exception
//	{
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = 10;
////        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#" + test_case + " ");
//            // #1 input 배열에 넣어주기
//            w = sc.nextInt();
//            arr = new int[w];
//            for(int i=0;i<w;i++){
//                arr[i]=sc.nextInt();
//            }
//            // # checkR,checkL 함수 구현
//            // # 순차적으로 탐색하며 checkR,checkL으로 cnt++
//            cnt=0;
//            for(int i =2;i<w-2;i++) {
//                if (i == 2) {
//                    if (checkR(i)!= 0) {
//                        cnt+=checkR(i);
//                    }
//                } else if (i == w-3) {
//                    if (checkL(i)!=0) {
//                        cnt+=checkL(i);
//                    }
//                } else {
//                    if (checkR(i)!=0 && checkL(i) != 0){
//                        cnt+=Math.min(checkR(i),checkL(i));
//                    }
//                }
//            }
//            sb.append(cnt);
//            sb.append("\n");
//        }
//        System.out.print(sb);
//	}
//    public static int checkR(int idx){
//        int bigyo= Math.max(arr[idx+1],arr[idx+2]);
//        if(arr[idx]<=bigyo)return 0;
//        else return arr[idx]-bigyo;
//    }
//    public static int checkL(int idx){
//        int bigyo= Math.max(arr[idx-1],arr[idx-2]);
//        if(arr[idx]<=bigyo)return 0;
//        else return arr[idx]-bigyo;
//    }

//1225
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        Queue<Integer> queue;
//
//        for(int test_case = 1; test_case <= 10; test_case++)
////        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int T;
//            T=sc.nextInt();
//            sc.nextLine();
//            sb.append("#"+T+" ");
//            queue = new LinkedList<>();
//            for(int i=0;i<8;i++) {
//                queue.offer(sc.nextInt());
//            }
//            while(true){
//                int a=-1;
//                for(int i=0;i<5;i++){
//                    a = queue.poll();
//                    if(a-i-1<=0){queue.add(0);break;}
//                    else{queue.add(a-i-1);}
//                }
//                if(a<=5)break;
//            }
//            for(int q: queue){
//                sb.append(q+" ");
//            }
//            sb.append("\n");
//        }
//        System.out.print(sb);
//    }

//1289
//public static void main(String args[]) throws Exception
//{
//    StringBuffer sb = new StringBuffer();
//    Scanner sc = new Scanner(System.in);
//    int T;
//    T=sc.nextInt();
//    sc.nextLine();
////        for(int test_case = 1; test_case <= 10; test_case++)
//    for(int test_case = 1; test_case <= T;test_case++)
//    {
//        String s = sc.nextLine();
//        int len = s.length();
//        int cnt=0;
//        // 처음 0에서 시작해서
//        // 1로바꼈다가 0으로바꼇다가 하는게 몇번인지 세면됨
//        if(s.charAt(0)=='0'){
//            for(int i=0;i<len-1;i++){
//                int a= Integer.parseInt(s.charAt(i)+"");
//                int b= Integer.parseInt(s.charAt(i+1)+"");
//                if(Math.abs(a-b)==1)cnt++;
//            }
//        }
//        else{
//            cnt++;
//            for(int i=0;i<len-1;i++){
//                int a= Integer.parseInt(s.charAt(i)+"");
//                int b= Integer.parseInt(s.charAt(i+1)+"");
//                if(Math.abs(a-b)==1){
//                    cnt++;
//                }
//            }
//        }
//        sb.append("#"+test_case+" "+cnt+"\n");
//    }
//    System.out.print(sb);
//}
//10505
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
////        for(int test_case = 1; test_case <= 10; test_case++)
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            int sum=0;
//            for(int i =0;i<n;i++){
//                int p=sc.nextInt();
//                sum+=p;
//                arr[i]=p;
//            }
//            int avg = sum/n;
//            Arrays.sort(arr);
//            int cnt=0;
//            for(int i=0;i<n;i++){
//                if(arr[i]<=avg){cnt++;}
//                if(arr[i]>avg){break;}
//            }
//            sb.append("#"+test_case+" "+cnt+"\n");
//        }
//        System.out.print(sb);
//    }
//1215
//public static char[][] board;
//    public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
////        int T;
////        T=sc.nextInt();
//        board = new char[8][8];
//        for(int test_case = 1; test_case <= 10; test_case++)
////        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            // #1 input
//            int su = sc.nextInt();
//            sc.nextLine();
//            for(int i=0;i<8;i++){
//                String s = sc.nextLine();
//                board[i]= s.toCharArray();
//            }
//            int cnt =0;
//            String ss1,ss2;
//            // #2 가로
//            for(int i=0;i<8;i++){
//              String s = String.valueOf(board[i]);
//              for(int j=0;j<=8-su;j++){
//                  if(su%2==0) {
//                      ss1 = s.substring(j, j+(su/2));
//                      ss2 = s.substring(j+su/2,j+su);
//                  }else {
//                      ss1= s.substring(j, j+(su/2));
//                      ss2 = s.substring(j+(su/2)+1,j+su);
//                  }
//                  // 뒤집기 reverse
//                  StringBuffer sbb = new StringBuffer(ss2);
//                  ss2 = sbb.reverse().toString();
//                  if(ss1.equals(ss2)){
//                      cnt++;
//                  }
//              }
//            }
//            // #3 배열 90도 회전
//            char[][] board2 = new char[8][8];
//            for(int i=0;i<8;i++){
//                for(int j=0;j<8;j++) {
//                    board2[i][j] =board[j][7-i];
//                }
//            }
//            // #4 세로
//            for(int i=0;i<8;i++){
//                String s = String.valueOf(board2[i]);
//                for(int j=0;j<=8-su;j++){
//                    if(su%2==0) {
//                        ss1 = s.substring(j, j+su / 2);
//                        ss2 = s.substring(j+su/2,j+su);
//                    }else {
//                        ss1= s.substring(j, j+su/2);
//                        ss2 = s.substring(j+(su/2)+1,j+su);
//                    }
//                    // 뒤집기 reverse
//                    StringBuffer sbb = new StringBuffer(ss2);
//                    ss2 = sbb.reverse().toString();
//                    if(ss1.equals(ss2)){
//                        cnt++;
//                    }
//                }
//            }
//            sb.append("#"+test_case+" "+cnt+"\n");
//        }
//        System.out.print(sb);
//    }
//13218
// public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int su = sc.nextInt();
//            int ans = su/3;
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.print(sb);
//    }
//}

//1217
//   public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//
//        for(int test_case = 1; test_case <= 10; test_case++)
//        {
//            int T;
//            T=sc.nextInt();
//            int n=sc.nextInt();
//            int m=sc.nextInt();
//            int ans=1;
//            ans=recur(n,m,ans);
//            sb.append("#"+T+" "+ans+"\n");
//        }
//        System.out.print(sb);
//    }
//    public static int recur(int n,int m,int ans){
//        if(m>0){
//            ans*=n;
//            m--;
//            ans =recur(n,m,ans);
//        }
//        return ans;
//    }

//4406
//public static void main(String args[]) throws Exception
//{
//    StringBuffer sb = new StringBuffer();
//    Scanner sc = new Scanner(System.in);
//    int T;
//    T=sc.nextInt();
//    String[] vowel = {"a","e","i","o","u"};
//    for(int test_case = 1; test_case <= T; test_case++)
//    {
//        String s = sc.next();
//        for(String v:vowel) {
//            s = s.replaceAll(v, "");
//        }
//        sb.append("#"+test_case+" "+s+"\n");
//    }
//    System.out.print(sb);
//}

//6730
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int n = sc.nextInt();
//            int past=sc.nextInt();
//            int aMax=0;
//            int dMax=0;
//            for(int i=1;i<n;i++){
//                int pres = sc.nextInt();
//                int dist = pres-past;
//                if (dist==0){}
//                else if(dist>0){
//                    if(dist>=aMax)aMax=dist;
//                }
//                else{
//                    if(dist<=dMax)dMax=dist;
//                }
//                past=pres;
//            }
//            sb.append("#"+test_case+" "+aMax+" "+Math.abs(dMax)+"\n");
//        }
//        System.out.print(sb);
//    }

//12368
//  public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int ans;
//            if(a+b>=24){ans=a+b-24;}
//            else{ans=a+b;}
//            System.out.println(ans);
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.print(sb);
//    }

//3431
//public static void main(String args[]) throws Exception
//{
//    StringBuffer sb = new StringBuffer();
//    Scanner sc = new Scanner(System.in);
//    int T;
//    T=sc.nextInt();
//    for(int test_case = 1; test_case <= T; test_case++)
//    {
//        int l = sc.nextInt();
//        int u = sc.nextInt();
//        int x = sc.nextInt();
//        int ans;
//        if(x>u) ans = -1;
//        else if(x>=l)ans = 0;
//        else ans = l-x;
//        sb.append("#"+test_case+" "+ans+"\n");
//    }
//    System.out.print(sb);
//}
