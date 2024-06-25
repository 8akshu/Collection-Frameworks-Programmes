package com.akshu.methods_collection;

import java.util.ArrayList;
import java.util.List;

public class DuplicateTestDemo {

	public static void main(String[] args)
	{
		List<Integer> arrList = new ArrayList<>(); 
		
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(10);
		arrList.add(30);
		arrList.add(10);
		arrList.add(30);
		arrList.add(40);

		Duplicates dup = new Duplicates(arrList);
		
		System.out.println(dup.getDuplicatesList());

	}

}
