import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int n = 0;
        int sum = 0, counter = 0, even = 0, odd = 0;
        
        System.out.println("Type numbers: ");
        while (n != -1){
            n = Integer.parseInt(reader.nextLine());
            if(n != -1){
                sum += n;
                counter++;
                if (n % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+counter);
        System.out.println("Average"+(sum/(double)counter));
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
