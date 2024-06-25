package com.akshu.methods_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Duplicates
{
	private List<Integer> numberList;
	
	public Duplicates()
	{
		
	}
	

	public Duplicates(List<Integer> numberList)
	{
		super();
		this.numberList = numberList;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList)
	{
		this.numberList = numberList;
	}
	
	public List getDuplicatesList()
	{
		List<Integer> l1 = numberList;
		
		List<Integer> duplicateElement = new ArrayList<>();
		
		if(numberList.isEmpty())
		{
			return null;
		}
		else
		{	
			for(int i = 0; i < numberList.size(); i++)
			{
				int count = 1;
				for(int j = 0 ; j < numberList.size();j++)
				{
					if(numberList.get(i)==(numberList.get(j)) && i != j)
					{
						count++;
						numberList.set(j, null);
					}
				}
				if(count > 1 &&  numberList.get(i) != null)
				{
					duplicateElement.add(numberList.get(i));
				}
			}
			
			if(duplicateElement.isEmpty())
			{
				return null;
			}
			else
			{
				duplicateElement.retainAll(numberList);
				numberList.clear();
				numberList.addAll(l1);
				return duplicateElement;
			}
		}
	}
}
