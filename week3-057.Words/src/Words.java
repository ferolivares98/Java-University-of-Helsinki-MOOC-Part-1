import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String w;
        
        do{
            System.out.print("Type a word: ");
            w = reader.nextLine();
            words.add(w);
        }while(!w.equals(""));
        
        for (String s : words)
            System.out.println(s);
    }
}
