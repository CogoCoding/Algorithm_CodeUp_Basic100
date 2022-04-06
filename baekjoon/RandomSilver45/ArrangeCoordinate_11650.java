package baekjoon.RandomSilver45;

//[R]

//[XXX]
// 1. 무조건 한 자리 양수로 생각하고 charAt으로 받음
// 2. charAt 입력받은 후  Character.getNumericValue()처리안하고 아스키코드로 처리..

// 참고 https://st-lab.tistory.com/110
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ArrangeCoordinate_11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        StringTokenizer st;
        for(int i=0;i<n;i++) {
           st = new StringTokenizer(br.readLine());
           arr[i][0]=Integer.parseInt(st.nextToken());
           arr[i][1]=Integer.parseInt(st.nextToken());
        }

       Arrays.sort(arr,(i1,i2)->{
            if(i1[1] == i2[1]){
                return i1[0]-i2[0];
            }else{
                return i1[1]-i2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}


// comparator prac

//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int n = Integer.parseInt(br.readLine());
//    List<String> arr = new ArrayList<>();
//    for(int i=0;i<n;i++){
//        String s = br.readLine();
//        arr.add(s);
//        System.out.print(s+"입력완료 ");
//        int cntx = 0;
//        int x = s.charAt(cntx);
//        if(x=='-'){
//            x= 0 - Character.getNumericValue(s.charAt(++cntx));
//            System.out.print(" -수 x "+x);
//        }else{
//            x = Character.getNumericValue(x);
//            System.out.print(" / +수 x "+x);
//            cntx++;
//        }
//        int cnty = cntx+1;
//        int y = s.charAt(cnty);
//        if(y=='-'){
//            y = 0 - Character.getNumericValue(s.charAt(++cnty));
//            System.out.print("-수 y "+y);
//        }else{
//            y = Character.getNumericValue(y);
//            System.out.print(" / +수 y "+y);
//            cnty++;
//        }
//        System.out.print("< x, y : "+ x + ", " + y +">  ");
//        if(x>y)System.out.println("x>y");
//        else if(x==y)System.out.println("=");
//        else System.out.println("x<y");
//    }
