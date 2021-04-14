package interfaces;

public interface ThirdInterface {

    default void sameDefaultMethod(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        System.out.println("Sum of numbers is : " + (firstNumber + secondNumber));
        System.out.println("Difference of numbers is : " + (firstNumber - secondNumber));
    }

    static void print() {
        System.out.println("Third interface method print");
    }

    int firstContractMethod();

    String secondContractMethod();
}
