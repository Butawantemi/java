import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Solution9 {
    public static List< Integer > printDivisors(int n) {
        // Write your code here
       List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(printDivisors(n));
        
    }
}
