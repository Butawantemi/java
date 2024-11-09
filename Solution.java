/* import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int age = sc.nextInt();

		System.out.println("The name of the person is" + " " + name + " " + "and the age is " + age + ".");
		
	}
} */

/* import java.lang.reflect.Array;
import java.util.Scanner;

public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNumber(a, b);
    }


    public static void swapNumber(int []a, int []b) {
        // Write your code here.
       int temp = a[0];
         a[0] = b[0];
         b[0]= temp;
         System.out.println(a[0] + " " + b[0]);
    }
} */

/*
 * This use to calculate simple interest by take user input
 * @principalAmount
 * @rateInterest
 * @time
 * using Scanner
 */


import java.util.* ;
import java.io.*; 

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		int principalAmount = sc.nextInt();
		float rateInterest = sc.nextFloat();
		int time = sc.nextInt();

		int simpleInterest = (int) Math.floor(principalAmount * rateInterest * time)/ 100;
	    System.out.println(simpleInterest);
	}
}