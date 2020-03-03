
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint=0;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        Random random = new Random();
        
        for(int i = 0; i < width; i++){
            double op = random.nextDouble();
            
            if(op < density){
                System.out.print("*");
                starsInLastPrint++;
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void print(){
        //starsInLastPrint = 0...
        for(int i = 0; i < height; i++){
            printLine();
        }
    }
    
    public int starsInLastPrint(){
        int i = starsInLastPrint;
        starsInLastPrint = 0;
        
        return i;
    }
}
