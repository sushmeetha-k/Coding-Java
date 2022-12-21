import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Arbitary_conversions {
	public static int convertBase(int num, int sourceBase, int finalBase) {
		int deci = toDecimal(num,sourceBase);
		int finalNum = toFinal(deci,finalBase);
		return finalNum;
	}
	
	    public static int toDecimal(int num, int sourceBase) {
			int decimal = 0;
			int power = 0;
			while(num>0) {
				int rem = num%10;
				decimal += rem*Math.pow(sourceBase,power);
						power += 1;
						num = num/10;
				
				
			}
			return decimal;
			
		}
	    public static int toFinal(int deci, int finalBase) {
	    	int finalNum = 0;
	    	int power = 0;
	    	while(deci > 0) {
	    		int rem =deci%finalBase;
	    		finalNum += rem*Math.pow(10, power);
	    		power += 1;
	    		deci = deci/finalBase;
	    		
	    		
	    	}
	    	return finalNum;
	    	
	}
	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("enter source base");
		int sourceBase = s.nextInt();
		System.out.println("enter final base");
		int finalBase = s.nextInt();
		System.out.println(convertBase(num,sourceBase,finalBase));
		

	}

}
