public class reverseNum {
    public static void main(String[] args) {
        // int n = 1234;
        // int reverse = 0;
        // while (n>0) {
        //     int rem = n%10;
        //     reverse = reverse*10 + rem;
        //     n = n/10;
        // }
        // System.out.println("The reverse of the number is " + reverse);


        int n = 1234;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
}
