import java.util.Random;

public class BasicSimulation {

	
	public static void simulateCoinToss() {
		Random r = new Random();
		System.out.println(r.nextInt(2));
	}

	
	public static void simulateDiceThrow() {
		Random r = new Random();
		System.out.println(r.nextInt(6));
	}

	public static void main(String[] args) {
		simulateCoinToss();
		simulateDiceThrow();
	}
}
