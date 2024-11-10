/*
 * Write a program to calculate the total salary of a person. 
 * The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
 * and depending upon which the total salary is calculated as 
 * -totalSalary = basic + hra + da + allow – pf
 */


 import java.util.* ;
 import java.io.*; 
 class Solution {
     
     public static void main(String args[]) {
         
         // Write code here
         Scanner sc = new Scanner(System.in);
         sc.close();
 
         int basicSalary = sc.nextInt();
         char grade = sc.next().charAt(0);
         float hra = 0.2f * basicSalary;
         float da = 0.5f * basicSalary;
         float pf = 0.11f * basicSalary;
        
         int allow;
         if (grade == 'A') {
            allow = 1700;
         } else if (grade == 'B') {
            allow = 1500;;
         } else {
            allow = 1300;
         }

         int totalSalary = (int) Math.floor(basicSalary + hra + da + allow - pf);
         System.out.println(totalSalary);
         
     }
 }