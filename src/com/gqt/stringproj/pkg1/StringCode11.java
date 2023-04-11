package com.gqt.stringproj.pkg1;

import java.util.Scanner;
// WAP to count total number of words in the given string
// input: "Hi good Morning"
// output: 3
// according to general English terms
// no: of words = total no: of spaces in the string + 1;
public class StringCode11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();//used to collect sentences
		int spc_cnt=0;
		//it will remove un-necessary spaces in the beginning and at the end of the string
		str = str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spc_cnt++;
			}
		}
		int word_cnt=spc_cnt+1;
		System.out.println("Word count = "+word_cnt);
		
	}
}
