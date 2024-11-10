public class JavaLabeledBreak {
    public static void main(String[] args) {
        boolean b = true;
        First: {
            Second: {
                Third: {
                        System.out.println("Before the break statement");
                        if (b) {
                            break Second;
                        }
                }
                System.out.println("this is the second block");
            }
            System.out.println("this is the first block");
        }
    }
}
