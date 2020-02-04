import java.util.Arrays;

public class MergeSort {

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
            i++;
            lowIndex1++;
        }
        while(lowIndex2 <= highIndex){
            sortArray[i] = tempArray[lowIndex2];
            i++;
            lowIndex2++;
        }   
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,4,10,9,3,7,2,1};
        int[] temp = new int[array.length];
        System.out.println("Original");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted");
        mergeSort(array, temp, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}