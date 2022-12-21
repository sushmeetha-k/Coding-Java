import java.io.*;
import java.util.*;
public class Sandglass_pattern {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = n; i>= 1;i--) {
			for(int j =n-i;j>=1;j--) {
				System.out.print(" ");
			}
			
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i<= n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int k = i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
