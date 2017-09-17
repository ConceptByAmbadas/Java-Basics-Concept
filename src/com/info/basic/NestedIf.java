package com.info.basic;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		 if (i == 10)
	        {
	            // First if statement
	            if (i < 15)
	                System.out.println("i is smaller than 15");
	 
	            // Nested - if statement
	            // Will only be executed if statement above
	            // it is true
	            if (i < 2)
	                System.out.println("i is smaller than 12 too");
	            else
	                System.out.println("i is greater than 15");
	        }
	}

}
