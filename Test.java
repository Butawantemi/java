/*
 * This is a simple program that prints out the name and age of aperson
 * printl() method is used to print the output with a newline at the end.
 * printf() method is used to format the output.
 * The %s(string) and %d(integer) are format specifiers that are used to format the output.
 * print() method is used to print the output without a newline at the end.
 * Use the Java compiler to compile the program: javac Test.java
 * Author: Japhet
 * Date: 6th November 2024.
 */


public class Test {
    public static void main(String[] args) {
        String firstName = "Japhet";
        String lastName = "Paul";
        int age = 22;

        System.out.println("Hello, my name is  " + firstName + " " + lastName + " and I am  " + age + " years old.");
    }
}
