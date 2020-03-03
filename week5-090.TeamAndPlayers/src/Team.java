
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
public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize;
    
    public Team (String name){
        this.maxSize = 16;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player p){
        if(list.size() < maxSize){
            list.add(p);
        }
    }
    
    public void printPlayers(){
        for(Player p : list){
            System.out.println(p.toString());
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return list.size();
    }
    
    public int goals(){
        int g = 0;
        
        for(Player p : list){
            g += p.goals();
        }
        
        return g;
    }
    
}
