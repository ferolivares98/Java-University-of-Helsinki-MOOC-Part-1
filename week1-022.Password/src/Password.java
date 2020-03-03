
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        boolean f;
        do{
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            if(!pass.equals("carrot")){
                System.out.println("Wrong");
                f = true;
            }else{
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is: HELLO THERE!");
                f = false;
            }
        }while(f);
        
        
        
    }
}
