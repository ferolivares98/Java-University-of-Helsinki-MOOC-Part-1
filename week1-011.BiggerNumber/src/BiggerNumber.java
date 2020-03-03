
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        int result = Math.max(n2, n1);
        System.out.println("The bigger number of the two numbers given was: "+ result);
    }
}
