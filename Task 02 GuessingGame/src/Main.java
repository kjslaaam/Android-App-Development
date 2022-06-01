import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guessing Game");
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+name);
        System.out.print("Press Y to start guessing game: ");
        char chara = scanner.next().charAt(0);
        while (chara=='y'||chara=='Y')
        {
            Random random = new Random();
            int num = random.nextInt(50);
            int wrongGuesses=0;
            while(true)
            {
                System.out.print("Guess a number: (You have "+String.valueOf(5-wrongGuesses)+" guesses remaining)");
                int guess = scanner.nextInt();
                if(guess==num)
                {
                    System.out.print("Congratulations! You guessed correct!");
                    break;
                }
                else
                {
                    wrongGuesses++;
                    if(wrongGuesses==5)
                    {
                        System.out.print("Maximum attempts done. Better luck next time.");
                        break;
                    }
                    else if (guess>num)
                        System.out.println("You guessed higher than actual value. Try again.");
                    else if (guess<num)
                        System.out.println("You guessed lower than actual value. Try again.");
                }
            }
            break;
        }
    }
}