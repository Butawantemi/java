
/*
 * This program demonstrates how to create instances variables and objects in Java.
 */

class Student {
    String name;
    int rollno;
}

public class StudentRecords {
    public static void main(String args[]) {
         Student obj = new Student();
         obj.name = "Japhet";
         obj.rollno = 1;

         System.out.println(obj.name);
         System.out.println(obj.rollno);
    }
}
