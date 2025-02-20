// import java.util.*;
// public class Sum {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("The sum of a and b is "+sum);
//         // System.out.println("The sum of a and b is "+sum);
//         sc.close();
//     }
// }

// ---------------------------------------

import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Sum Calculator!");
        
        int a = 0, b = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Please enter the first number: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("Please enter the second number: ");
                b = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }
        
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        
        sc.close();
    }
}