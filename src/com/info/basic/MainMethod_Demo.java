package com.info.basic;

public class MainMethod_Demo {
	static boolean flag=false;
	int a=10;
	static int b=50;
	{
		// This code is executed before every constructor.
		System.out.println("Common part of constructors invoked !!");
	}
	static
	{

		System.out.println("Welcome1");	
	}
	public boolean MainMethod_Demo()
	{

		if(a==b)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		System.out.println("Constructor");
		System.out.println("flag is"+flag);
		return flag;

	}

	public void show()
	{
		System.out.println("Addition is"+(a+b));	
	}
	static public void main(String[] ambadas) {

		MainMethod_Demo d1 =new MainMethod_Demo();
		System.out.println("Welcome");
		d1.MainMethod_Demo();
		
	}

}
