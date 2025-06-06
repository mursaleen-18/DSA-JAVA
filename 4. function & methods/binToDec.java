/**
 * Program demonstrating function to convert binary number to decimal
 * Shows how to create and use a function for number system conversion
 */
public class binToDec {
    /**
     * Converts a binary number to decimal
     * param binNum binary number to convert
     * return decimal equivalent of the binary number
     */
    public static int binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        return decNum;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates binary to decimal conversion
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Convert binary number 101 to decimal
        System.out.println(binToDec(101));
    }
}
