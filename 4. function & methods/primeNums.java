
public class primeNums {

    // Function to check if a number is prime
    static boolean isPrime(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to find all prime numbers in the range [m,
    // n]
    static int[] primeRange(int m, int n) {

        // Temporary array to store prime numbers
        int[] temp = new int[n - m + 1];
        int index = 0;

        // Iterate over each number in the range [m, n]
        for (int i = m; i <= n; i++) {

            // Check if the current number is prime
            if (isPrime(i))
                temp[index++] = i;
        }

        // Copy the prime numbers into a result array of
        // correct size
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {

        int m = 1, n = 100;

        int[] ans = primeRange(m, n);

        for (int i : ans)
            System.out.print(i + " ");
    }

}
