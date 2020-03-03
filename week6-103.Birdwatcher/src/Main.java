
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        Database data = new Database();
    
        while(true){
            System.out.print("?");
            String op = scanner.nextLine();
            
            //Cant switch...
            
            if(op.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.println("Latin name: ");
                String latinName = scanner.nextLine();
                Bird b = new Bird(name, latinName);
                data.addBird(b);
                
                
            }else if(op.equals("Observation")){
                System.out.println("What was observed:? ");
                String name = scanner.nextLine();
                boolean flag = false;
                
                for(Bird b : data.getList()){
                    if(b.getName().equals(name)){
                        data.addObservation(b);
                        flag = true;
                    }
                }
                if(!flag)
                    System.out.println("Is not a bird!");
                
                
            }else if(op.equals("Statistics")){
                data.statistics();
                
                
            }else if(op.equals("Show")){
                System.out.println("What:? ");
                String name = scanner.nextLine();
                for(Bird b : data.getList()){
                    if(b.getName().equals(name)){
                        data.show(b);
                    }
                }
                
                
            }else if(op.equals("Quit")){
                break;
            }
        }      
    }

}
