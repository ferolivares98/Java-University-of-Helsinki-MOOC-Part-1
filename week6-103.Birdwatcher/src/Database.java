
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Database {
    private ArrayList<Bird> list;
    
    public Database(){
        list = new ArrayList<Bird>();
    }
    
    public void addBird(Bird b){
        list.add(b);
    }
    
    public void addObservation(Bird b){
        int i = b.getObserved();
        i++;
        b.setObserved(i);
    }
    
    public void statistics(){
        for(Bird b : list){
            System.out.println(b.toString());
        }
    }
    
    public void show(Bird b){
        System.out.println(b.toString());
    }

    public ArrayList<Bird> getList() {
        return list;
    }


    
}
