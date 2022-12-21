es (27 sloc)  640 Bytes

import java.io.*;
import java.util.*;
public class Color_Of_Square {

	public static void main(String[] args) {
		System.out.println("enter input");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char col = str.charAt(0);
		int row = str.charAt(1);
		if(col == 'a' || col == 'c' || col == 'e' || col =='g') {
			if(row%2==1) {
				
			System.out.println("black");
			}
			else {
					System.out.println("white");
				}
		}
			
		
		else if(col == 'b' || col == 'd' || col == 'f' || col == 'h') {
			if(row%2==0) {

					System.out.println("black");
			}
			else {
				System.out.println("white");
			}
		}
		
		
		

	}
}
