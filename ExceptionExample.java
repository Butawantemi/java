public class ExceptionExample {
    public static void main(String[] args) {
        int availBalance = 5000;
        int withDrawAmount = 4500;

        try {
            if (withDrawAmount > availBalance) {
                throw new ArithmeticException("Insufficient balance");
            } else {
                availBalance -= withDrawAmount;
                System.out.println("Withdrawal successful");
                System.out.println("Available balance: " + availBalance);
            }
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
