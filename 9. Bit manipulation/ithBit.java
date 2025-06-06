public class ithBit {

    // Returns the ith bit (0 or 1) of number n.
    // Example: getIthBit(10, 3) returns 1 because 10 (1010) has 1 at index 3 (from right, 0-based).
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i; // Create a mask with only the ith bit set.
        if ((n & bitMask) == 0) {
            return 0; // If the ith bit is 0
        } else
            return 1; // If the ith bit is 1
    }

    // Sets the ith bit of number n to 1 and returns the new number.
    // Example: setIthBit(10, 2) returns 14 (1110).
    public static int setIthBit(int n, int i) {
        int Bitmask = 1 << i; // Create a mask with only the ith bit set.
        return n | Bitmask;   // Set the ith bit using OR operation.
    }

    // Clears (sets to 0) the ith bit of number n and returns the new number.
    // Example: clearIthBit(10, 3) returns 2 (0010).
    public static int clearIthBit(int n, int i) {
        int Bitmask = ~(1 << i); // Create a mask with all bits 1 except the ith bit.
        return n & Bitmask;      // Clear the ith bit using AND operation.
    }

    // Updates the ith bit of number n to newBit (0 or 1) and returns the new number.
    // Example: updateIthBit(10, 1, 0) returns 8 (1000).
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i); // Set ith bit to 0
        } else {
            return setIthBit(n, i);   // Set ith bit to 1
        }
    }

    // Clears (sets to 0) the last i bits of number n and returns the new number.
    // Example: clearIBits(15, 2) returns 12 (1100).
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i; // Mask with 1s except for the last i bits.
        return n & bitMask;      // Clear last i bits using AND operation.
    }

    // Clears all bits from position i to j (inclusive) in number n and returns the new number.
    // Example: clearBitsInRange(10, 2, 4) clears bits 2 to 4 in 10 (1010), returns 2 (0010).
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1)); // Mask with 1s before position j+1.
        int b = (1 << i) - 1;      // Mask with 1s after position i-1.
        int bitMask = a | b;       // Combine masks to have 0s from i to j.
        return n & bitMask;        // Clear bits in range using AND operation.
    }

    public static void main(String[] args) {

        // Uncomment the following lines to test each function:

        // System.out.println(getIthBit(10, 3));            // Output: 1
        // System.out.println(setIthBit(10, 2));            // Output: 14
        // System.out.println(clearIthBit(10, 3));          // Output: 2
        // System.out.println(updateIthBit(10, 1, 0));      // Output: 8
        // System.out.println(clearIBits(15, 2));           // Output: 12
        // System.out.println(clearBitsInRange(10, 2, 4));  // Output: 2
    }
}
