public class EvenOdd {
    // Method to check if a number is even or odd using bit manipulation
    public static void checkEvenOdd(int number) {
        int bitMask = 1; // Bitmask to isolate the least significant bit (LSB)
        // If LSB is 0, the number is even; if LSB is 1, the number is odd
        if ((number & bitMask) == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

    public static void main(String[] args) {
        // Test the checkEvenOdd method with different numbers
        checkEvenOdd(5); // Output: 5 is an odd number
        checkEvenOdd(8); // Output: 8 is an even number
        checkEvenOdd(9); // Output: 9 is an odd number
    }
}
