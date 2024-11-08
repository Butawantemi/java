/*
* Declaring function Addition() to sum two numbers and print the result.
* Local variables a and b.
*/

public class Addition {
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c);

    }

    public static void main(String args[]) {

        Addition obj = new Addition();
        obj.add();

    }
    
}
