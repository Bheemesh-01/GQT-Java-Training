package com.gqt.methodsproj.pkg1;

class Calculator1{
	// * return type : void (no return value)
	// * parameters  : no parameters
	void add() //method with no input & no output
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
}
public class MethodType1 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.add();
	}
}
