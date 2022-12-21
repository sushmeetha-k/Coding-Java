import java.io.*;
import java.util.*;

public class Valid_Triangle {
	public static boolean isValidTriangle(float a,float b,float c) {
		if(a>=b+c || b>=a+c || c>=a+b) {
			return false;
			
		}
		else if(a<=1 || b<=1 || c<=1) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a side");
		float a = s.nextFloat();
		System.out.println("enter another side");
		float b = s.nextFloat();
		System.out.println("enter another side");
		float c = s.nextFloat();
		System.out.println(isValidTriangle(a,b,c));
		

	}

}
