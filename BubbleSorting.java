import java.util.*;

// Bubble sort : Basically just goes throuht the list and compares two items and swaps those two items in order.
// The loop stops after a list has no more items to swap.
public class BubbleSorting {
    
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 4, 2,3,1};
        // bubbleSort(array1);
        bubbleSort2(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp; 
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;

                }
            }
        }
    }

    public static void bubbleSort2(int[] array){
        int temp;

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

