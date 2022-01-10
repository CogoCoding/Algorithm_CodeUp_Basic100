package com.company.Programmers.Level1;

public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long cost = 0;

        for(int i =1;i<=count;i++){
            cost+=price*i;
        }

        if(cost<=money){return 0;}
        else{return Math.abs(money-cost);}
    }
}
