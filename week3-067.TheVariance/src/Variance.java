import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum = 0;
        
        for(int n : list){
            sum += n;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double av;
        int suma;
        
        suma = sum(list);
        
        av = (double)suma/list.size();
        return av;
    }

    public static double variance(ArrayList<Integer> list) {
        double sqD = 0;
        double media = average(list);
        
        for (double number : list) {
            sqD +=  Math.pow((number - media), 2);
        } 
        
        return sqD/ (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
