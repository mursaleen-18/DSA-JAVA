import java.util.*;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};

        String str = "abcd";
        String str2 = new String("xyz");

        // NOTE: strings are IMMUTABLE in java.

        System.out.println(str);
        System.out.println(str2);

        // Concatenation
        String str3 = str + str2;   
        System.out.println(str3);

        // Length
        System.out.println("Length of str3: " + str3.length());

        // Character at index
        System.out.println("Character at index 2: " + str3.charAt(2));

        // Substring
        System.out.println("Substring from index 1 to 4: " + str3.substring(1, 4));

        // Convert to char array
        char[] charArray = str3.toCharArray();
        System.out.println("Character array: " + Arrays.toString(charArray));

        // Convert to uppercase
        String upperCaseStr = str3.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // Convert to lowercase
        String lowerCaseStr = str3.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        // Replace characters
        String replacedStr = str3.replace('a', 'z');
        System.out.println("Replaced 'a' with 'z': " + replacedStr);

        // Split string
        String[] splitStr = str3.split("c");
        System.out.println("Split string: " + Arrays.toString(splitStr));

        // Substring
        String subStr = str3.substring(1, 5);
        System.out.println("Substring from index 1 to 5: " + subStr);

        // Check if string contains a substring
        boolean contains = str3.contains("bc");
        System.out.println("Contains 'bc': " + contains);

        // Check if string starts with a prefix
        boolean startsWith = str3.startsWith("ab");
        System.out.println("Starts with 'ab': " + startsWith);

        // Check if string ends with a suffix
        boolean endsWith = str3.endsWith("xyz");
        System.out.println("Ends with 'xyz': " + endsWith);
        
        // Compare strings
        int comparison = str.compareTo(str2);
        System.out.println("Comparison result: " + comparison);

        // Check if strings are equal
        boolean isEqual = str.equals(str2);
        System.out.println("Strings are equal: " + isEqual);

        // Check if strings are equal ignoring case
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str2);
        System.out.println("Strings are equal (ignoring case): " + isEqualIgnoreCase);


        // input string
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
