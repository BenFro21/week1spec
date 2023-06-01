import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public GuessingGame(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there, Welcome to the guessing game. Please enter your name");
        String name = scan.nextLine();
        System.out.println("Welcome " +  name);
        int number = rand.nextInt(100);
        int guess = 0;
        int count =0;
        while(guess != number){
            System.out.println("Guess a random number from 1-100");
            int guessed;
            try {
                 guessed = scan.nextInt();
            }catch(InputMismatchException e){
                String badInput = scan.next();
                System.out.println("Thats not an integer, try again");
                continue;
            } if(guessed < 1 || guessed > 100){
                System.out.println("Please enter a number in the range of 1-100");
                continue;
            }
            count++;
            if (guessed > number) {
                System.out.println("Your guess of " + guessed + " was to high");
            }else if (guessed < number ) {
                System.out.println("Your guess of " + guessed + " was to low");
            }
            else{
                System.out.println("You guessed correct! the number was " + number + " You guessed " + count + " Times");
                guess = number;
            }
        }
    }
}
