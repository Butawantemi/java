/*
 * Copy an array is loop costruct.
 */

import java.util.*;

public class CopyArray2 {
    public static void main(String[] args) {
       int[] source = {1, 2, 3, 4, 5};
       int[] destination = new int[5]; 


       for (int i = 0; i < source.length; ++i) {
        destination[i] = source[i];
       }

       System.out.println(Arrays.toString(destination));
    }
}
