import java.io.*;
import java.util.*;
public class bottle_deposits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter containers holding 1 liter or less ");
		float x= s.nextFloat();
		System.out.println("enter containers holding more than 1 liter ");
		float y = s.nextFloat();
		double refund = x*0.10 + y*0.25;
		System.out.printf("the refund is $"+"%.2f" + "\n", refund);
	}

}
