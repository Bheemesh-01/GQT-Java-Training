package com.gqt.arraysproj.package1;

import java.util.Scanner;

/*		 (i)	   (j)
 * 		class	students
 * 		  0			3
 * 		  1			4
 *  	  2			5
 */
public class ArrayCode5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of classes: ");
		int cls = sc.nextInt();
		
		int arr[][] = new int[cls][];//two dimensional jagged array
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of students inside the class : "+(i+1));
			arr[i] = new int[sc.nextInt()];
		}
		
		//storing the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter marks of student no: "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		//fetching the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student no: "+(j+1)+" is: "+arr[i][j] );
			}
		}
	}
}
