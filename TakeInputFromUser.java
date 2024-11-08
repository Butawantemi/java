import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your first name: ");
      String firstName = sc.nextLine();

      System.out.println("Enter your last name: ");
      String lastName = sc.nextLine();

      String fullName = firstName + "\t" + lastName;
      System.out.println("Hello, my name is " + fullName);
    }
}
