package com.info.basic;

public class Varaible {
	

	 int engMarks;
    int mathsMarks;
    int phyMarks;
    static int b= 40;
    int a=10;
    static int c=60;
    
      
    public Varaible()
    {
    
    	c=12;
    	System.out.println("Value of c"+c);
    }
    
    public  void show(int a,int b,int c)
    {
    	
    	System.out.println("value of a is"+c);
    	
    }
   public static void fun()
    {
    	
    	b=10;
    	c=20;
    	
    	System.out.println("B and C is "+b+"and"+c);
    }
	public static void main(String args[])
    {   //first object
		Varaible obj1 = new Varaible();
        obj1.engMarks = 50;
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;
        obj1.c=50;
        
 
        //second object
        Varaible obj2 = new Varaible();
        obj2.engMarks = 80;
        obj2.mathsMarks = 60;
        obj2.phyMarks = 85;
        obj2.c=90;
        
        System.out.println("Value of c is"+c);
        obj1.show(10, 20, 30);
        
        
        //displaying marks for first object
        System.out.println("Marks for first object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
        System.out.println("Value of c is"+obj1.c);
     
        //displaying marks for second object
        System.out.println("Marks for second object:");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);
        System.out.println(obj2.phyMarks);
        System.out.println("Value of c is"+obj1.c);
        
        //Static varaible
        
        
        Varaible.fun();
    }	

}
