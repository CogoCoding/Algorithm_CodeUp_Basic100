package SWExpertAcademy;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


public class D2 {

}


//1859
//public static void main(String args[]) throws Exception {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        sc.nextLine();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#" + test_case + " ");
//            int n = sc.nextInt();
//            // #1.input넣어주기
//            int[] arr = new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            // #2.탐색
//            long max=arr[n-1];
//            long ans=0;
//            for(int i=n-1;i>=0;i--){
//                if(arr[i]<max){ans+=max-arr[i];}
//                else{max=Math.max(arr[i],max);}
//            }
//            sb.append(ans+"\n");
//        }
//        System.out.print(sb);
//    }
//}

//1961
//    static int[][] ansArr;
//    static int[][] rotArr;
//    static int n;
//    static StringBuffer sb;
//    public static void main(String args[]) throws Exception
//    {
//        sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        sc.nextLine();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#" + test_case + "\n");
//            n = sc.nextInt();
//            int[][] arr = new int[n][n];
//            for(int i =0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    arr[i][j]=sc.nextInt();
//                }
//            }
//            ansArr = new int[n][3*n];
//            int cnt = 0;
//            while(true) {
//                if(cnt==3){break;}
//                if(cnt==0){rotArr = rotation(arr);}
//                else{rotArr = rotation(rotArr);}
//                for(int i=0;i<n;i++){
//                    for(int j=0;j<n;j++){
//                        ansArr[i][j+(cnt*n)]=rotArr[i][j];
//                    }
//                }
//                cnt++;
//            }
//            printAns(ansArr);
//        }
//        System.out.print(sb);
//    }
//
//    private static void printAns(int[][] ansArr) {
//        for(int i=0;i<ansArr.length;i++){
//            for(int j=0;j<ansArr[0].length;j++) {
//                if(j!=0&&j%n==0){sb.append(" ");}
//                sb.append(ansArr[i][j]);
//            }
//            sb.append("\n");
//        }
//    }
//
//    private static int[][] rotation(int[][] arr) {
//        int n = arr[0].length;
//        int[][] rotArr = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                rotArr[i][j]=arr[n-1-j][i];
//            }
//        }
//        return rotArr;
//    }
//    private static void print(int[][] arr) {
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }

//1204
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

//1204
// 2번째 풀이
//static int[] arr ;
//    public static void main(String args[]) throws Exception
//	{
//      StringBuffer sb = new StringBuffer();
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//		for(int test_case = 1; test_case <= T; test_case++) {
//            int tc = sc.nextInt();
//            sb.append("#" + tc + " ");
//            int max = 0;
//            arr = new int[101];
//            // #1 input
//            for (int i = 0; i < 1000; i++) {
//                int score = sc.nextInt();
//                arr[score]++;
//                if (arr[score] > max) max = arr[score];
//            }
//            // #2 maxScore 찾기
//            for(int i=100;i>0;i--){
//                if(arr[i]==max){
//                    sb.append(i);
//                    break;
//                }
//            }
//            sb.append("\n");
//        }
//      System.out.print(sb);
//	}
//}


//1984
// public static void main(String args[]) throws Exception {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        sc.nextLine();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            // #1 input
//            String s= sc.nextLine();
//            String[] ss = s.split(" ");
//            int[] sss = new int[ss.length];
//
//            // #2 정렬 - 숫자크기 오름차순
//            for(int i=0;i<ss.length;i++) {
//                sss[i]=Integer.parseInt(ss[i]);
//            }
//            Arrays.sort(sss);
//
//            // #3 최소,최대값이 중복일 경우
//            int min=sss[0];
//            int max=sss[ss.length-1];
//            int minCnt=1;
//            int maxCnt=1;
//            while(true){
//                if(sss[minCnt]==min){
//                    minCnt++;
//                }else{break;}
//            }
//            while(true){
//                if(sss[sss.length-maxCnt-1]==max){
//                    maxCnt++;
//                }else{break;}
//            }
//
//            // #4 최소,최대값 제외한 나머지 평균
//            double sum=0; //여기서 sum을 double로 해야 이후에 Math.round로 반올림을 알맞게 할 수 있다
//            for(int i=minCnt;i<sss.length-maxCnt;i++){
//                sum+=sss[i];
//            }
//            sb.append("#" + test_case + " "+Math.round(sum/(ss.length-minCnt-maxCnt))+"\n");
//        }
//        System.out.print(sb);
//    }

