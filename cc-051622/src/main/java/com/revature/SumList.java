package com.revature;

import java.util.Arrays;
import java.util.LinkedList;

public class SumList {

	public static void main(String[] args) {
		LinkedList<Integer> num1 = new LinkedList<Integer>(Arrays.asList(7, 1, 6));
		LinkedList<Integer> num2 = new LinkedList<Integer>(Arrays.asList(5, 9, 2));
		
		System.out.println("Input:");
		System.out.println("List1: " + num1);
		System.out.println("List2: " + num2);
		System.out.println();
		sumLists(num1,num2);
		
	}
	
	public static void sumLists(LinkedList<Integer> a,LinkedList<Integer>b) {
		String s1 = "";
		String s2 = "";
		for(int i=a.size()-1;i>=0;i--) {
			s1 += a.get(i);
		}
		for(int i=b.size()-1;i>=0;i--) {
			s2 += b.get(i);
		}
		
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println("Output:");
		System.out.println(s1 + " + " + s2 + " = " + sum);
		
		LinkedList<Integer>newList = new LinkedList<Integer>();
		
		for(int i=Integer.toString(sum).length()-1;i>=0;i--) {
			newList.add(sum%10);
			sum/=10;
		}
		
		System.out.println("SumList: " + newList);
		
		stackMin(newList);
	}
	
	public static void stackMin(LinkedList<Integer>list) {
		int min = list.get(0);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min)
				min = list.get(i);
		}
		
		System.out.println("\nMin value of SumList: " + min);
	}

}
