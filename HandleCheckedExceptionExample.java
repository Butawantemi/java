import java.io.*;

public class HandleCheckedExceptionExample  {
    public static void main(String[] args)  throws IOException {
        FileInputStream fileInputStream = new FileInputStream("CodeNinjas.txt");
        int c;
        while ((c = fileInputStream.read()) != -1) {
            System.out.println((char) c);
        }

        fileInputStream.close();
    }
}