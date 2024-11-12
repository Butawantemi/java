import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class CountPrime {
	
	// Write your totalPrime function here
    public boolean isPrime(int n) {
        if (n <= 1) return false; 
        if (n == 2) return true; 
        if (n % 2 == 0) return false;
        
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        
        return true;

    }

    public int totalPrime(int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }


}

class Solution11 {
	public static void main(String[] args) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}

