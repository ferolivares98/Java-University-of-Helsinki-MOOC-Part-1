
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int n = drawNumber();
        int cont = 0;
        
        while(true){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            cont++;
            
            if(guess > n)
                System.out.println("The number is lesser, guesses made: "+cont);
            else if(guess < n)
                System.out.println("The number is greater, guesses made: "+cont);
            else{
                System.out.println("Congratulation, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