//1946
//  StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int cnt =0;
//            sb.append("#" + test_case + "\n");
//            int n = sc.nextInt();
//            for(int i=0;i<n;i++){
//                String c = sc.next();
//                int k = sc.nextInt();
//                for(int j =0;j<k;j++){
//                    sb.append(c);
//                    cnt++;
//                    if(cnt==10){
//                        sb.append("\n");
//                        cnt=0;
//                    }
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.print(sb);
//    }

//1983
// public static String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
//    public static int[] student;
//    public static double[] scores;
//    public static void main(String args[]) throws Exception {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#" + test_case + " ");
//            int n = sc.nextInt();
//            int who = sc.nextInt();
//            student = new int[n];
//            scores = new double[n];
//            // #1 점수계산
//            for (int i = 0; i < n; i++) {
//                int mid = sc.nextInt();
//                int fin = sc.nextInt();
//                int hw = sc.nextInt();
//                scores[i] = (mid * 0.35) + (fin * 0.45) + (hw * 0.2);
//            }
//            // #2 순위계산
//            for (int i = 0; i < n; i++) {
//                int rank = 1;
//                for (int j = 0; j < n; j++) {
//                    if (scores[i] < scores[j]&&i!=j) {
//                        rank++;
//                    }
//                }
//                student[i] = rank;
//            }
//            // #3 평점계산
//            int sameGrade = n / 10;
//            // 여기서 rank를 탐색하며 학점을 매긴다
//            // scores[]를 재활용 하여 A+는 0, A0은 1 ... 을 저장한다
//            int cnt=0;
//            int gradeIdx = 0;
//            for (int j = 1; j <= n; j++){
//                for (int i = 0; i < n; i++) {
//                    if (student[i] == j) {
//                        scores[i] = gradeIdx;
//                        cnt++;
//                        if (cnt == sameGrade) {
//                            cnt = 0;
//                            gradeIdx++;
//                       }
//                    }
//                }
//            }
//            sb.append(grade[(int)scores[who-1]]+"\n");
//        }
//        System.out.print(sb);
//    }
//1970
//public static int[] money = {50000,10000,5000,1000,500,100,50,10};
//    public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            sb.append("#"+test_case+"\n");
//            String ans="";
//            int n = sc.nextInt();
//            for(int i=0;i<money.length;i++){
//                if(n/money[i]==0){
//                    ans+="0 ";
//                }else{
//                    ans+=String.valueOf(n/money[i]);
//                    ans+=" ";
//                    n-=((n/money[i])*money[i]);
//                }
//            }
//            sb.append(ans+"\n");
//        }
//        System.out.print(sb);
//    }

//1926
// public static void main(String args[]) throws Exception
//    {
//       StringBuffer sb = new StringBuffer();
//       Scanner sc = new Scanner(System.in);
//       String ans = "";
//       int cnt;
//       int n = sc.nextInt();
//       for(int i=1;i<=n;i++){
//           String s = String.valueOf(i);
//           cnt=0;
//           for(int j=0;j<s.length();j++){
//               char c= s.charAt(j);
//               if(c=='3'||c=='6'||c=='9'){
//                   cnt++;
//               }
//           }
//           if(cnt==0){ans+=s;ans+=" ";}
//           else{
//               if(cnt==1){ans+="- ";}
//               else{
//                   for(int k =0;k<cnt;k++){
//                       ans+="-";
//                   }
//                   ans+=" ";
//               }
//           }
//       }
//       sb.append(ans);
//       System.out.print(sb);
//    }

