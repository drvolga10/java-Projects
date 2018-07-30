package com.tsystems.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMainClass {
	public static void main(String[] args) {
//		int val[]= {6,4,6,18,2,10};
		int val[]= {5,1,4,11,6};
		Pair pair[]=new Pair[val.length]; 
		for (int i=0;i<val.length;i++) {
			Pair pair2=new Pair(i, val[i]);
			pair[i]=pair2;
		}
		System.out.println("Before Sorting");
		for (Pair pair2 : pair) {
			System.out.println(pair2.getIndex()+" value: "+pair2.getValue());
		}
		Arrays.sort(pair);
		System.out.println("After Sorting");
		for (Pair pair2 : pair) {
			System.out.println(pair2.getIndex()+" value: "+pair2.getValue());
		}
		
		ArrayList<Integer>index=new ArrayList<>();
		int sum=0;
		for (int i=0;i<pair.length;i++) {
			if(i==0)
			{
				sum=sum+pair[i].getValue();
				index.add(pair[i].getIndex());
			}
			else
			{
				int ix=pair[i].getIndex();
				
				if(!index.contains(ix+1) && !index.contains(ix-1))
				{
					sum=sum+pair[i].getValue();
					index.add(pair[i].getIndex());
				}
			}
		}
		System.out.println(sum);
		
		for (Integer integer : index) {
			System.out.println("Value "+val[integer]+" index "+integer);
		}
		
		
	}

}
