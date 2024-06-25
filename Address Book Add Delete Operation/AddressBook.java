package com.akshu.methods_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Map<String, Long> addressBook = new HashMap<String, Long>();
		
		while(true)
		{
			System.out.println("Address Book:");
			
			System.out.println("Options:\r\n"
					+ "1. Add Contact\r\n"
					+ "2. Remove Contact\r\n"
					+ "3. Exit");
			
			System.out.println(addressBook.isEmpty() ? "Address book is Empty" : addressBook);
			
			System.out.print("Enter your Choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
			{
				System.out.print("Enter contact name : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				
				System.out.print("Enter contact Number : ");
				long number = sc.nextLong();
				
				addressBook.put(name, number);
				System.out.println("Contact Added Successfully...");
				
			}
			break;	
			
			case 2: 
			{
				if(addressBook.isEmpty()) 
				{
					System.out.println("Address book is Empty");
				} 
				else
				{
					System.out.println("Enter contact name to Remove: ");
					String name = sc.nextLine();
					name = sc.nextLine();
					
					if(addressBook.containsKey(name))
					{
						addressBook.remove(name);
						System.out.println("Contact removed Successfully..");
					}
					else
					{
						System.err.println("Contact not Found..");
					}
				}
			}
				break;	
				
			case 3: 
			{
				System.out.println("Thank you for being with us");
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
