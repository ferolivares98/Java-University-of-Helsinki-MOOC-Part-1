import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        if (n1 > n2)
            System.out.println("Greater number: " + n1);
        else if (n1 == n2)
            System.out.println("The numbers are equal!");
        else
            System.out.println("Greater number: " + n2);
    }
}
