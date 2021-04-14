package interfaces;

public interface FourthInterface extends FirstInterface {

    default void sameDefaultMethod(String text) {
        int len = text.length();
        System.out.println("Length of text is " + len);
    }

    static void print() {
        System.out.println("Fourth interface method print");
    }

    boolean isTrue();

    double doubleValue();
}
