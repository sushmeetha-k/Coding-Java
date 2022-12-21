import java.io.*;
import java.util.*;
public class Inverted_Pyramid {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = n;i>0;i--) {
			for(int j=2*(n-i);j>0;j--) {
				System.out.print(" ");
				
			}
			for(int k = 1; k<=2*i -1  ;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
