import java.io.*;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a 4 digit number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		int a = n%10;
		int b = n/10;
		int c = b%10;
		int d = b/10;
		int e = d%10;
		int f = d/10;
		sum = a+c+e+f;
	
		 System.out.println("The sum of digits is " + sum);
	}

}
