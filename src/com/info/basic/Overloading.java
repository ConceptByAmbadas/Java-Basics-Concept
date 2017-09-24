package com.info.basic;

public class Overloading {

	
	public int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading s1=new MethodOverloading();
		Overloading s2=new Overloading();
		MethodOverloading.add(12,23);
		MethodOverloading.add(12, 12.3f);
		s2.add(10,30);
	}

}
