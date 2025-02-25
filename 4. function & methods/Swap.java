public class Swap {

    public static void swap(int a, int b) {
        // swap.
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("The fn part \na = %d \nb = %d", a, b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);

        //this line should print "a = 10 and b = 5".
        //but this line is printing the value as given.
        //because java functions always work with the call by value methods.
        //and this method doesn't change the original values instead it creates a copy. 
        System.out.printf("\nMain method part \na = %d \nb = %d", a, b);
    }
}
