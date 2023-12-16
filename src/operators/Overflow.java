package operators;

public class Overflow {
    public static void main(String[] args) {
        // In Java is possible to overflow
        int big = Integer.MAX_VALUE;
        System.out.println("Big: " + big);
        int bigger = big * 4;
        System.out.println("Even bigger: " + bigger);
    }
} /* Output:
Big: 2147483647
Even bigger: -4
*/
