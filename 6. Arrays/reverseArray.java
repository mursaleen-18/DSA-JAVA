public class reverseArray {
    public static void reverse(int numbers[]){
        int first=0, last=numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    // print the array.
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        // printArr(reverse(numbers));
        reverse(numbers);
        printArr(numbers);
    }
}
