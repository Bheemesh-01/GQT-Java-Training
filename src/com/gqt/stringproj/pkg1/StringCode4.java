package com.gqt.stringproj.pkg1;

public class StringCode4 {
	public static void main(String[] args) {
		String s1 = "Global";
		String s2 = "gloBaL";
		
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
