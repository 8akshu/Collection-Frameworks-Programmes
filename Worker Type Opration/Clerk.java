package com.akshu.methods_collection;

import java.util.Scanner;

public class Clerk extends Worker
{
	private Integer speed;
	private Integer accuracy;
	private Boolean slaryFlag = false;
	
	Scanner sc = new Scanner(System.in);
	
	public Clerk() 
	{
		super();
	}
	
	public Clerk(String name, Integer id, Double salary,Integer speed, Integer accuracy)
	{
		super(name,id,salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
		if(accuracy > 80 && slaryFlag == false)
		{
			slaryFlag = true;
			System.out.print("Enter Employee Current Salary : ");
			Double salary = sc.nextDouble();
			setSalary(salary);
			if(getSalary() > salary )
			{
				System.out.println("Employee Salary Incresed by 1000...");
			}
		}
	}

	public Integer getAccuracy() 
	{
		return accuracy;
	}

	public void setAccuracy(Integer accuracy) 
	{
		this.accuracy = accuracy;
		if(accuracy > 80 && slaryFlag == false)
		{
			slaryFlag = true;
			System.out.print("Enter Employee Current Salary : ");
			Double salary = sc.nextDouble();
			setSalary(salary);
			if(getSalary() > salary )
			{
				System.out.println("Employee Salary Incresed by 1000...");
			}
		}
	}
	
	@Override
	public void setSalary(Double salary)
	{
		if(this.speed > 70 && accuracy > 80)
		{
			super.setSalary(salary + 1000);
		}
		else
		{
			super.setSalary(salary);
		}
	}

	@Override
	public String toString() {
		return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", Name=" + getName() + ", Id=" + getId()
				+ ", Salary =" + getSalary() + "]";
	}
	
	
	
	
}
