import java.io.*;
import java.util.*;
public class Palindrome {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) 
				return true;
				i++;
				j--;
				
			}
		
		return false;	
	}

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isPalindrome(str));
	}

}
