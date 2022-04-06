package baekjoon.RandomSilver45;
// Comparator, Arrays,sort
// 모범답안 https://st-lab.tistory.com/113
// 1. person 객체 만들기
// 2. Counting sort와 StringBuilder[]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class OrderByAge_10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            arr[i][0] = info[0];
            arr[i][1] = info[1];
        }

        Arrays.sort(arr,(i1,i2)->{
                return Integer.parseInt(i1[0]) - Integer.parseInt(i2[0]);
            });

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
        }
        System.out.print(sb);

    }
}


//Arrays.sort 모범답안
//public class OrderByAge {
//        Arrays.sort(arr, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
//            }
//        });
//}

// 내 답안
//        Arrays.sort(arr,(i1,i2)->{
//                return Integer.parseInt(i1[0]) - Integer.parseInt(i2[0]);
//                });
