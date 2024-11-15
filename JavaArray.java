/*
 * Initilizing and Assign Array in Java.
 * Looop through array and find sum of item in array.
 */

public class JavaArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } */
        int sum = 0;
        for (int number : arr) {
            sum += number;
            
        }
        System.out.println(sum);
    }
}
