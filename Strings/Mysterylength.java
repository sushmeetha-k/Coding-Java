import java.io.*;
import java.util.*;
public class Mysterylength {
	public static String removeMysteryLength(String str) {
		String s = " ";
		for(int i=0;i<str.length();i++) {
			s = str.substring(0,str.length()-2);
		}
			return s;			
		}
		
	

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeMysteryLength(str));
	}

}
