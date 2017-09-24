package com.info.basic;

public class MethodOverloading
{
	static int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	static int add(int x,float y)
	{
		System.out.println(x+y);
		
		return (int) (x+y);
	}

public static void main(String args)
{
	MethodOverloading s1=new MethodOverloading();
	
	s1.add(12, 20);

	
	}

}