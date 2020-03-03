/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Bird {
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public int getObserved() {
        return observed;
    }

    public void setObserved(int observed) {
        this.observed = observed;
    }
    
    public String toString(){
        return name + " (" + latinName + "): " + observed + " observations";
    }

    public String getName() {
        return name;
    }
    
    
    
}
