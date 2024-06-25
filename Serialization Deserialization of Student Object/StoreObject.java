package com.akshu.methods_collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		var fot = new FileOutputStream("D://LOVE//Student.txt");
		
		var oos = new ObjectOutputStream(fot);
		
		ArrayList<Student> stdArr = new ArrayList<>();
		
		try(oos ; fot)
		{
			System.out.println("How many Student Data You Want to Store :");
			int size = sc.nextInt();
			
			for(int i = 1 ; i <= size ; i++)
			{
				Student student = Student.getStudentObject();
				stdArr.add(student);
			}
			
			oos.writeObject(stdArr);
			
			System.out.println("Student Data Added Successfully ...");
			
		}

	}

}
