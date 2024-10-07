import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(1, 10);
        System.out.println("Guess a number between 1 to 10");
        int guess = in.nextInt();
        do {
            if (guess < number ){
                System.out.println("Your guess was too low.");
                System.out.println("Guess a number between 1 and 10: ");
                in.next();
            }else if (guess > number){
                System.out.println("Your guess was too high");
                System.out.println("Guess a number between 1 and 10: ");
                in.next();
            }else {
                System.out.println("Your guess is right!");
            }
        }while(guess < 1 || guess > 10);
        System.out.println("The random number was: "+ number);
    }
}