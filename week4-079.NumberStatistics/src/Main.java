import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics trackSum = new NumberStatistics();
        NumberStatistics trackEven = new NumberStatistics();
        NumberStatistics trackOdd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        while(true){
            int ad = Integer.parseInt(reader.nextLine());
            
            if(ad == -1)
                break;
            else if(ad % 2 == 0)
                trackEven.addNumber(ad);
            else
                trackOdd.addNumber(ad);
            
            trackSum.addNumber(ad);
        }
        System.out.println("sum: " + trackSum.sum());
        System.out.println("sum of even: " + trackEven.sum());
        System.out.println("sum of odd: " + trackOdd.sum());
    }
}
