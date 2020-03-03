import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String w;
        // create here an ArrayList
        ArrayList<String> words = new ArrayList();
        
        do{
            System.out.print("Type a word: ");
            w = reader.nextLine();
            words.add(w);
        }while(!w.equals(""));
        
        Collections.reverse(words);
        
        for(String word : words){
            System.out.println(word);
        }
        
    }
}
