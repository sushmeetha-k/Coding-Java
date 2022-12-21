import java.io.*;
import java.util.*;
public class Sum_of_integers {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		for(int i=0;i<=n;i++) {
			sum = sum + i;
			
			
		}
		System.out.println(sum);

	}

}
