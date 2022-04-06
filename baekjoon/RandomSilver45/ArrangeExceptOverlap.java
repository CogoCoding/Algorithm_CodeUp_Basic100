package baekjoon.RandomSilver45;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 정수이므로 음수가 나올 수 있으므로
// 기본 카운팅정렬 기법을 사용하려면 양수 음수 각각 1001 size의 배열을 만들어주어야 한다.
public class ArrangeExceptOverlap {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] plusNum=new int[1001];
        int [] minusNum=new int[1001];
        String[] strArr=br.readLine().split(" ");
        StringBuffer strBuffer=new StringBuffer();
        for(int i=0;i<n;i++) {
            int num= Integer.parseInt(strArr[i]);
            if(num>=0) {
                plusNum[num]=1;
            }else {
                minusNum[num*(-1)]=1;
            }
        }

        for(int i=1000;i>=0;i--) {
            if(minusNum[i]>0) strBuffer.append(-i+" ");
        }
        for(int i=0;i<1001;i++) {
            if(plusNum[i]>0) strBuffer.append(i+" ");
        }
        System.out.println(strBuffer);
    }
}
