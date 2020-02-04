// import java.lang.reflect.Array;
import java.util.Arrays;
// import java.util.HashMap;

public class MergeSort3 {

    public static void mergeSort(int[] sortArray, int[] tempArray, int lowIndex, int highIndex){
        if(highIndex > lowIndex){
            int midIndex = (highIndex + lowIndex)/2;
            mergeSort(sortArray, tempArray, lowIndex, midIndex);
            mergeSort(sortArray, tempArray, midIndex+1, highIndex);
            merge(sortArray, tempArray, lowIndex, midIndex, highIndex);
        }
    }

    public static void merge(int[] sortArray, int[] tempArray, int lowIndex, int midIndex, int highIndex){
        int lowIndex1 = lowIndex;
        int lowIndex2 = midIndex+1;
        int i = lowIndex;
        
        System.arraycopy(sortArray, 0, tempArray, 0, sortArray.length);
        
        while(lowIndex1 <= midIndex && lowIndex2 <= highIndex){
            if(tempArray[lowIndex1] <= tempArray[lowIndex2]){
                sortArray[i] = tempArray[lowIndex1];
                lowIndex1++;
            } else {
                sortArray[i] = tempArray[lowIndex2];
                lowIndex2++;
            }
            i++;
        }
        while(lowIndex1 <= midIndex){
            sortArray[i] = tempArray[lowIndex1];
            lowIndex1++;
            i++;
        }
        while(lowIndex2 <= highIndex){
            sortArray[i] = tempArray[lowIndex2];
            lowIndex2++;
            i++;
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{8, 9, 7, 6, 4, 5, 3, 1, 2};
        int[] temp = new int[array.length];

        mergeSort(array, temp, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        
    }
}