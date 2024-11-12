import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = new FileInputStream("E://CodeNinjas.txt");

        int c;

        while((c = fileInputStream.read()) != 1) {
            System.out.println((char) c);
        }

        fileInputStream.close();
    }
}
