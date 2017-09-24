package com.info.basic;

public class OverridingDemo extends Overloading{
	
	int getRateOfInterest(){return 9;}  

	public static void main(String[] args) {
		
		OverridingDemo demo=new OverridingDemo();
		
		System.out.println(demo.getRateOfInterest());
	}

}
