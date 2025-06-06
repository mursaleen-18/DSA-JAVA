import java.util.Scanner;

/**
 * Program demonstrating basic array operations in Java
 * Shows how to declare, initialize, and access array elements
 */
public class ArrayCC {
    /**
     * Main method - entry point of the program
     * Demonstrates array declaration, initialization, and access
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int marks[] = new int[100];

        System.out.println("length of Array "+ marks.length);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();    //phy
        marks[1] = sc.nextInt();    //chem
        marks[2] = sc.nextInt();    //math

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        
        // Update value
        marks[2] = 100; 
        System.out.println("math : "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage+"%");
        sc.close();
    }
}