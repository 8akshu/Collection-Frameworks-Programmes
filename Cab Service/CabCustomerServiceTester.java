package com.akshu.methods_collection;

public class CabCustomerServiceTester 
{
	public static void main(String[] args)
	{
		CabCustomerService ccs = new CabCustomerService();
		
		CabCustomer c1 = new CabCustomer(11, "Akshay", "Ameerpet", "Nampally" ,12, "111111");
		CabCustomer c2 = new CabCustomer(22, "karan", "SR Nagar", "Seccundarabad" ,4, "222222");
		
		ccs.addCabCustomer(c1);
		ccs.addCabCustomer(c2);
		
		boolean isFirstC1 = ccs.isFirstCustomer(c1);
		boolean isFirstC2 = ccs.isFirstCustomer(c2);
		
		System.out.println("is "+c1.getCustName()+" Frist Time Customer : "+isFirstC1);
		System.out.println("is "+c2.getCustName()+" Frist Time Customer : "+isFirstC2);
		
		ccs.printBill(c1);
		ccs.printBill(c2);
		
		CabCustomer c3 = new CabCustomer(22, "karan", "SR Nagar", "Seccundarabad" ,6, "222222");
		
		ccs.addCabCustomer(c3);
		
		isFirstC2 = ccs.isFirstCustomer(c3);
		
		System.out.println("is "+c3.getCustName()+" Frist Time Customer : "+isFirstC2);
		
		ccs.printBill(c3);
		
	}

}
