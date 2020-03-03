public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    /*
    NO DEBERÍA USAR LOS PARÁMETROS CAMBIÁNDOSE EN EL BUCLE
    */
    public static void printStars(int amount) {
        while(amount > 0){
            System.out.printf("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount > 0){
            System.out.printf(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = size-1;
        int j = 1;
        
        while(size > 0){
            printWhitespaces(i);
            printStars(j);
            i--;
            j++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int base = height;
        int i = height-1;
        int j = 1;
        
        while(height > 0){
            printWhitespaces(i);
            printStars(j);
            i--;
            j+=2;
            height--;
        }
        //base
        printWhitespaces(base-2);
        printStars(3);
        printWhitespaces(base-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
