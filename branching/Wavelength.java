import java.io.*;
import java.util.*;
public class Wavelength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter wavelength in nanometers");
		int wl = s.nextInt();
		if(wl<450 && wl>=380) {
			System.out.println("Violet");
		}
		else if(wl<495 && wl>=450) {
			System.out.println("Blue");
		}
		else if(wl<570 && wl>=495) {
			System.out.println("Green");
		}
		else if(wl<590 && wl>=570) {
			System.out.println("Green");
		}
		else if(wl<620 && wl>=590) {
			System.out.println("Orange");
		}
		else if(wl<750 && wl>=620) {
			System.out.println("Red");
		}
		else {
			System.out.println("ERROR: enter valid range of wavelength");
		}

	}

}
