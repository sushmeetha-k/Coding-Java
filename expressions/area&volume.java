
import java.io.*;
import java.util.*;
public class AreaAndVolume {

	public static void main(String[] args) {
		System.out.println("Enter radius");
		Scanner s = new Scanner(System.in);
		float r = s.nextFloat();
		System.out.println("the area of circle with radius " + r + " is " + 3.14*r*r);
		System.out.println("the volume of sphere with radius " + r + " is " + 1.3333*3.14*r*r*r ); //4/3*pi*r^3
	}

}
