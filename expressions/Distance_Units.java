import java.io.*;
import java.util.*;
public class Distance_Units {

	public static void main(String[] args) {
		System.out.println("enter distance in feet");
		Scanner s = new Scanner(System.in);
		float feet = s.nextFloat();
		System.out.println("Distance in inches is " + 12*feet);
		System.out.println("Distance in yards is " + 0.333333*feet);
		System.out.println("Distance in miles is " + 0.000189394*feet);
		

	}

}
