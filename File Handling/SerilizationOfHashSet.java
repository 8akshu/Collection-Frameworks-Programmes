package com.akshu.methods_collection;

import java.io.EOFException;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class SerilizationOfHashSet 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		HashSet <String> set = new HashSet<>();
		set.add("Akshay");
		set.add("karan");
		set.add("sandesh");
		
		var fos = new FileOutputStream("D://LOVE//HashSet_Student");
		var oos = new ObjectOutputStream(fos);
		
		try(oos; fos)
		{
			oos.writeObject(set);
			System.out.println(" Serialization Completed");
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
		var fis = new FileInputStream("D://LOVE//HashSet_Student");
		var ois = new ObjectInputStream(fis);
		
		System.out.println("Desirialization from Existing File: ");
		try(ois ; fis)
		{
			while(true)
			{
				System.out.println(ois.readObject());
			}
		}
		catch(EOFException e)
		{
			System.out.println("Deserialization Complied");
		}
	}	
}
