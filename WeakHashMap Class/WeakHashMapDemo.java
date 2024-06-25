package com.akshu.methods_collection;

import java.util.Map;
import java.util.WeakHashMap;

class A 
{
	int age ;
	String name ;
	
	public A(String name, int age)
	{
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
}
public class WeakHashMapDemo
{
	public static void main(String[] args) 
	{
		A s1 = new A("Akshay", 23);
		A s2 = new A("karan", 22);
		
		WeakHashMap <A , Integer> wkMap = new WeakHashMap<>();
		wkMap.put(s1, 3);
		wkMap.put(s2, 1);
		
		System.out.println(wkMap);
		s2=null;
		System.gc();
		System.out.println(wkMap);	
	}
}
