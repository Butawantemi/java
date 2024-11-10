/*
 * Java Nested If Statement.
 */

public class JavaNestedIfStatement {
    public static void main(String[] args) {
        int a = 20;
        if(a == 20) {
            if(a < 25) {
                System.out.println("a is less than 25");
            } 

            if(a < 22) {
                System.out.println("a is less than 22");
            } else {
                System.out.println("a is greater than 25");
            }
        }
    }
}
