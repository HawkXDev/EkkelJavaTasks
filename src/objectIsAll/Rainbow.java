package objectIsAll;

public class Rainbow {
    int hue;

    public Rainbow(int hue) {
        this.hue = hue;
    }

    void changeColorHue(int newHue) {
        hue = newHue;
    }

    public static void main(String[] args) {
        Rainbow r = new Rainbow(35);
        r.changeColorHue(45);
        System.out.println(r.hue);
    }
}
