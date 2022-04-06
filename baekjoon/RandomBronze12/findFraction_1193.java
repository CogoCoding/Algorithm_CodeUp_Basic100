package baekjoon.RandomBronze12;
//분수찾기
import java.util.ArrayList;
import java.util.Scanner;

// 모범답안
public class findFraction_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i<=number;i++){
            arr.add(sum(i));
        }

        int numIdx=-1;
        int momsonhap=-1;
        for(int i = 0;i<arr.size();i++){
            if(number<=arr.get(i)){
                numIdx = i;
                momsonhap = i+2;
                break;
            }
        }

        int mom = arr.get(numIdx)-number+1;
        System.out.println(momsonhap-mom+"/"+mom);
    }

    public static int sum(int to){
        return (to*(to+1))/2;
//        int sum=0;
//        for(int i=1;i<=to;i++){
//            sum+=i;
//        }
//        return sum;
    }
}


// 대각선끼리는 합이 같다
// 대각선의 개수는 1,2,3,4로 늘어난다.
// no1(1)까지는 합2
// no2~3(1+2) 까지 합3
// no4~6(1+2+3) 까지 합4
// no7~10(1+2+3+4) 까지 합5

// 출력.ver
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        // #1 arr배열로 분자+분모 합 배열 구하기
//        // i=0은 합이 2 // i=1은 합이 3  // i=2은 합이 4  // i=3은 합이 5
//        // arr[i]에 속할 때(number가 arr[i-1]~arr[i]사이의 수일때) 분자 분모의 합은 i+2가 된다.
//        List<Integer> arr = new ArrayList<>();
//        int cnt = 1;
//        while(true){
//            arr.add(sum(cnt));
//            if(cnt==number){break;}
//            cnt++;
//        }
//
//        // #2 i의 분자+분모 합은 몇인지 확인
//        int numIdx = -1;
//        int momsonhap=-1;
//        for(int i = 0;i<arr.size();i++){
//            System.out.print(i+"번째 (sum배열) "+arr.get(i)+" ");
//            if(number<=arr.get(i)){
//                numIdx = i;
//                momsonhap = i+2;
//                break;
//            }
//        }
//        System.out.println();
//
//        System.out.print("arr :   ");
//        print(arr);
//
//        // #3  분자, 분모 각각 구하기
//        // arr배열의 val은 모두 1행이라 분자가 1이다 = arr.get(numIdx)하면 무조건 1행의 number값이 나옴.
//        // number와 val의 차이인 int yeolCnt로 구하기
//        System.out.println(arr.get(numIdx));
//        System.out.println(number);
//
//        int son = arr.get(numIdx)-number+1;
//        int mom = momsonhap-son;
//        System.out.println(son);
//        System.out.println(son+"/"+mom);
//    }
//
//    public static void print(List<Integer> arr){
//        for(int i = 0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
//        System.out.println("[end]");
//    }
//
//    public static int sum(int to){
//        int sum=0;
//        for(int i=1;i<=to;i++){
//            sum+=i;
//        }
//        return sum;
//    }
