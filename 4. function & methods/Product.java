public class Product {

    public static int mult(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int prod = mult(3, 5);
        System.out.println("a * b = " + prod);
    }
}
