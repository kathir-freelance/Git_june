/*package com.atos;

import java.io. * ;
import java.util. * ;

public class Solution2 {

    public static void main(String[] args) {
    }
    int cost(int x,int y, int a, int b) {
    	   return ((x-a)+(y-b));
    	}
    	int greedy(LinkedList<Integer> numpeople, LinkedList<Integer> x, LinkedList<Integer> y){
    	    LinkedList<Integer> xx, yy;
    	    int ans = 0;
    	    for(int i = 0 ; i < numpeople.size();i++){
    	        int count = numpeople.get(i);
    	        while(count--==0){
    	            xx.add(x.get(i));
    	            yy.add(y.get(i));
    	        }
    	    }

    	    sort(xx.begin(), xx.end());
    	    sort(yy.begin(), yy.end());
    	    int mx, my;

    	    mx = xx[xx.size() / 2];
    	    my = yy[yy.size() / 2];

    	    for(int i = 0; i < numpeople.size();  i++){
    	        ans += numpeople[i] * cost(mx, my, x[i], y[i]);
    	    }
    	    return ans;
    	}
    
}*/