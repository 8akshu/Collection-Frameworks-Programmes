package com.akshu.methods_collection;

public class Car 
{
	private Engine engine;

	public Car(Engine engine) 
	{
		super();
		this.engine = engine;
	}
	
	public void drive(int mode)
	{
		if(mode == 0)
		{
			System.out.println("Engine started");
		}
		else if(mode == 1)
		{
			System.out.println("Engine fail kindly try once");
		}
		else if(mode == 2)
		{
			System.out.println("Need Servicing!!!!");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

	public Engine getEngine() 
	{
		return engine;
	}
}
