import java.util.*;

public class insertionSort {
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // current element
            int prev = i - 1; // previous element
            // find out correct position to insert.
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    // print the sorted array.
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
        printArr(arr);
    }
}
