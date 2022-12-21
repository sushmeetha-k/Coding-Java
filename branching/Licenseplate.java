import java.io.*;
import java.util.*;
public class Licenseplate {

	public static void main(String[] args) {
		System.out.println("Enter the license plate");
		Scanner s = new Scanner(System.in);
		String str = s.next();
        if(str.length()== 6 && Character.isUpperCase(str.charAt(0))&& Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(2)) && Character.isDigit(str.charAt(3)) && Character.isDigit(str.charAt(4)) && Character.isDigit(str.charAt(5))) {
	System.out.println("Old style licensed plate");
			
			
		} else if( str.length()== 7 && Character.isDigit(str.charAt(0))&& Character.isDigit(str.charAt(1)) && Character.isDigit(str.charAt(2)) && Character.isDigit(str.charAt(3)) && Character.isUpperCase(str.charAt(4)) && Character.isUpperCase(str.charAt(5)) && Character.isUpperCase(str.charAt(6))) {
			System.out.println("new style licensed plate");
		}
		else {
			System.out.println("enter valid license plate");
		}



	}

}
