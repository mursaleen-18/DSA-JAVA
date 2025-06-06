public class BitManipulation {

    public static void main(String[] args) {
        System.out.println("AND operator: 5 & 6 = " + (5 & 6)); // bitwise AND operator

        System.out.println("OR operator: 5 | 6 = " + (5 | 6)); // bitwise OR operator

        System.out.println("XOR operator: 5 ^ 6 = " + (5 ^ 6)); // bitwise XOR operator

        // Bitwise NOT is a unary operator, not binary. Use ~5 and ~6 separately.
        System.out.println("NOT operator: ~5 = " + (~5)); // bitwise NOT of 5
        System.out.println("NOT operator: ~6 = " + (~6)); // bitwise NOT of 6
        System.out.println("NOT operator: ~0 = " + (~0)); // bitwise NOT of 0

    }
}