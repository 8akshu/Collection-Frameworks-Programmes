package com.akshu.methods_collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class HospitalService
{
	private static ArrayList<Hospital> list = new ArrayList<>();

	public HospitalService(int hospitalCode) throws IOException
	{
		Hospital hs = new Hospital();
		Properties p = new Properties();
		FileInputStream fin = new FileInputStream("D:\\java workplace eclips\\Collection Framework\\src\\com\\akshu\\methods_collection\\hospital.properties");
		
		p.load(fin);
		hs.setHospitalName(p.getProperty("hospital1.name"));
		hs.setHospitalCode(hospitalCode);
		hs.setListOfTreatment(p.getProperty("hospital1.treatments"));
		hs.setContactPerson(p.getProperty("hospital1.contactPerson"));
		hs.setContactNumber(p.getProperty("contactNumber"));
		hs.setLocation(p.getProperty("hospital1.location"));
		
		list.add(hs);
	}
	
	public HashMap<Integer, String> getHospitals()
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		list.forEach(h -> map.put(h.getHospitalCode(), h.getHospitalName()));
		
		return map;
	}
	
	public String getHospitalDetails(Integer hospitalCode)
	{
		StringBuilder details = new StringBuilder() ;
		
		for(Hospital h : list)
		{
			if((int)h.getHospitalCode()== hospitalCode)
			{
				details.append(h.toString());
				break;
			}
		}
		
		return details.toString();
	}
	
}