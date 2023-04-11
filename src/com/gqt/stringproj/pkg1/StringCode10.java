package com.gqt.stringproj.pkg1;

import java.util.Scanner;

//WAP to find the total count of vowels and consonants in the given string
public class StringCode10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		str = str.toLowerCase();
		int vowels_cnt=0;
		int cons_cnt=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'
				|| str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowels_cnt++;
			}
			else {
				cons_cnt++;
			}
		}
		System.out.println("Vowel count is : "+vowels_cnt);
		System.out.println("Consonant count is : "+cons_cnt);
	}
	
}
