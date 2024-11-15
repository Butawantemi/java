/*
 * Copy an array using arraycopy method.
 */

import java.util.Arrays;

public class CopyArray3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
         
        int[] copyNumbers = new int[numbers.length];

        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);

        System.out.println(Arrays.toString(copyNumbers));
    }
}
