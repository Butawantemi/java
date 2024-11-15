/*
 * Copy multidimension array using Loop for.
 */

import java.util.Arrays;

public class CopyArray5 {
    public static void main(String[] args) {
        int[][] source = {
            {1, 2, 3},
            {5, 6, 8},
            {0, 8}
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {
            destination[i] = new int[source.length];

            for (int j = 0; j < source[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }

        System.out.println(Arrays.deepToString(destination));
    }
}
