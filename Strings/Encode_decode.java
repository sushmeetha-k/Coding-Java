import java.io.*;
import java.util.*;
public class Encode_decode {
	public static int decode(char ch) {
		int value = (int)ch;
		return value;
	}
		public static char encode(int n) {
			char value = (char)n;
			return value;
		}
		
		
	

	public static void main(String[] args) {
		System.out.println("enter values to encode ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(encode(n));
		System.out.println("enter values to decode");
		char ch = s.next().charAt(0);
		System.out.println(decode(ch));
  }
