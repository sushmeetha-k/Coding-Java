
import java.io.*;
import java.util.*;
import java.lang.Math;
public class FreeFall {

	public static void main(String[] args) {
		System.out.println("enter heigth from which the object is dropped");
		Scanner s = new Scanner(System.in);
		float d = s.nextFloat();
		int vi=0;
		double a = 9.8;
		double vf = Math.sqrt(Math.pow(vi, 2) + 2*a*d);
		System.out.println("object is travelling with the speed of " + vf + " m/s");
		
		

	}

}
