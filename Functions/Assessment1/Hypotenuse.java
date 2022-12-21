import java.io.*;
import java.util.*;
import java.lang.Math;
public class Hypotenuse {
	public static double getHypotenuse(int a, int b) {
		double h = Math.sqrt(a*a + b*b);
		return h;	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a side");
		int a = s.nextInt();
		System.out.println("enter another side");
		int b = s.nextInt();
		System.out.println( "the length of the hypotenuse is " + getHypotenuse(a,b));

	}

}
