
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
public class Library {
    
    private ArrayList<Book> list;
    
    public Library(){
        this.list = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        list.add(newBook);
    }
    
    public void printBooks(){
        for(Book b : list){
            System.out.println(b.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : list){
            if(StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : list){
            if(StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : list){
            if(b.year() == year){
                found.add(b);
            }
        }
        
        return found;
    }
}
