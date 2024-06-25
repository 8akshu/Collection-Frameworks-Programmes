package com.akshu.methods_collection;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable
{
	private Integer studentId ;
	private String StudentName ;
	private Double studentFees ;
	private Date dateOfAdmission ;
	
	static Scanner sc = new Scanner(System.in);
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) 
	{
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		System.out.println("Enter Student Id : ");
		Integer studentId = sc.nextInt();
		
		System.out.println("Enter Student Name :");
		String studentName = sc.nextLine();
		studentName = sc.nextLine();
		
		System.out.println("ENter Student Fees :");
		Double studentFees = sc.nextDouble();
		
			
		return new Student(studentId, studentName, studentFees, new Date());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]\n";
	}


}
