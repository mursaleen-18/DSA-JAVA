import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {

    // print the sorted array.
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
