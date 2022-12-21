import java.io.*;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("enter a decimal number");
		Scanner s = new Scanner(System.in);
		String result = " "; 
	
		
		int q = s.nextInt();
		int r;
		while(q>0) {
			r = q%2;
			q=q/2;
			result += r;
			
			
			
		}
		for(int i=result.length();i>0;--i)               
		{  
		System.out.print(result.charAt(i-1));            
		}  


	}

}
