import java.io.*;
import java.util.*;
public class Perfect_number {
	public static boolean isPerfect(int n) {
		int sum =0;
		for(int i =1 ;i<n;i++) {
			if(n%i==0) {
				sum += i;
				if(n==sum)
				return true;
			
				
			}
		}
			return false;
			
		}
	public static void main(String[] args) {
		System.out.println("the perfect numbers between 1 to 10,000 is ");
		for(int i = 1;i<=10000;i++) {
			if(isPerfect(i) == true)
			System.out.println(i + "\n");				
			}
			
		
		}
		

	}
