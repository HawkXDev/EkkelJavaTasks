package operators;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var distance = scanner.nextDouble();
            var time = scanner.nextDouble();
            var speed = distance / time;
            System.out.println("speed = " + speed);
        }
    }
}
