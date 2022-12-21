import java.io.*;
import java.util.*;
public class Collinear {
	public static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3 ) {
		boolean points = false;
		float slope1 = (y2-y1)/(x2-x1);
		float slope2 = (y3-y2)/(x3-x2);
		if(slope1 == slope2) {
			points = true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter the points " + "\n");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int x3 = s.nextInt();
		int y3 = s.nextInt();
		System.out.println(isCollinear(x1,y1,x2,y2,x3,y3));
		

	}

}
