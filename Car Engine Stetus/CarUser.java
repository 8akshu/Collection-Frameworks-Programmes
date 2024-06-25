package com.akshu.methods_collection;

public class CarUser 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car(new MockSuccessEngine());
		Car c2 = new Car(new MockFailAndRetryEngine());
		Car c3 = new Car(new MockServicingEngine());
		
		int mode1 = c1.getEngine().mode();
		int mode2 = c2.getEngine().mode();
		int mode3 = c3.getEngine().mode();
		
		c1.drive(mode1);
		c2.drive(mode2);
		c3.drive(mode3);
		c1.drive(4);
	}
}
