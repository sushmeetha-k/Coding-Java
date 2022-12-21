import java.io.*;
import java.util.*;
public class Next_prime {
	public static int nextPrime(int n) {
		n++;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				n++;
			}
			
			}
	return n;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		System.out.println("the next prime number is " + nextPrime(n));
		

	}

}
