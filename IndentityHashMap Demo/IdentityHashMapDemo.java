package com.akshu.methods_collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("A", 1);
		hMap.put(new String("A"), 2);
		hMap.put("B", 3);
		System.out.println(hMap);
		
		Map<String, Integer> iMap = new IdentityHashMap<>();
		iMap.put("A", 1);
		iMap.put(new String("A"), 2);
		iMap.put("B", 3);
		System.out.println(iMap);
	}
}
