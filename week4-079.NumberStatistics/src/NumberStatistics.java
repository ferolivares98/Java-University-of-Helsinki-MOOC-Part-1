
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if(amountOfNumbers > 0)
            return (double)sum / amountOfNumbers;
        else
            return 0;
    }
    
    
}
