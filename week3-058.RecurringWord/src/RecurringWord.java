
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList();
        boolean flag = false;
        // create here the ArrayList 
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            for (String s : words){ //Out, its contains.
                if(s.equals(word)){
                    System.out.println("You gave the word " + s + " twice.");
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            words.add(word);
        }
    }
}
