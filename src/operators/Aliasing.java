package operators;

import static net.mindview.util.Print.print;

public class Aliasing {
    public static class Price {
        private float value;

        public Price(float value) {
            this.value = value;
        }

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Price p1 = new Price(2.50F);
        Price p2 = new Price(3.50F);
        printValues(p1, p2);

        p1 = p2;
        printValues(p1, p2);

        p1.setValue(1.50F);
        printValues(p1, p2);
    }

    private static void printValues(Price p1, Price p2) {
        print("1: p1.value: " + p1.getValue() + ", p2.value: " + p2.getValue());
    }
}
