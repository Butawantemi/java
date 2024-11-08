public class OverflowExample {
    public static void main(String args[]) {
	
		int overFlow = 2147483647;
		System.out.println("Overflow : "  + (overFlow + 1));         
		
		int underFlow = -2147483648;
		System.out.println("Underflow : " + (underFlow - 1));
     	
 	}
}
