
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters >= otherApartment.squareMeters)
            return true;
        
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        int ap1 = this.squareMeters * this.pricePerSquareMeter;
        int ap2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if(ap1 >= ap2)
            return ap1 - ap2;
        else
            return ap2 - ap1;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        int ap1 = this.squareMeters * this.pricePerSquareMeter;
        int ap2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if(ap1 >= ap2)
            return true;
        
        return false;
    }
    
    
    
}
