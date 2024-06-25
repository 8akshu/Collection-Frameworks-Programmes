package com.akshu.methods_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directory 
{
	List<Employee> empDir = new ArrayList<Employee>();
	
	Scanner sc =new Scanner(System.in);
	
	public void addEmployee( Employee e)
	{
		empDir.add(e);
	}
	
	public void displayAllEmployee()
	{
		for(Employee emp : empDir)
		{
			System.out.println((Employee)emp);
		}
	}
	
	public void updateEmployee(int index)
	{
		Employee e = (Employee) empDir.get(index);
		
		while(true)
		{
			System.out.println("Enter Your choice:");
			System.out.println("1. Update Name  \n2. Update position \n3. Update Salary \n4. Exit");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1 : 
				{
					System.out.println("Enter Name :");
					String name = sc.next();
					e.setName(name);
					System.out.println(e.getName());
				}
				break;
				case 2 : 
				{
					System.out.println("Enter Position :");
					String position = sc.next();
					e.setPosition(position);
					System.out.println(e.getPosition());
				}
				break;
				case 3 : 
				{
					System.out.println("Enter Salary :");
					double salary = sc.nextDouble();
					e.setSalary(salary);
					System.out.println(e.getSalary());
				}
				break;
				case 4 :
				{
					System.out.println("Update Successful..");
				}
				break;
				default : 
					System.out.println("Invalid Input..");
			}
			
			if(choice == 4) break;
		}
	}
	

	public void deleteEmployee(int index )
	{
		empDir.remove(index);
		System.out.println("Employee Deleted Successfully at index: "+index);
		System.out.println(empDir);
	}
}
