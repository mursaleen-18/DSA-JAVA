import java.util.*;
public class JavaBasics {
    public static void main(String args[]){
        // System.out.println("hellow world!! It's me");
        // System.out.println("hellow world!! It's me");
        // System.out.println("hellow world!! It's me");

        // ----------------------------------------------
        // Star Pattern
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // ----------------------------------------------
        // taking input in java.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("the input is "+input);
        int num = sc.nextInt();
        System.out.println("the number is "+num);
        float Price = sc.nextFloat();
        System.out.println("the price is "+Price);
        sc.close(); // closing the scanner object to avoid resource leak.
    }
} 


