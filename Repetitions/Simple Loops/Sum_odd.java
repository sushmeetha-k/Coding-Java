import java.io.*;
import java.util.*;
public class Sum_odd {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		for(int i=1;i<=2*n;i++) {
		if(i%2==1) {
			sum = sum+i;
			
		}

	}
		System.out.println("sum od odd integers is " + sum);

}
}
