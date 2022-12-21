es (18 sloc)  394 Bytes

import java.io.*;
import java.util.*;
public class Downward_left_triangle {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
