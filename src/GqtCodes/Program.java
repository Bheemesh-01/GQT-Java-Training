package GqtCodes;
import java.util.Scanner;
// $ $ $ $ $ 
//public class Program {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 20; i++) {
//			System.out.print("$ ");
//		}
//	}
//}

// 1 1 1 1 1
//public class Program {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("1 ");
//		}
//	}
//}

// 1 2 3 4 5
//public class Program {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(i+" ");
//		}
//	}
//}

// 1 6 11 16 21
//public class Program {
//	public static void main(String[] args) {
//		int count=1;
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(count+" ");
//			count=count+5;
//		}
//	}
//}

// 25 20 15 10 5
//public class Program {
//	public static void main(String[] args) {
//		int count=25;
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(count+" ");
//			count=count-5;
//		}
//	}
//}

//public class Program {
//	public static void main(String[] args) {
////		Scanner is a built-in class in java
////		Any class if it has to be used the we have to create the object
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n: ");
//		int n = sc.nextInt();//which ever is the next integer value collect it & add into n
//		int count=n*n;
//		for (int i = 1; i <= n; i++) {
//			System.out.print(count+" ");
//			count=count-n;
//		}
//	}
//}

/*
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * 
 * Computing table:
 * row(i)	column-stars(j)
 *   1			5
 *   2			5
 *   3			5
 *   4			5
 *   5			5
 *   
 * Since there is 2 entities (row & column) we must use 2 loops.
 * 
 * The solution to this can be provided by making use of nested loops.
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("$ ");
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 */
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 1	2	3	4	5
 * 6	7	8	9	10
 * 11	12	13	14	15
 * 16	17	18	19	20
 * 21	22	23	24	25
 */
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		int count = 1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count++;
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 25	24	23	22	21
 * 20	19	18	17	16
 * 15	14	13	12	11
 * 10	9	8	7	6
 * 5	4	3	2	1
 */
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		int count = n*n;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count--;
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 1 	6	11	16	21
 * 2	7	12	17	22
 * 3	8	13	18	23
 * 4	9	14	19	24
 * 5	10	15	20	25	
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		int count = 1;
//		for(int i=1;i<=n;i++) {
//			count=i;
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count = count+n;
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * $ $ $ $ $ 	# # # # #
 * $ $ $ $ $ 	# # # # #
 * $ $ $ $ $ 	# # # # #
 * $ $ $ $ $ 	# # # # #
 * $ $ $ $ $ 	# # # # #
 * 
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("$ ");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * @
 * @ @
 * @ @ @ 
 * @ @ @ @
 * @ @ @ @ @
 * 
 * rows(i)	col(j)
 * 	  1		  1
 * 	  2		  2
 *    3		  3
 *    4		  4
 *    5		  5
 */


//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("@ ");
//			}
//			System.out.println();
//		}
//		
//	}
//}

/*
 * 		* * * * *
 * 		* * * *
 * 		* * *
 * 		* * 
 * 		*
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=i;j--) { //*
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
/*
 * 		* * * * *
 * 		* * * *
 * 		
 * 
 * Case-1:
 * 	n=5
 * 	i=1
 * 		j=n --> j=5
 * 		j>=i --> 5>=1 (condition true)
 * 		j-- --> j=4
 * 
 * 		j>=i ---> 4>=1 (condition true)
 * 		j-- --> j=3
 * 
 * 		j>=i ---> 3>=1 (condition true)
 * 		j-- --> j=2
 * 
 * 		j>=i ---> 2>=1 (condition true)
 * 		j-- --> j=1
 * 
 * 		j>=i ---> 1>=1 (condition true)
 * 		j-- --> j=0
 * 		
 * 		j>=i ---> 0>=1 (condition false)
 * 
 * i=2 '
 * 		j=n --> j=5
 * 		j>=i --> 5>=2 (condition true)
 * 		j-- --> j=4
 * 
 * 		j>=i ---> 4>=2 (condition true)
 * 		j-- --> j=3
 * 
 * 		j>=i ---> 3>=2 (condition true)
 * 		j-- --> j=2
 * 
 * 		j>=i ---> 2>=2 (condition true)
 * 		j-- --> j=1
 * 
 * 		j>=i ---> 1>=2 (condition false)
 */

/*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//
//	}
//}

/* 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 
 * 1 2 3 4 5
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//
//	}
//}

/* 1
 * 2 	3
 * 4 	5 	6
 * 7 	8	9 	10
 * 11	12	13	14	15
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int count=1;
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(count+"	");
//				count++;
//			}
//			System.out.println();
//		}
//
//	}
//}

/* & # # # # #
 * & & # # # # #
 * & & & # # # # #
 * & & & & # # # # #
 * & & & & & # # # # #
 * 
 * 
 * & & & & & # # # # #
 * & & & & # # # # #
 * & & & # # # # #
 * & & # # # # #
 * & # # # # #
 * 
 * & & & & & # # # # # 		@
 * & & & & 	 # # # # # 		@ @
 * & & & 	 # # # # # 		@ @ @
 * & & 			 # # # # # 		@ @ @ @
 * & 			 # # # # # 		@ @ @ @ @
 */


