import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        int fact = 1;
        while(i <= n){
            fact *= i;
            i++;
        }
        System.out.println("Factorial is "+fact);
    }
}
