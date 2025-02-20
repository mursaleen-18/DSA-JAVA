import java.util.*;
public class student {
    public static void main(String[] args) {
        System.out.println("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String type = (marks >=33)? "pass" : "fail";
        System.out.println("You " + type + " the exam.");
        sc.close();
    }
}
