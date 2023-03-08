package objectIsAll;

public class ATypeName {
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.print();
    }

    private void print() {
        System.out.println(this.getClass().getSimpleName());
        // Output: ATypeName
    }
}
