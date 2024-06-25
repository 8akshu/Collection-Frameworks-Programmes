package com.akshu.methods_collection;

import java.util.ArrayList;
import java.util.List;

public class CabCustomerService 
{
	private List<CabCustomer> listOfCust = new ArrayList();
	
	public void addCabCustomer(CabCustomer c)
	{
		listOfCust.add(c);
	}
	
	public boolean isFirstCustomer(CabCustomer c)
	{
		int count = 0;
		for(CabCustomer cs : listOfCust)
		{
			if(cs.getPhoneNumber().equals(c.getPhoneNumber()))
			{
				count++;
			}
		}
		
		if(count == 1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public double  calculateBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			return 0.0;
		}
		else if(c.getDistance() <= 4)
		{
			return 80.0;
		} 
		else
		{
			return 80+(c.getDistance()*6) ;
		}
	}
	
	public void printBill(CabCustomer c)
	{
		double bill = calculateBill(c);
		System.out.println(c.getCustName()+" please Please pay your bill of Rs. "+bill);
	}
	
}
