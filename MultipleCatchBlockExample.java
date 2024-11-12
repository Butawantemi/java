public class MultipleCatchBlockExample {

	public static void main(String[] args) {
		
		try {
			int array[] = new int[5];
			array[6] = 8;
			
			int val1 = 10;
			int val2 = 0;
			int quotient = val1 / val2;
			
			System.out.println("Quotient of " + val1 + " / " + val2 + " is: " + quotient);
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}
		catch(Exception e) {
			System.out.println("Other types of exception");
		}
	}
}