import java.io.*;
import java.util.*;
public class Vowel_Consonant_count {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int c1=0,c2=0,i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				c1++;
			}
			else if(str.charAt(i) > 'a' && str.charAt(i)<= 'z') {
				c2++;
			}
		
		}
		System.out.println("the vowel count is " + c1 + "\n" + "the consonant count is " + c2);

	}

}
