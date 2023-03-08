package objectIsAll;

public class Incrementable {
    static class StaticTest {
        static int i = 47;
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        Incrementable sf = new Incrementable();
        sf.increment();

        System.out.print(st1.i);
        System.out.println(st2.i);
        // Output: 4848
    }

    static void increment() {
        StaticTest.i++;
    }
}
