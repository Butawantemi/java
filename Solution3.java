import java.util.*;
import java.io.*;


public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();
        char grade = sc.next().charAt(0);
        float hra = 0.2f;
        float da = 0.5f;
        float pf = 0.11f;

        if (grade == 'A') {
            int totalSalary =  (int) Math.floor (basicSalary + hra + da  + 1700 - pf);
            System.out.println(totalSalary);
        }
    }
}
