
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up top what number?");
        int n = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
