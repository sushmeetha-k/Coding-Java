import java.io.*;
import java.util.*;
public class Is_prime {
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
				return true;
			}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		System.out.println(isPrime(n));

	}

}
