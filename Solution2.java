import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputUser = sc.next().charAt(0);
        if (Character.isUpperCase(inputUser)) {
            System.out.println(1);
        } else if (Character.isLowerCase(inputUser)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
