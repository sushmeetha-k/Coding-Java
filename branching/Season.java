import java.io.*;
import java.util.*;
public class Season {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		String month = s.next();
		System.out.println("enter date");
		int date = s.nextInt();
		if((month.equals("march") && date >=20) || month.equals("april") || month.equals("may")|| (month.equals("june") && date <=20)) {
			System.out.println("spring");
		}
		else if((month.equals("june") && date >= 21) || month.equals("july") || month.equals("august") || (month.equals("september") && date <= 21) ) {
			System.out.println("summer");
		}
		else if((month.equals("september") && date >= 22) || month.equals("october") || month.equals("november") || (month.equals("december") && date <= 20) ) {
			System.out.println("fall");
		}
		else if((month.equals("december") && date >= 21) || month.equals("january") || month.equals("february") || (month.equals("march") && date <= 19) ) {
			System.out.println("winter");
		}
		else {
			System.out.println("enter valid month");
		}
				

	}

}
