package com.company.Programmers.Level1;
import java.util.*;
import java.util.Map.Entry;
public class FailureRate {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i<stages.length;i++){
            int x=1;
            if(m.containsKey(stages[i])){x=m.get(stages[i])+1;}
            m.put(stages[i],x);
        }

        Object[] mapkey = m.keySet().toArray();
        Arrays.sort(mapkey);

        int maxKey = Collections.max(m.keySet());
        int[] keySum = new int[maxKey+1];

        for(int i=1;i<=maxKey;i++){
            int sum=0;
            for(int j=i;j<=maxKey;j++){
                if(!m.containsKey(j)){sum+=0;}
                else{sum+=m.get(j);}
            }
            keySum[i]=sum;
        }

        double[] sp = new double[N+1];
        for(int i =1; i<=N; i++){
            if(!m.containsKey(i)){sp[i]=0;}
            else{sp[i]= (double)m.get(i)/(double)keySum[i];}
        }

        HashMap<Integer,Double> s = new HashMap<Integer,Double>();
        for(int i=1;i<=sp.length-1;i++){
            s.put(i,sp[i]);
        }

        List<Entry<Integer,Double>> entryList = new ArrayList<Entry<Integer,Double>>(s.entrySet());
        Collections.sort(entryList,new Comparator<Entry<Integer,Double>>(){
            public int compare(Entry<Integer,Double> obj1,Entry<Integer,Double> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        int[] answer = new int[N];
        int cnt=0;
        for(Entry<Integer,Double> entry :entryList){
            answer[cnt]=entry.getKey();
            cnt++;
        }
        return answer;
    }
}
