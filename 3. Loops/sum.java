import java.util.*;
public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum =0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }   
        System.out.println("The sum of first " + n + " numbers is " + sum);
        sc.close();
    }
}
