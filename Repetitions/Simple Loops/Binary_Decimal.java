import java.io.*;
import java.util.*;
import java.lang.Math;
public class Binary_Decimal {

	public static void main(String[] args) {
		System.out.println("enter binary string");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int base = 1; // 2^0;
		int decimal = 0;
		while(n>0) {
			int digit = n%10;
			decimal = decimal + digit*base;
			base = base *2;
			n = n/10;
			
		}
		System.out.println("decimal value of binary number is " + decimal);
	}
}
