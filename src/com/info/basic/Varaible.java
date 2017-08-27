package com.info.basic;

public class Varaible {
	
	int engMarks;
    int mathsMarks;
    int phyMarks;
    static int b;
    int a=10;
    int c;
   public  void fun()
    {
    	int x= 10; //Error: Static local variables are not allowed
    	b=10;
    	
    	System.out.println("B is"+b+"and"+c);
    }
	public static void main(String args[])
    {   //first object
		Varaible obj1 = new Varaible();
        obj1.engMarks = 50;
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;
 
        //second object
        Varaible obj2 = new Varaible();
        obj2.engMarks = 80;
        obj2.mathsMarks = 60;
        obj2.phyMarks = 85;
 
        //displaying marks for first object
        System.out.println("Marks for first object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
     
        //displaying marks for second object
        System.out.println("Marks for second object:");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);
        System.out.println(obj2.phyMarks);
obj2.fun();
    }	

}
