
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int n = Integer.parseInt(reader.nextLine());
        
        if(n <= 29)
            System.out.println("Grade: failed");
        else if (n <= 34)
            System.out.println("Grade: 1");
        else if (n <= 39)
            System.out.println("Grade: 2");
        else if (n <= 44)
            System.out.println("Grade: 3");
        else if (n <= 49)
            System.out.println("Grade: 4");
        else if (n <= 60)
            System.out.println("Grade: 5");
    }
}
