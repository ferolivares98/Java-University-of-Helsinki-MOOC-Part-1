import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> list;
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes: ");
        list = typeExamScore(lukija);
        gDist(list);
    }
    
    public static ArrayList<Integer> typeExamScore(Scanner scanner){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(true){
            int n = Integer.parseInt(scanner.nextLine());
            
            if(n == -1)
                return list;
            
            list.add(n);
        }
    }
    
    public static int gradeDistribution(int i){
        if (i < 30) {
            return 0;
        } else if (i < 35) {
            return 1;
        } else if (i < 40) {
            return 2;
        } else if (i < 45) {
            return 3;
        } else if (i < 50) {
            return 4;
        }else
            return 5;
    }
    
    public static void gDist(ArrayList<Integer> l){
        int[] scores = new int[6];
        double accepted = 0;
        double total = 0;
        
        System.out.println("Grade distribution: ");
        
        for(Integer i : l){
            if(i >= 0 && i <= 60){
                int group = gradeDistribution(i);
                scores[group]++;
                total++;
                if(i >= 30)
                    accepted++;
            }
            
        }
        
        for(int j = scores.length-1; j >= 0; j--){
            System.out.print(j + ": ");
            if(scores[j] == 0){
                System.out.print(" ");
            }else{
                for(int k = 0; k < scores[j]; k++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        System.out.println("Acceptance percentage: " + (100*accepted)/total);
        
    }
}
