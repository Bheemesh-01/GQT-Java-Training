package com.gqt.stringproj.pkg1;
//What do you mean by the statement "Immutable Strings cannot be changed
public class StringCode7 {
	public static void main(String[] args) {
		String s1 = "Sita";
		String s2 = "Ravana";
		
		//s1.concat(s2);//immutable
		s1 = s1.concat(s2);
		
		System.out.println(s1);
	}
}
