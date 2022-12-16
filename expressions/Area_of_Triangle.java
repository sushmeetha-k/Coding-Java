import java.io.*;
import java.util.*;
import java.lang.Math;
public class AreaOfTriangle {

	public static void main(String[] args) {
		System.out.println("enter sides of the triangle");
		Scanner sc= new Scanner(System.in);
		float s1 = sc.nextFloat();
		float s2 = sc.nextFloat();
		float s3 = sc.nextFloat();
		float s= (s1+s2+s3)/2;
		double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("the area of triangle is " + area + " meter square");
		
	
		

	}

}
