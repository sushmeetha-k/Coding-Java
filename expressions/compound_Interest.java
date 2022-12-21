
import java.io.*;
import java.util.*;
public class CompoundIntrest {

	public static void main(String[] args) {
		System.out.println("Enter the deposited amount");
		Scanner s = new Scanner(System.in);
		float depoAmt = s.nextFloat();
		double intrest = 0.04*depoAmt;
		System.out.printf("Amount in saving account after 1 year : " + "%.2f"+ "\n",depoAmt + intrest);
		System.out.printf("Amount in saving account after 2 years : " + "%.2f" + "\n", depoAmt +2*intrest);
		System.out.printf("Amount in saving account after 3 years : " + "%.2f" + "\n" ,depoAmt+3*intrest);
	}

}
