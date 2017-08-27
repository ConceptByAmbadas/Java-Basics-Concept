package com.info.basic;

public class Methods {
	//Method with no parameter and no return type
	public  void display(){
		System.out.println("Happy learing");	}
	//Method with parameters
public void displaymarks(int eng,int maths,int phy)
{
System.out.println("English marks is:"+eng);
System.out.println("Math marks is:"+maths);
System.out.println("Physics marks is:"+phy);	
}
//method with return type and parameter
public int display_total(int eng,int maths,int phy)
{
	int total;
	total=eng+maths+phy;
	return total;
	}
	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.display();
		m1.displaymarks(56, 61, 73);
		int totalmarks=m1.display_total(56, 61, 73);
		System.out.println("Total marks is"+totalmarks);}}
	
