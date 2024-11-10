/*
 * Java Switch Statement.
 */

public class JavaSwitchStatement {
    public static void main(String[] args) {
        int i = 6; 
        switch (i) {
            case 0:
                System.out.println("i is zero");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2: 
                System.out.println("i is two.");
            default:
                System.out.println("i is greater than two.");
                break;
        }
    }
}
