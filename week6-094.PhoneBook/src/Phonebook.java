
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
public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public void add(String name, String number){
        list.add(new Person(name, number));
    }
    
    public void printAll(){
        for(Person p : list){
            System.out.println(p.toString());
        }
    }
    
    public String searchNumber(String name){
        for(Person p : list){
            if (p.getName().equals(name)){
                return p.getNumber();
            }
        }
        
        return "number not known";
    }
}
