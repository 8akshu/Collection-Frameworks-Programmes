package com.akshu.methods_collection;

public class C_Class 
{
	public void display(int a1, int b1) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		A_Class a =(A_Class)Class.forName("com.akshu.methods_collection.A_Class").newInstance();
		a.setA(a1);
		a.setB(b1);
		System.out.println("Sum is :"+a.m1());
		
		B_Class b = (B_Class)Class.forName("com.akshu.methods_collection.B_Class").newInstance();
		b.setA(a1);
		b.setB(b1);
		System.out.println("Product is : "+b.m1());
	}
}
