import java.util.Arrays;

public class CopyArray4 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 10};

        int[] copyNumbers = new int[numbers.length];

        copyNumbers = Arrays.copyOfRange(numbers, 0, numbers.length);

        System.out.println(Arrays.toString(copyNumbers));
    }
}
