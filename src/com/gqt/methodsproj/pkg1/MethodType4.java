package com.gqt.methodsproj.pkg1;

class Calculator4{
	 //* return type : int (contains return value)
	 //* parameters  : contain parameters
	int add(int a, int b) //method with input & output
	{
		int c = a+b;
		return c;
	}
}
public class MethodType4 {
	public static void main(String[] args) {
		Calculator4 c4 = new Calculator4();
		int res = c4.add(10, 20);
		System.out.println("Output from main: "+res);
	}
}
