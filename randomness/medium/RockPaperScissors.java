package randomness;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static String getComputerMove( Random  random){

        int wordNumber;
        wordNumber = random.nextInt( 3 ) + 1;
        String computerChoice = "";
        if( wordNumber == 1 ){
            computerChoice = "rock";
        }else if( wordNumber == 2 ){
            computerChoice = "paper";
        }else if( wordNumber == 3 ){
            computerChoice = "scissors";
        }

        System.out.println( "\nThe Computer already made it's choice" );
        return computerChoice;

    }
    public static void showMenu(){
     System.out.println( "Options to choose from :\n1.Rock\n2.Paper\n3.Scissors" );

    }

    public static String getUserMove( Scanner scanner ){

        String userWordChoice = "";
        System.out.print( "\nPlease make yours : " );
        userWordChoice = scanner.nextLine();
        return userWordChoice;

    }

    
    public static String chooseWinner( String computerChoice, String userChoice ){

        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockCustomMessage = "The rock smashes the scissor";
        String scissorsCustomMessage = "Scissors cuts paper";
        String paperCustomMessage = "Paper wraps rock";

       
        if( computerChoice.equals( "rock" ) && userChoice.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer";
            customMessage = rockCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "rock" ) && computerChoice.equals( "scissors" ) ){
            winner = "User";
            customMessage = rockCustomMessage;
        }

        if( computerChoice.equals( "scissors" ) && userChoice.equalsIgnoreCase( "paper" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "paper" ) ){
            winner = "User";
            customMessage = scissorsCustomMessage;
        }

        if( computerChoice.equals( "paper" ) && userChoice.equalsIgnoreCase( "rock" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "rock" ) ){
            winner = "User";
            customMessage = paperCustomMessage;
        }
        
        finalMessage = winner + " won ( " + customMessage + " )";

        return finalMessage;

    }

	public static void main(String[] args) {
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;

        showMenu();
        computerChoice = getComputerMove( random );
        userChoice = getUserMove( scanner );
        winner = chooseWinner( computerChoice, userChoice );

        System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
        System.out.println( winner );
		

	}

}
