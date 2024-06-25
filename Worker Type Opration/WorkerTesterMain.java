package com.akshu.methods_collection;

public class WorkerTesterMain 
{
	public static void main(String[] args)
	{
		Manager m1 = new Manager("sanjay", 111, 50000.0, ManagerType.HR);
		System.out.println(m1);
		
		Clerk c2 = new Clerk("Krish", 333, 12000.0, 72, 65);
		System.out.println(c2);
		
		c2.setAccuracy(82);
		System.out.println(c2);
		
		c2.setSpeed(80);
		System.out.println(c2);
		
	}

}
