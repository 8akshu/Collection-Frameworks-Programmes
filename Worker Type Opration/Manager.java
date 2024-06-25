package com.akshu.methods_collection;

import java.util.Scanner;

public class Manager extends Worker
{
	private ManagerType manager;
	
	public Manager() 
	{
		super();
	}
	
	public Manager(String name, Integer id, Double salary, ManagerType mannager) 
	{
		super(name,id,salary);
		this.manager = mannager;
	}
	
	@Override
	public void setSalary(Double salary)
	{
		if(manager.equals(ManagerType.HR))
		{
			super.setSalary( salary  + 10000);
		}
		else
		{
			super.setSalary(salary + 5000);
		}
	}

	@Override
	public String toString() {
		return "Manager [manager=" + manager + ", Name=" + getName() + ", Id=" + getId() + ", Salary ="
				+ getSalary() + ", ]";
	}

	
	
	
}
