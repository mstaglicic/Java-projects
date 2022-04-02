package pckg_01;
import java.util.Scanner;
public class Guessword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guess = "";
		String word = "";
		int guessCount = 0;
		int guessLimit = 5;
		boolean outOfGuesses = false;
		
		System.out.println(" Enter hidden word ");
		word = input.nextLine();
		while(!guess.equals(word) && !outOfGuesses){
		     if(guessCount < guessLimit){
		          System.out.print(" Enter a word: \n");
		          guess = input.nextLine();
		          guessCount++;
		     } else {
		          outOfGuesses = true;
		     }
		}

		if(outOfGuesses){
		     System.out.println("You Lose! \n"
		     		+ "_____________\n"
		    		 +" Hidden word was : \n" + word
		     		+ "\n End of game!");
		} else {
		     System.out.println("You Win! \n"
		     		+ "______________\n"
		     		+ "End of game ! ");
		}
	}
}
