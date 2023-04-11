package com.gqt.stringproj.pkg1;

public class StringCode5 {
	public static void main(String[] args) {
		String s1 = "Global";
		String s2 = "Global";
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
/* G	l	 o    b    a    l
 * 71  108  111  98   97   108
 * 
 * 0	0	 0    0    0    0
 * 
 * G	l	 o    b    a    l
 * 71  108  111  98   97   108
 * 
 * -32
 * 
 * g	l	 o    B    a    L
 * 103 108  111   66  97   76
 * 
 * 
 */
