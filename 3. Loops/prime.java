import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean flag = false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if (flag==true){
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
            
        }
        sc.close();
    }
}
