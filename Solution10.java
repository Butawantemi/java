/*
 *  Problem statement:
 * Write a program to count the number of 1's in the binary representation of an integer.
 */

import java.util.* ;
import java.io.*; 
public class Solution10 {
	public static int countSetBits(int n) {
		// Write your code here.
		int binaryNamber = 0;
		int i = 1;
		while (n != 0) {
		  int mod = n % 2;
		  n /= 2;
		  binaryNamber += mod * i;
		  i *= 10;
		}
		return binaryNamber;
	}

	public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
        
		 System.out.println(countSetBits(n));
	}
}
