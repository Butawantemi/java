/*
 * Copy multidimension array using arraycopy() method.
 */

import java.util.Arrays;

public class CopyArry6 {
    public static void main(String[] args) {
        int[][] source = {
            {1, 2, 3},
            {5, 6, 8},
            {0, 8}
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {
            destination[i] = new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, source[i].length);
        }
        System.out.println(Arrays.deepToString(destination));

    }
}
