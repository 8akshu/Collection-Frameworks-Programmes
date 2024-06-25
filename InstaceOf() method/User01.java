package com.akshu.methods_collection;

public class User01
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		A_Class a =(A_Class)Class.forName("com.akshu.methods_collection.A_Class").newInstance();
		a.setA(10);
		a.setB(20);
		System.out.println("Sum is :"+a.m1());
		
		B_Class b = (B_Class)Class.forName("com.akshu.methods_collection.B_Class").newInstance();
		b.setA(10);
		b.setB(20);
		System.out.println("Product is : "+b.m1());
		
		C_Class c = new C_Class();
		c.display(5, 10);
		
	}
}
