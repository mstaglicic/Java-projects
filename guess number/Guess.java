package pckg_01;
import java.util.Scanner;
public class Guess {
public static void
		gameguess()
		{
			Scanner sc = new Scanner(System.in);
			int number = (int)(50*Math.random());
			int K = 5;
			int i, guess;
			System.out.println( "|                   |\n"
					+ 			 "| Guess the Number  |\n"
					+            "|___________________|");
			for (i = 0; i < K; i++) {
				System.out.println("Enter number");
				guess = sc.nextInt();
				if (number == guess) {
					System.out.println(	"Great, you succeed");
					break;
				}
				else if (number > guess && i != K - 1) {
					System.out.println(" Sorry, the number is great than " + guess);
				}
				else if (number < guess && i != K - 1) {
					System.out.println( " Sorry, the number is lower than " + guess);
				}
			}

			if (i == K) {
				System.out.println("You lost  ");
				System.out.println("The number was " + number);
			}
}
public static void
main(String arg[])
		{
			gameguess();
		}
	}

