
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        int result = n1+n2;

        System.out.println("Sum of the numbers: "+ result);
    }
}
