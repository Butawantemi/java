import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class CountPrime {
	
	// Write your totalPrime function here
    public int totalPrime(int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if( i == 2 || i % 2 == 1) {
                count++;
            }
        }
        return count;
    }

}

class Solution11 {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}