//1976
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++) {
//            int h1=sc.nextInt();
//            int m1=sc.nextInt();
//            int h2=sc.nextInt();
//            int m2=sc.nextInt();
//            int h=h1+h2;
//            int m=m1+m2;
//            if(m>60){h++;m=m-60;}
//            else if(m==60){h++;m= 0;}
//            if(h>12){h-=12;}
//            sb.append("#"+test_case+" "+h+" "+m+" "+"\n");
//        }
//        System.out.print(sb);
//    }

//2005
//  public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        for(int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#"+test_case+"\n");
//            int n = sc.nextInt();
//            String[][] board = new String[n][n];
//            // #1 한 변 길이 = n 인 정삼각형 1로만 만들기
//            for(int i=1;i<=n;i++){
//                Arrays.fill(board[i-1]," ");
//                for(int j=0;j<i ;j++){
//                    board[i-1][j]="1";
//                }
//            }
//            // #2 파스칼 삼각형 만들기
//            if(n>2) {
//                for (int i=2;i<n;i++){
//                    for(int j=1;j<i;j++){
//                        board[i][j]=String.valueOf(Integer.parseInt(board[i-1][j-1])+Integer.parseInt(board[i-1][j]));
//                    }
//                }
//            }
//            for(String[] b:board){
//                sb.append(String.join(" ",b));
//                sb.append("\n");
//            }
//        }
//        System.out.print(sb);
//    }

//2001
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        sc.nextLine();
//        int[][] board;
//        int max;
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            // #1 input
//            max =0;
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            board = new int[n][n];
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    board[i][j]=sc.nextInt();
//                }
//            }
//            // #2 m*m 파리채
//            for(int i=0;i<n-m+1;i++){
//                for(int j=0;j<n-m+1;j++){
//                    int sum=0;
//                    for(int p=0;p<m;p++){
//                        for(int q=0;q<m;q++){
//                            sum+=board[i+p][j+q];
//                        }
//                    }
//                    if(max<sum)max=sum;
//                }
//            }
//            sb.append("#"+test_case+" "+max+"\n");
//        }
//        System.out.print(sb);
//    }
//1974
//public static void main(String args[]) throws Exception
//    {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        sc.nextLine();
//        String[][] board = new String [9][9];
//        int ans;
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            ans =1;
//            for(int i =0;i<9;i++) {
//                String s = sc.nextLine();
//                if(i==8){s+="\n";s=s.trim();}
//                board[i] = s.split(" ");
//            }
//            // #1 가로세로
//            for(int i=0;i<9;i++) {
//                int g = 0;
//                int s = 0;
//                for (int j = 0; j < 9; j++) {
//                    g += Integer.parseInt(board[i][j]);
//                    s += Integer.parseInt(board[j][i]);
//                }
//                if (g != 45 || s != 45) {
//                    ans *= 0;
//                    break;
//                }
//            }
//            // #2 3*3 정사각형
//            if(ans==1) {
//                for (int m = 0; m < 3; m = m + 3) {
//                    if (ans == 0) break;
//                    for (int n = 0; n < 3; n = n + 3) {
//                        int square = 0;
//                        for (int p = 0; p < 3; p++) {
//                            for (int q = 0; q < 3; q++) {
//                                square += Integer.parseInt(board[m + p][n + q]);
//                            }
//                        }
//                        if (square != 45) {
//                            ans *= 0;
//                            break;
//                        }
//                    }
//                }
//            }
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.print(sb);
//    }
// 1954
//public static int[][] board;
//    public static int n;
//    public static int cnt;
//    public static boolean complete;
//    public static boolean one;
//    public static boolean two;
//    public static boolean three;
//    public static boolean four;
//    public static StringBuffer sb;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sb = new StringBuffer();
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            sb.append("#"+test_case+"\n");
//            n = sc.nextInt();
//            if(n==1){sb.append(1+"\n");}
//            else {
//                board = new int[n][n];
//                cnt = 1;
//                one = false;
//                two = false;
//                three = false;
//                four = false;
//                complete = false;
//                int i = 0;
//                int j = 0;
//                garo1(i, j, cnt);
//            }
//        }
//        System.out.println(sb);
//    }
//    public static void print(){
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < n; j++) {
//                sb.append(board[i][j] + " ");
//            }
//            sb.append("\n");
//        }
//    }
//    public static void garo1(int i,int j,int cnt){
//        while(true){
//            if(cnt==n*n+1) complete=true;
//            if(complete){
//                print();
//                break;
//            }
//            if(board[i][j]!=0){
//                sero1(++i,--j,cnt);
//                break;
//            }
//            else if(j==n-1&&two==false){
//                board[i][j]=cnt++;
//                sero1(++i,j,cnt);
//                two=true;
//                break;
//            }
//            else{
//                board[i][j++]=cnt++;
//            }
//        }
//    }
//    public static void sero1(int i,int j,int cnt){
//        while(true){
//            if(complete)break;
//            if(board[i][j]!=0){
//                garo2(--i,--j,cnt);
//                break;
//            }
//            else if(i==n-1&&three==false){
//                board[i][j]=cnt++;
//                garo2(i,--j,cnt);
//                three=true;
//                break;
//            }
//            else{
//                board[i++][j]=cnt++;
//            }
//        }
//    }
//    public static void garo2(int i,int j,int cnt){
//        while(true){
//            if(complete)break;
//            if(board[i][j]!=0){
//                sero2(--i,++j,cnt);
//                break;
//            }
//            else if(j==0&&four==false){
//                board[i][j]=cnt++;
//                sero2(--i,j,cnt);
//                four=true;
//                break;
//            }
//            else{
//                board[i][j--]=cnt++;
//            }
//        }
//    }
//    public static void sero2(int i,int j,int cnt){
//        while(true){
//            if(complete)break;
//            if(board[i][j]!=0){
//                garo1(++i,++j,cnt);
//            }else if(i==0&&one==false){
//                board[i][j]=cnt++;
//                garo1(i,++j,cnt);
//                one=true;
//                break;
//            }
//            else{
//                board[i--][j]=cnt++;
//            }
//        }
//    }

//1966
//public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int n = sc.nextInt();
//            sc.nextLine();
//            int[] arr = new int[n];
//            String s = sc.nextLine();
//            String[] arr2 = s.split(" ");
//            for(int i = 0;i<n;i++){
//                arr[i]=Integer.parseInt(arr2[i]);
//            }
//            Arrays.sort(arr);
//            for(int i = 0;i<n;i++){
//                arr2[i]=String.valueOf(arr[i]);
//            }
//            String ans = String.join(" ",arr2);
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.println(sb);
//    }

// 1961
//  public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        String s;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int n = sc.nextInt();
//            int[][] board = new int[n][n];
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    board[i][j]=sc.nextInt();
//                }
//            }
//            sb.append("#"+test_case+" "+"\n");
//        }
//        System.out.println(sb);
//    }

//2007
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        String s;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            s = sc.next();
//            int ans=s.length();
//            char c0 = s.charAt(0);
//            for(int i=1;i<s.length();i++){
//                char c = s.charAt(i);
//                if(c0==c&&2*i<s.length()){
//                    String s1 = s.substring(0,i);
//                    String s2 = s.substring(i,2*i);
////                    System.out.println(s1+"?="+s2);
//                    if(s1.equals(s2)){
////                        System.out.println(s1+"=="+s2);
//                        ans=s1.length();
//                        break;
//                    }
//                }
//            }
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.println(sb);
//    }

//1940
//public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int n = sc.nextInt();
//            int speed = 0;
//            int distant = 0;
//            int gasok = 0;
//            for(int i =0;i<n;i++){
//                int cmd = sc.nextInt();
//                switch(cmd){
//                    case 0:
//                        distant+=speed;
////                        System.out.println("0"+distant);
//                        break;
//                    case 1:
//                        gasok = sc.nextInt();
//                        speed+= gasok;
//                        distant +=speed;
////                        System.out.println("1"+distant);
//                        break;
//                    case 2:
//                        gasok = sc.nextInt();
//                        if(gasok>speed){speed=0;}
//                        else{speed-=gasok;}
//                        distant +=speed;
////                        System.out.println("1"+distant);
//                        break;
//                    default :
//                        distant+=0;
//                        break;
//                }
//            }
//            sb.append("#"+test_case+" "+distant+"\n");
//        }
//        System.out.println(sb);
//    }

//1979
//public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        int ans;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            ans=0;
//            //#0. Input
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            sc.nextLine();
//            String[][] board = new String[n][n];
//            for(int i = 0;i <n ;i++){
//                String s = sc.nextLine();
//                board[i]=s.split(" ");
//            }
//            // #1. 가로
//            for(int i=0;i<n;i++){
//                for(int j=0;j<board[i].length-k+1;j++){
//                    int cnt = 0;
//                    if(board[i][j].equals("1")){
//                        while(true){
//                            if(j+cnt>=board[i].length)break;
//                            else{
//                                if(board[i][j+cnt].equals("0"))break;
//                                else cnt++;
//                            }
//                        }
//                        if(cnt>k){
//                            j+=k;
//                            if(j+k>=n)break;
//                        }
//                        else if(cnt==k){
////                            System.out.println(i+","+j+"ans++가로");
//                            ans++;
//                            j+=cnt;
//                            if(j+cnt>=n)break;
//                        }
//                        else if(j+cnt<board[i].length){
//                            j+=cnt;
//                            if(j+cnt>=n)break;
//                        }
//                    }
//                }
//            }
//            // #2. 세로
//            for(int j=0;j<n;j++){
//                for(int i=0;i<board[i].length-k+1;i++){
//                    int cnt = 0;
//                    if(board[i][j].equals("1")){
//                        while(true){
//                            if(i+cnt>=board[i].length)break;
//                            else{
//                                if(board[i+cnt][j].equals("0"))break;
//                                else cnt++;
//                            }
//                        }
//                        if(cnt>k){
//                            i+=k;
//                            if(i+k>=n)break;
//                        }
//                        else if(cnt==k){
//                            ans++;
////                            System.out.println(i+","+j+"ans++세로");
//                            i+=cnt;
//                            if(i+cnt>=n)break;
//                        }
//                        else if(i+cnt<board[i].length){
//                            i+=cnt;
//                            if(i+cnt>=n)break;
//                        }
//                    }
//                }
//            }
//        sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.println(sb);
//    }

//1959
//   public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        int[] a;
//        int[] b;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            if(n<m) {
//                a = new int[n];
//                b = new int[m];
//                for (int i = 0; i < n; i++) {
//                    a[i] = sc.nextInt();
//                }
//                for (int i = 0; i < m; i++) {
//                    b[i] = sc.nextInt();
//                }
//            }
//            else{
//                b = new int[n];
//                a = new int[m];
//                for (int i = 0; i < n; i++) {
//                    b[i] = sc.nextInt();
//                }
//                for (int i = 0; i < m; i++) {
//                    a[i] = sc.nextInt();
//                }
//            }
//            int cha = b.length-a.length;
//            long max = Long.MIN_VALUE;
//            while(true){
//                int sum =0;
//                if(cha<0)break;
//                for(int i=0;i<a.length;i++){
//                    sum += a[i] * b[i+cha];
//                }
//                if(max<sum)max=sum;
//                cha--;
//            }
//            sb.append("#"+test_case+" "+max+"\n");
//        }
//        System.out.println(sb);
//    }

//1948
//public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
//        int m1,m2,d1,d2;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            m1 = sc.nextInt();
//            d1 = sc.nextInt();
//            m2 = sc.nextInt();
//            d2 = sc.nextInt();
//            int cnt=1;
//            if(m1==m2)cnt=d2-d1+1;
//            else{
//                cnt+=days[m1++]-d1;
//                while(true){
//                    if(m1==m2)break;
//                    cnt+=days[m1++];
//                }
//                cnt+=d2;
//            }
//            sb.append("#"+test_case+" "+cnt+"\n");
//        }
//        System.out.println(sb);
//    }

//1989
//public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        for (int test_case = 1; test_case <= T; test_case++) {
//            String s = sc.next();
//            int ans=1;
//            int len = s.length()-1;
//            for(int i=0;i<len/2;i++){
//                if(s.charAt(i)==s.charAt(len-i)){
//                    ans*=1;
//                }else{ans*=0;}
//            }
//            sb.append("#"+test_case+" "+ans+"\n");
//        }
//        System.out.println(sb);
//    }

//1284
//   StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//        int p,q,r,s,w,a,b;
//        for (int test_case = 1; test_case <= T; test_case++) {
//            p=sc.nextInt();
//            q=sc.nextInt();
//            r=sc.nextInt();
//            s=sc.nextInt();
//            w=sc.nextInt();
//            a = p*w;
//            if(w-r<=0){b=q;}
//            else{b=q+(w-r)*s;}
//            if(b<a)a=b;
//            sb.append("#"+test_case+" "+a+"\n");
//        }
//        System.out.println(sb);

// 1288
// StringBuffer sb = new StringBuffer();
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        arr = new boolean[10];
//        String su;
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            Arrays.fill(arr,false);
//            int n = sc.nextInt();
//            int k = 1;
//            int cnt = 0;
//            while(true){
//                su = String.valueOf(k*n);
////                System.out.println(k+"*"+n+" = "+su);
//                for(int i=0;i<su.length();i++){
//                    int suu = Integer.parseInt(su.charAt(i)+"");
//                    if(arr[suu]==false){
//                        arr[suu]=true;
//                        cnt++;
//                    }
//                }
//                if(cnt==10)break;
//                k++;
//            }
//            sb.append("#"+test_case+" "+su+"\n");
//        }
//        System.out.println(sb);

// 1986
// public static void main(String args[]) throws Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
//        StringBuffer sb = new StringBuffer();
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//            int n = sc.nextInt();
//            int sum=1;
//            for(int i=2;i<=n;i++){
//            	if(i%2==0)sum-=i;
//                else sum+=i;
//            }
//            sb.append("#"+test_case+" "+sum+"\n");
//        }
//        System.out.print(sb);
//	}

// 1945
// public static String[] arr = {"2","3","5","7","11"};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//        StringBuffer sb = new StringBuffer();
//        int n;
//        int cnt;
//        String smallAns;
//        for(int test_case = 1; test_case <= T; test_case++){
//            smallAns = "";
//            n=sc.nextInt();
//            for(int i=0;i<arr.length;i++)
//            {
//                int m = Integer.parseInt(arr[i]);
//                cnt=0;
//                while(true){
//                    if(n<2)break;
//                    else if(n/m<1||n%m!=0)break;
//                    else{
//                        cnt++;
//                        n=n/m;
//                    }
//                }
//                smallAns+=cnt+" ";
//            }
//            sb.append("#"+test_case+" "+smallAns+"\n");
//        }
//        System.out.print(sb);
//    }
