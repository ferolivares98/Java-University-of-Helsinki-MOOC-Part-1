
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int n;
        if(number1 >= number2)
            n = number1;
        else
            n = number2;
        
        if(n >= number3)
            return n;
        else
            return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
