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

import java.lang.reflect.Array;

public class Solution{
    public static void main(String args[]) {
        int []a = {6};
        int []b = {5};
        swapNumber(a, b);
    }


    public static void swapNumber(int []a, int []b) {
        // Write your code here.
       int temp = a[0];
         a[0] = b[0];
         b[0]= temp;
         System.out.println(a[0] + " " + b[0]);
    }
}