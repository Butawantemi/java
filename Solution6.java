/*
 *  Problem statement:
 * Write a program to input an integer N and print the sum of all its
 * even digits and all its odd digits separately.
 * Digits mean numbers, not the places! If the given integer is "13245", 
 * the even digits are 2 and 4, and the odd digits are 1, 3, and 5.
 */

import java.util.Scanner;

class Solution6 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        
        while (N > 0) {
            int mod = N % 10;
            N /= 10;
            
            if (mod % 2 == 0) {
                    evenSum += mod;
                    
                } else {
                    oddSum += mod;
                    
                }
                
        }
        System.out.println(evenSum + " " + oddSum);
	}
}
