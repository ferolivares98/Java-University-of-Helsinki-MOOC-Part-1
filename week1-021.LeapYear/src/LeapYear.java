
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a year: ");
        int n = Integer.parseInt(reader.nextLine());
        
        if(n % 4 == 0){
            boolean b = false;
            if(n % 100 == 0 && !(n % 400 == 0)){
                 b = true;
            }
            if(b)
                System.out.println("The year is not a leap year");
            else
                System.out.println("The year is a leap year.");
        }else
            System.out.println("The year is not a leap year");
    }
}
