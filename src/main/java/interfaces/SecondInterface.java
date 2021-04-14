package interfaces;

public interface SecondInterface extends ThirdInterface {

    default void sameDefaultMethod(char symbol) {
        System.out.println(Character.toUpperCase(symbol));
    }

    static void print() {
        System.out.println("Second interface method print");
    }

    int returnNumber();

    String returnText();
}
