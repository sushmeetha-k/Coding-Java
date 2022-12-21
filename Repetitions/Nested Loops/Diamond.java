import java.io.*;
import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j =n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k =1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n-1;i>=1;i--) {
			for(int j =n;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k =1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
