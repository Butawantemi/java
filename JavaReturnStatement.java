public class JavaReturnStatement {
    public static int findSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        JavaReturnStatement obj = new JavaReturnStatement();
        int result = obj.findSum(20, 10);
        System.out.println("Sum is: " + result);
    }
}
