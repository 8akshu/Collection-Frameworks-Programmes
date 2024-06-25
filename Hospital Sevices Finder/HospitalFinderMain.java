package com.akshu.methods_collection;

import java.io.IOException;
import java.util.HashMap;

public class HospitalFinderMain 
{
	public static void main(String[] args) throws IOException 
	{
		HospitalService hs = new HospitalService(111);
		
		HashMap<Integer, String> hospitals = hs.getHospitals();
		
		String hospitalDetails = hs.getHospitalDetails(111);
		
		System.out.println(hospitals);
		System.out.println(hospitalDetails);
	}

}
