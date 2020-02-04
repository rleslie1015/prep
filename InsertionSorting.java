import java.util.*;

public class InsertionSorting {
    
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 4, 2,3,1};
        insertSort2(array1);
        System.out.println(Arrays.toString(array1));
    }

    
    public static void insertSort(int[] array){
        int temp;
        int j;

        for(int i = 1; i < array.length; i++){
            temp = array[i];
            for(j = i; j > 0 && temp < array[j-1]; j--){
                array[j] = array[j-1];
            }
            array[j+1] = temp;
        }
    }

    public static void insertSort2(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
