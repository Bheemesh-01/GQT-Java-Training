package com.gqt.stringproj.pkg1;

import java.util.Scanner;

//wap to remove the unnecessary spaces in between the strings
// sample i/p : hi      good     morning
// sample o/p : hi good morning
public class StringCode13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
				
			}
			else {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}
}
