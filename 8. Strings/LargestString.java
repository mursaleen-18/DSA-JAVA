
public class LargestString {

    public static void main(String[] args) {

        // Find the largest string in an array of strings
        // this will compare strings lexicographically
        // and return the largest one based on alphabetical order
        String fruits[] = {"apple", "banana", "cherry", "date"};
        String largest = fruits[0];

        for(int i = 1; i<fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
