import java.io.*;
import java.util.*;
public class Astrologysign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		String month = s.next();
		System.out.println("enter date");
		int date = s.nextInt();
		if((month.equals("december") && date<=31&&date>=22) || (month.equals("january") && date<=19) ) {
			System.out.println("Capricon");
		}
		else if((month.equals("january") && date>=20 && date<=31) || (month.equals("february") && date<=18) ) {
			System.out.println("Aquarius");
		}
		else if((month.equals("february") && date>=19 && date<31) || (month.equals("march") && date<=20) ) {
			System.out.println("Pisces");
		}
		else if((month.equals("march") && date>=21 && date<=31) || (month.equals("april") && date<=19) ) {
			System.out.println("Aries");
		}
		else if((month.equals("april") && date>=20 && date<=30) || (month.equals("may") && date<=20) ) {
			System.out.println("Taurus");
		}
		else if((month.equals("may") && date>=21 && date <=31) || (month.equals("june") && date<=20) ) {
			System.out.println("Gemini");
		}
		else if((month.equals("june") && date>=20 && date <=30) || (month.equals("july") && date<=22) ) {
			System.out.println("cancer");
		}
		else if((month.equals("july") && date>=23 && date <=31) || (month.equals("august") && date<=22) ) {
			System.out.println("Leo");
		}
		else if((month.equals("august") && date>=23 && date <=31) || (month.equals("september") && date<=22) ) {
			System.out.println("Virgo");
		}
		else if((month.equals("september") && date>=23 && date <=30) || (month.equals("october") && date<=22) ) {
			System.out.println("Libra");
		}
		else if((month.equals("october") && date>=23 && date <=31) || (month.equals("november") && date<=21) ) {
			System.out.println("Scorpio");
		}
		else if((month.equals("november") && date>=22 && date <=30) || (month.equals("december") && date<=21) ) {
			System.out.println("Sagittarius");
		}
		else {
			System.out.println("enter valid month and date");
		}

	}

}
