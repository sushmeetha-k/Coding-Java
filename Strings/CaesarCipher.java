package Strings;
import java.util.Scanner;
public class CaesarCipher {
	 
	
	    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	 
	    public static String encryptWithCaesar(String plainText, int shiftKey)
	    {
	        plainText = plainText.toLowerCase();
	        String cipherText = "";
	        for (int i = 0; i < plainText.length(); i++)
	        {
	            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
	            int keyVal = (shiftKey + charPosition) % 26;
	            char replaceVal = ALPHABET.charAt(keyVal);
	            cipherText += replaceVal;
	        }
	        return cipherText;
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String for Encryption: ");
	        String message = new String();
	        message = sc.next();
	        System.out.println(encryptWithCaesar(message, 3));
	        sc.close();
		

	}

}
