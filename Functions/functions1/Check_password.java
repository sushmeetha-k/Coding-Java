import java.io.*;
import java.util.*;

public class Check_password {
	public static boolean checkPassword(String str) {
		boolean isUpper = false;
		for(int i = 0; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
					return true;
		}
		boolean islower = false;
		for(int i =0; i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				return true;
		}
		boolean digit = false;
		for(int i =0; i< str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				return true;
		}
				
	
		if(isUpper && islower && digit && str.length()>=8)
			
				return true;
	
		return false;

			}
	public static void main(String[] args) {
		System.out.println("enter the password");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(checkPassword(str));

	}

}
