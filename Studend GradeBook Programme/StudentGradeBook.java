package com.akshu.methods_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<String , Integer> stdMap = new HashMap<>();
		
		while(true)
		{
			System.out.println("Student Grade Book: ");
			System.out.println(stdMap.isEmpty()?"No Student to SHow"  :stdMap );
			
			System.out.println("Options:\r\n"
					+ "1. Add Student Grade\r\n"
					+ "2. Remove Student Grade\r\n"
					+ "3. Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.print("Enter Student Name : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.print("Enter Student Grade : ");
				int grade = sc.nextInt();
		
				stdMap.put(name, grade);
				System.out.println("Student Added Successfully...");	
			}
				break;
			
			case 2:
			{
				System.out.println(stdMap.isEmpty()?"No Student to SHow"  :stdMap );
	
				System.out.print("Enter Student Name to remove from Grade Book: ");
				String name = sc.nextLine();
				name = sc.nextLine();
				if(stdMap.containsKey(name))
				{
					stdMap.remove(name);
					System.out.println("Student Removed Successfully....");
				}
				else
				{
					System.out.println("Studeny not found....");
				}
			}
				break;
				
			case 3:
			{
				System.out.println("Thank you for Using Student grade Programe..");
				System.exit(0);
			}
				break;
				
			default:
			{
				System.out.println("choice is invalid...");
			}
				break;	
				
			}
			
		}
	}
	
}
