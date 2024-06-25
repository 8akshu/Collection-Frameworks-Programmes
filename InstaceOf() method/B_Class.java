package com.akshu.methods_collection;

public class B_Class implements I1
{
	private Integer a, b;

	public B_Class() {
		super();
	}

	public B_Class(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int m1() 
	{
		return a*b;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
}
