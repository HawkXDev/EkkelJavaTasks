package objectIsAll;

public class MyClass {
    int iField;
    char cField;

    /**
     * Create a new class object and make sure that the int and char fields
     * are initialized with the default values
     */
    public static void main(String[] args) {
        MyClass clazz = new MyClass();
        System.out.println(clazz.iField);
        System.out.println(clazz.cField);
    }
    /* Output:
    0
     
    */
}
