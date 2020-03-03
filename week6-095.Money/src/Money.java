
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int totalEuros = this.euros + added.euros;
        int totalCents = this.cents + added.cents;
        
        if(totalCents > 100){
            totalEuros += totalCents/100;
            totalCents %= 100;
        }
        
        return new Money(totalEuros, totalCents);
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents <= compared.cents){
                return true;
            }
        }
        return false;
        
        //return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }
    
    public Money minus(Money decremented){
        int totalEuros = this.euros - decremented.euros;
        int totalCents = this.cents - decremented.cents;
        
        if(totalCents < 0){
            totalEuros--;
            totalCents += 100;
        }
        
        if(totalEuros < 0){
            return new Money(0, 0);
        }
        
        return new Money(totalEuros, totalCents);
    }

}
