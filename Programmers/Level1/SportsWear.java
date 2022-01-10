package com.company.Programmers.Level1;

public class SportsWear {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        int answer = n;

        for (int l : lost)
            student[l-1]--;
        for (int r : reserve)
            student[r-1]++;

        for (int i = 0; i < student.length; i++) {
            if(student[i] == -1) {
                if(i>=1 && student[i-1] == 1) {student[i]++;student[i-1]--;}
                else if(i+1<student.length && student[i+1] == 1) {student[i]++;student[i+1]--;}
                else{answer--;}
            }
        }
        return answer;
    }
}
