public class JavaLabeledBreak {
    public static void main(String[] args) {
        boolean b = true;
        first: {
            Second: {
                System.out.println("this is the second block");
            }
            System.out.println("this is the first block");
        }
    }
}
