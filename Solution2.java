/*
 * Problem statement:Write a program that takes a character as input and prints either 1, 0, or -1 according to the following rules.
 * 1, if the character is an uppercase alphabet (A - Z)
 * 0, if the character is a lowercase alphabet (a - z)
 * -1, if the character is not an alphabet
 * Constraints :
 * Input can be any character.
 * Constraints :
 * Input can be any character.
 * Input format :
 * The only line of input contains a single character.
 * Output format :
 * The only line of output prints eith1, 0 or -1(as applicable).
 */


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
