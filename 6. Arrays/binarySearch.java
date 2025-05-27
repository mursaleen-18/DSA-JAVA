public class binarySearch {

    public static int search(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid])
                return mid;

            if (arr[mid] < key) // right
                start = mid + 1;

            else // left
                end = mid - 1;

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;

        System.out.println("index for key is " + search(arr, key));
    }
}
