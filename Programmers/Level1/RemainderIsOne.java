package com.company.Programmers.Level1;

public class RemainderIsOne {
    public int solution(int n) {
        int min = n-1;
        for(int x = 1;x<n-1;x++){
            if(n%x==1&&min>x){min = x;}
        }
        return min;
    }
}
