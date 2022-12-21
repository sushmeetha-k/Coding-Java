import java.io.*;
import java.util.*;
public class Temp_Conversion {

	public static void main(String[] args) {
		System.out.println("celsius"+"\t"+"\t"+"\t"+"\t"+"fahrenheit"+"\n");
		for(int i=0;i<=100;i++) {
			if(i%10==0) {
				System.out.println(i+"\t"+"\t"+"\t"+"\t"+((i*1.8)+32) + "\n");
				
				
			}
		}

	}

}
