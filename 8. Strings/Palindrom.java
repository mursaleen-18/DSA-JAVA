import java.util.*;

public class Palindrom {

    public static boolean checkPal(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                // not a palindrom
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPal(str));;
    }
}
