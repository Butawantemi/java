public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 6, 7},
            {478, 89, 90},
            {5,6,7}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.println(i + " " + j);
            }
        }
    }
}
