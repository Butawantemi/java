class Student {
    public static int rollno;
    public static String name = "Prisca";
}

public class StudentDemo {
    public static void main(String args[]) {
        Student.rollno = 10;
        System.out.println(Student.name + " 's roll number is " + Student.rollno);
    }
}
