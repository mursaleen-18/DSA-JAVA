import java.util.*;

public class bubbleSort {
    // bubble sort function
    public static void sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // print the sorted array.
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 }; // unsorted array.
        sort(arr);
        printArr(arr);
    }
}
