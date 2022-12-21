import java.io.*;
import java.util.*;
public class Triangles {

	public static void main(String[] args) {
		System.out.println("enter sides of a triangle");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		if(s1==s2 && s1==s3) {
			System.out.println("the triangle is Equilateral");
			
		} else if( s1==s2 || s1==s3) {
			System.out.println("the triangle is isoceles");
		}
		else {
			System.out.println("the triangle is scalene");
		}

	}

}
