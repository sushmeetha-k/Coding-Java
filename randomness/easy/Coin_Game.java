import java.util.Random;

public class CoinGame {

	
	public static int getNumberOfHeads() {
		int nheads = 0;
		Random r = new Random();
		for (int i = 0; i < 10; ++i) {
			if (r.nextInt(2) == 0)
				nheads += 1;
		}
		return nheads;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i)
			System.out.println(getNumberOfHeads());
	}

}
