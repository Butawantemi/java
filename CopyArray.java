public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5};
        int[] positiveNumbers = numbers;
        numbers[0] = 3;
        
        for (int num: positiveNumbers) {
            System.out.println(num + ",");
        }

    }
}
