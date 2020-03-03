public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        while(amount > 0){
            System.out.printf("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = sideSize;
        while(i > 0){
            printStars(sideSize);
            i--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i = height;
        while(i > 0){
            printStars(width);
            i--;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int i = 1;
        while(i <= size){
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
