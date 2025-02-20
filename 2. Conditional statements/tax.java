import java.util.*;
public class tax {
    public static void main(String[] args){
        System.out.println("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0;
        if (income <= 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (income *0.2);
        }
        else{
            tax = (income * 0.3);
        }
        System.out.println("Tax to be paid: " + tax);
        sc.close();
    }
}
