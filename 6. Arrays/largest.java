import java.util.*;

public class largest {
    public static int biggest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest number in the array is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 }; // the target array
        System.out.println("the largest number in the array is " + biggest(numbers));
    }
}
