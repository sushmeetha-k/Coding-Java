es (21 sloc)  696 Bytes

import java.io.*;
import java.util.*;
public class Month_To_Days {

	public static void main(String[] args) {
		System.out.println("enter a month");
		Scanner s = new Scanner(System.in);
		String m = s.next();
		if(m.equals("january") || m.equals("march") || m.equals("may") || m.equals("july") || m.equals("august") || m.equals("october") || m.equals("december") ) {
			System.out.println("31 days");
		} 
		else if(m.equals("february")) {
			System.out.println("28 or 29 days");
			
		}
		else if(m.equals("april") || m.equals("june") || m.equals("september") || m.equals("november")) {
			System.out.println("30 days");
		}
		else {
			System.out.println("enter valid month");
		}
		

	}

}
