import java.io.*;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a year");
		int year = s.nextInt();
		if(year%400 == 0 || year%100 != 0 && year%4==0) {
			System.out.println("it is a leap year");
			
		
			
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
