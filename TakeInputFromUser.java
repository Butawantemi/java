/*
 * This program use the Scanner class to take input from the user.
 * @firstName: The first name of the user.
 * @lastName: The last name of the user.
 * @fullName: The full name of the user as output.
 */

import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your first name: ");
      String firstName = sc.nextLine();

      System.out.println("Enter your last name: ");
      String lastName = sc.nextLine();

      String fullName = firstName + " " + lastName;
      System.out.println("Hello, my name is " + fullName);
    }
}
