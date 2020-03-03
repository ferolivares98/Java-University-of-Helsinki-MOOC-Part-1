
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

          System.out.println("How old are you? ");
          int n = Integer.parseInt(reader.nextLine());
          
          if(n < 0 || n > 120)
              System.out.println("Impossible.");
          else
              System.out.println("OK");
    }
}
