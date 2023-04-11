package com.gqt.arraysproj.package1;

import java.util.Scanner;

/*		 (i)	   (j)		   (k)
 * 		school    class		students
 * 		  0			0			2
 * 					1			3
 * 		  1			0			3
 * 					1			4
 * 					2			5
 */

public class ArrayCode6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of schools: ");
		int scl = sc.nextInt();
		
		int arr[][][] = new int[scl][][];// three dimensional jagged array
		//taking class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside the school "+(i+1));
			arr[i] = new int[sc.nextInt()][];
		}
		
		//taking student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside scool "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students inside the class "+(j+1));
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		// storing the marks
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside school :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class :" + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter marks of student no: " + 
				(k + 1));
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		// fetching the marks
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside school :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class :" + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The marks of student no: " + 
				(k + 1) + " is: " + arr[i][j][k]);
				}
			}
		}
	}
}
