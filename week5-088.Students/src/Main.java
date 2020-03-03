
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            
            if(name.equals(""))
                break;
            
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            
            Student n = new Student(name, number);
            list.add(n);
        }
        
        System.out.println("");
        for(Student st : list){
            System.out.println(st);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for(Student st : list){
            if(st.getName().contains(searchTerm))
                System.out.println(st);
        }
        
    }
}
