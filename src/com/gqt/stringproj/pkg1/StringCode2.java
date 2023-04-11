package com.gqt.stringproj.pkg1;

public class StringCode2 {
	public static void main(String[] args) {
		String s1 = "Global";
		String s2 = "global";
		
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
