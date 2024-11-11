/*
 *  Problem statement
 * Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E),
 * and Step Size (W), you need to convert all Fahrenheit values from Start to
 * End at the gap of W into their corresponding Celsius values and print the table.
 * Note: Print the floor of the Celsius values if they are non-negative else print its ceil value. 
 */


import java.util.* ;
import java.io.*; 
class Solution5 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);

        int startFahrenheit = sc.nextInt();
        int endFahrenheit = sc.nextInt();
        int stepSize = sc.nextInt();

        for (int currentFahrenheit = startFahrenheit; currentFahrenheit <= endFahrenheit; currentFahrenheit += stepSize) {
            float celsius = (5.0f / 9) * (currentFahrenheit - 32);
            
            int result = (celsius >= 0) ? (int) Math.floor(celsius) : (int) Math.ceil(celsius);

            System.out.println(currentFahrenheit + "\t" + result);
        }


		
	}
}
