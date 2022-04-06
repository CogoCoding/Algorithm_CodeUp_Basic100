package baekjoon.RandomSilver45;
// Comparator, Arrays,sort
// 참고링크 https://st-lab.tistory.com/113
// person 객체 만들기
// #1 person 클래스에 (1) 필드 : age,name (2) 생성자 (3) 메소드 toString 구현
// #2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class OrderByAge2_10814 {
    public static <T> void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] p = new Person[n];

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i]=new Person(age,name);
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            // 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
            sb.append(p[i]);
        }
        System.out.println(sb);
    }

    private static class Person {
        int age;
        String name;

        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }

        public String toString(){
            return age+" "+name+"\n";
        }
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
