import java.io.*;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println("the number ims even");
		}
		else {
			System.out.println("the number is odd");
		}

	}

}
