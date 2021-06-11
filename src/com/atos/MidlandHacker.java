package com.atos;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *loc x,y
coord=a,b
costPerPerson=x-a+y-b

no of ppl=[1,2]

x=[1,3] y=[1,3]

x[0],y[0]=(1,3),     x[1],y[1]=(1,3)

cord=(2,2)            city0 at 1,1          cost=|1-2|+|1-2|

cost=2

cord=2,2

city1 at 3,3       cost=2*(3-2+3-2)=4

 * */
 
public class MidlandHacker {

	public static void main(String[] args) {

		//assuming
		
		int numOfPeople[]={1,2};
		int x[]={1,3}; 
		int y[]={1,3};
		
		int xOrYCount=x.length>y.length?x.length:y.length;
	//	Map<Integer,Integer> city=new Hashtable<>();
		/*
		for(int count=0; count<x.length; ++count){
			int city[][]=new int[xOrYCount][xOrYCount];
			for(int r=0;r<xOrYCount;++r)
				for(int r=0;r<xOrYCount;++r)
					*/
	//	System.out.println(xOrYCount);
		for(int i=0;i<xOrYCount;++i){
			//city.put(x[i],y[i]);
			findCost(x[i],y[i],i,numOfPeople[i]);
		
		}
		//for(Object o:city.entrySet()){
	//		findCost(city.entrySet());
		//}
	//	System.out.println(city);
	//	System.out.println(city.size());
	}
			
	
	static int findCost(int x,int y,int city,int numPeople){
		int coOrd[]={2,2};
		int a=coOrd[0];
		int b=coOrd[1];
		int cost=0;
		System.out.println("people "+numPeople);
		System.out.println(x+" y val "+y);
	//	if(city==0){
			cost =numPeople*(Math.abs(x-a)+Math.abs(y-b));
		//}
		System.out.println(cost);
		return cost;
	}
	

}
/*
 * static int findCost(Set<Entry<Integer, Integer>> o){
		int coOrd[]={2,2};
		
		return 0;
	}
	
 * static int findCost(Object o){
		int coOrd[]={2,2};
		String s[]=o.toString().split("=");
		for(String ch:s)
			System.out.println(ch);
		return 0;
	}
	
	String s[]=o.toString().split("=");
		for(String ch:s){
			int cc=Integer.parseInt(ch);
			
		}
 * */
