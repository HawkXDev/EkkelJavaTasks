package objectIsAll;

public class DataOnly {
    int i;
    boolean b;
    double d;

    public DataOnly(int i, boolean b, double d) {
        this.i = i;
        this.b = b;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("i = %d; b = %b; d = %.2f", i, b, d);
    }

    public static void main(String[] args) {
        DataOnly d = new DataOnly(1, true, 10.5);
        System.out.println(d);
        // Output:
        // i = 1; b = true; d = 10.50
    }
}
