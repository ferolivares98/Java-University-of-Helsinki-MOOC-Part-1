
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int nFirst = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int nSec = Integer.parseInt(reader.nextLine());
        
        if(nSec < nFirst)
            System.out.println("");
        else{
            while(nFirst <= nSec){
                System.out.println(nFirst);
                nFirst++;
            }
        }
    }
}
