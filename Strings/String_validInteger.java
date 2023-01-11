import java.io.*;
import java.util.*;

public class String_validInteger {
	 static boolean isInteger(String str) {
		 boolean alphanum = true;
		for (int i = 0; i < str.length(); i++) {
			if (isdigit(str.charAt(i)) && (isupper(str.charAt(i)) || islower(str.charAt(i)))
					&& (str.charAt(0) == '+' || str.charAt(0) == '-')) 
				return false;
			}
			boolean alpha = true;
			for (int i = 0; i < str.length(); i++) {
		  if (islower(str.charAt(i)) || isupper(str.charAt(i))) 
			return false;
		}
		  boolean digit = false;
		  for (int i = 0; i < str.length(); i++) {
		 if (isdigit(str.charAt(i)) && (str.charAt(0) == '+' || str.charAt(0) == '-') )
				return true;
			
		}
		  if(digit && alphanum && alpha) {
			  return true;
		  }

		return false;
	}


	static boolean islower(char c) {

		return c >= 'a' && c <= 'z';
	}

	static boolean isupper(char c) {
		return c >= 'A' && c <= 'Z';
	}
	static boolean isdigit(int n) {

		return n >= '0';

	}

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isInteger(str));

	}

}
