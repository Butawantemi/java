/*
 * Checked Exception Example
 */


import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("CodeNinjas.txt");
        } catch (FileNotFoundException e1) {
            System.out.println("File not found in current directory");
        }

        int c;
        try {
            while ((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
               e.printStackTrace();
        }
    }
}
