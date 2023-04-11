package com.gqt.arraysproj.package1;

import java.util.Arrays;

//Write a program to sort the given array
// arr[] = 23,45,11,32,15,77,61,5,1

public class ArrayCode7 {
	public static void main(String[] args) {
		int arr[] = {23,45,11,32,15,77,61,5,1};
		//Arrays is a built-in class that is 
		//available inside the util package
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
