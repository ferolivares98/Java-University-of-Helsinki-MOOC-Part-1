
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String s1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String s2 = reader.nextLine();
        
        if(s1.indexOf(s2) == -1)
            System.out.println("The word " + s2 + " is not found in the word " + s1);
        else
            System.out.println("The word '" + s2 + "' is found in the word '" + s1 + "'.");
    }
}