/*
 * Conditional Statements: These are the statements that are used to specify a conditional check before the 
 * 						   execution of a particular statement.
 * The conditional statements in programming are:
 * 1. if condition
 * 2. else if condition
 * 3. else condition
 * 
 * if(condition)
 * {
 * 		this block of code will execute if the condition inside if is satisfied
 * }
 * ----- in-case condition inside if fails then the else if condition will be checked ----
 * 
 * 
 * else if(condition)
 * {
 * 		this block of code will execute if the condition inside else if is satisfied
 * }
 * 
 * ----- in-case condition inside else if also fails then the else condition will be executed directly ----
 * 
 * else
 * {
 * 		this block of code is directly executed if both if and else if fails.
 * }
 * 
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age: ");
//		int age = sc.nextInt();
//		
//		if(age < 18)
//		{
//			System.out.println("You are still a minor. Please grow up and then think of marriage");
//		}
//		else if(age > 65)
//		{
//			System.out.println("You are a senior citizen. Stop expecting too much");
//		}
//		else
//		{
//			System.out.println("You are the most eligible groom/bride");
//		}
//	}
//}
/*
 * frequently used operations :
 * 
 * 1. AND operation
 * 		all specified conditions must be satisfied
 * 		it is indicated using " && " symbol
 * 
 * 2. OR operation
 *  	one of the specified conditions must be satisfied
 * 		it is indicated using " || " symbol
 * 
 * 3. NOT operation
 * 		It is used for checking the not equals condition
 * 		it is indicated using " ! " symbol
 * 
 * 4. equals to operation
 * 		It is used to check the equality of the two contents
 * 		it is indicated using " == " symbol
 * 
 * 5. not equals operations
 * 		It is used to check the non equality of the two contents
 * 		it is indicated using " != " symbol
 * 
 * 6. greater than operation
 * 7. lesser than operation
 * 8. greater than or equal to operation
 * 9. lesser than or equal to operation
 * 
 */

/*
 * 	# # # # #
 *  # - - - #
 *  # - - - #
 *  # - - - #
 *  # # # # #
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || i==n || j==1 || j==n) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}
/*
 * 	# 
 *  # #
 *  # - #
 *  # - - #
 *  # # # # #
 */

//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=i;j++) {
//				if(j==0 || i==j || i==n-1) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}


//Alphabet - A
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || j==n/2 || 
//						(i==n/2 && j<=n/2) || 
//						(i==0 && j<=n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - B
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || (j==n/2 && i!=0 && i!=n/2 && i!=(n-1))|| 
//						(i==n/2 && j<n/2) || 
//						(i==0 && j<n/2) || 
//						(i==(n-1) && j<n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

//Alphabet - C
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if((j==0 && i!=0 && i!=(n-1)) ||
//					i==0 && j!=0 && j<n/2||
//					i==(n-1) && j!=0 && j<n/2) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - D
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || (i==0 && j<n/2) || (i==n-1 && j<n/2)
//						|| (j==n/2 && i!=0 && i!=n-1)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - E
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || (i==0 && j<n/2) || (i==n-1 && j<n/2)
//						|| (i==n/2 && j<n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - F
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || (i==0 && j<n/2) 
//						|| (i==n/2 && j<n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - G
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if((j==0 && i!=0 && i!=(n-1)) ||
//				   (i==0 && j!=0 && j<=n/2) ||
//				   (i==n/2 && j>n/4 && j<n/2) ||
//				   (i==(n-1) && j>0 && j<=n/4)||
//				   (j==(n/4) && i>n/2) ||
//				   (j==(n/2) && i>n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
//
//	}
//}

//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) //n==10 --> 2 4 6 8 10
//		{
//			if(i%2==0) {
//				System.out.print("#");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//
//	}
//}
// # # #
//##

////Alphabet - H
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if(j==0 || j==n/2 || (i==n/2 && j<=n/2)) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

////Alphabet - I
//
//public class Program{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value:");
//		int n = sc.nextInt();
//		for(int i=0;i<=n-1;i++) {
//			for(int j=0;j<=n-1;j++) {
//				if((i==0 && j<n/2) ||(i==n-1 && j<n/2) || j==n/4) {
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

//Alphabet - J

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<n/2) ||(i==n-1 && j<n/4) || j==n/4 
						|| (j==0 && i>=(3*n)/4)) {
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












