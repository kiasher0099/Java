/**
 * @Description: Verify demo sort codes
 * 
 * @Date: 2020.12.18
 */

public class TestDemo {

    public static void main(String[] args) {        
        int[] array = {2,3,1,4,0,9,6,8,7,5};
        int[] sortedArray = null;

        // Bubble Sort
        System.out.println("Bubble sort: Original Array = 2 3 1 4 0 9 6 8 7 5");
        sortedArray = BubbleSort.bubbleSort(array);
        System.out.print("Bubble sort: Sorted Array = ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }

}