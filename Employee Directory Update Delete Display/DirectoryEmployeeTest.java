package com.akshu.methods_collection;

public class DirectoryEmployeeTest {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Akshay", "Developer",60000);
		Employee emp2 = new Employee("Karan", "Associate", 40000);
		Employee emp3 = new Employee("Sandesh", "Analyst",45000);
		
		Directory dir1 = new Directory();
		
		//Adding Employee into Directory
		dir1.addEmployee(emp3);
		dir1.addEmployee(emp1);
		dir1.addEmployee(emp2);
		
		//Display Employee
		dir1.displayAllEmployee();
		
		dir1.updateEmployee(2);
		
		dir1.deleteEmployee(2);
		
		dir1.displayAllEmployee();
		
	}

}
