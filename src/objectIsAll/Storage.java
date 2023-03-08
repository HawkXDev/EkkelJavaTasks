package objectIsAll;

public class Storage {
    private final String s;

    public Storage(String s) {
        this.s = s;
    }

    int storage() {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage s = new Storage("String");
        System.out.println(s.storage());
        // Output: 12
    }
}
