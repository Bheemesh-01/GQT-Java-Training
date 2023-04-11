package com.gqt.stringproj.pkg1;

public class StringCode6 {
	public static void main(String[] args) {
		String s1 = "MaHaBharatHA";
		System.out.println(s1.toUpperCase());//MAHABHARATHA
		System.out.println(s1.toLowerCase());//mahabharatha
		System.out.println(s1.charAt(5));//h
		//System.out.println(s1.charAt(50));//ArrayIndexOutOfBoundException
		System.out.println(s1.indexOf('B'));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.startsWith("MaHa"));//true
		System.out.println(s1.startsWith("Vaha"));//false
		System.out.println(s1.endsWith("ratHA"));//true
		System.out.println(s1.endsWith("Vaha"));//false
		System.out.println(s1.contains("Bharat"));//true
		System.out.println(s1.contains("Vharat"));//false
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('a'));
	}
}

/*
 *  0	1	2	3	4	5	6	7	8	9	10	11
 *	M	a	H	a	B	h	a	r	a	t	H	A 
 */




