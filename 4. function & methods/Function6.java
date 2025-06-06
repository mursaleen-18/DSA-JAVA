/**
 * Program demonstrating function to convert decimal number to binary
 * Shows how to create and use a function for number system conversion
 */
public class Function6 {
    /**
     * Converts a decimal number to binary
     * param decNum decimal number to convert
     * return binary equivalent of the decimal number
     */
    public static int decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        return binNum;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates decimal to binary conversion
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Convert decimal number 7 to binary
        System.out.println(decToBin(7));
    }
} 