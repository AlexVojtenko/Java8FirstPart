package interfaces;

public interface FirstInterface {

    default void sameDefaultMethod(boolean statement, char symbol) {
        if (statement) {
            System.out.println(Character.toUpperCase(symbol));
        } else {
            System.out.println(Character.toLowerCase(symbol));
        }
    }

    static void print() {
        System.out.println("First interface method print");
    }

    int interfaceNumber();

    String interfaceName();
}
