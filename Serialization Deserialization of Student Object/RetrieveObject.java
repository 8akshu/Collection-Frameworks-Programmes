package com.akshu.methods_collection;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		var fin = new FileInputStream("D://Love//Student.txt"); 
		
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
			while(true)
			{
				System.out.println(ois.readObject());
			}
		} 
		catch (EOFException e) 
		{
			System.err.println("End Of File.....");
		}
	}

}
