package operators;

import static net.mindview.util.Print.print;

public class PassObject {
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

        @Override
        public String toString() {
            return "Price{" +
                    "value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        var p = new Price(2.50F);
        print(p);

        f(p);
        print(p);
    }

    private static void f(Price p) {
        p.setValue(1.50F);
    }
}
