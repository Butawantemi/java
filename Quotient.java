import java.util.*;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        try {
             int quotient = v1 / v2;
             System.out.println("Quotient: " + quotient);
        
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        }

        System.out.println("Program executed successfully!");
        
    }
}
