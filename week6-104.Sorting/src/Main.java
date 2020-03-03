
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    
    public static int smallest(int[] array){
        int aDev = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < aDev){
                aDev = array[i];
            }
        }
        
        return aDev;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int aComp = array[0];
        int aDev = 0; //index
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < aComp){
                aComp = array[i];
                aDev = i;
            }
        }
        
        return aDev;
    }
    
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int aComp = array[index];
        int aDev = index; //index
        
        for(int i = index; i < array.length; i++){
            if(array[i] < aComp){
                aComp = array[i];
                aDev = i;
            }
        }
        
        return aDev;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indSmallest);
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j]);
            }
            System.out.println("");
        }
    }

}
