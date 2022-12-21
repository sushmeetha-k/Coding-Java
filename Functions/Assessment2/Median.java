import java.io.*;
import java.util.*;

public class Median {
	public static int medianOfThree(int num1,int num2,int num3) {
		if(num1<num2 && num2<num3) {
			return num2;
			
		}
		if(num2<num3 && num3<num1) {
			return num3;
		}
		if(num3<num1 && num1<num2) {
			return num1;
		}
		return num1;
		
		
	}

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		System.out.println(medianOfThree(num1,num2,num3));

	}

}
