package GqtCodes;

import java.util.Scanner;

public class GQTPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			//logic for G
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 && i!=(n-1)) ||
						(i==0 && j!=0 && j<=n/2) ||
						(i==n/2 && j>n/4 && j<n/2) ||
						(i==(n-1) && j>0 && j<=n/4)||
						(j==(n/4) && i>n/2) ||
						(j==(n/2) && i>n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}

			}

			// logic for Q
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j!=0 && j<3*n/4)||
						(i==3*n/4 && j!=0 && j<3*n/4)||
						(j==0 && i!=0 && i<3*n/4)||
						(j==3*n/4 && i!=0 && i<3*n/4)||
						(i==j && i>=n/2))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}

			}

			System.out.print("    ");
			// logic for T
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j<n/2 || j==n/4)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
