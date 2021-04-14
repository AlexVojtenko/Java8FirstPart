package classes;

import interfaces.SecondInterface;
import interfaces.ThirdInterface;

public class OtherInterfaceImplementationClass implements SecondInterface, ThirdInterface {
    @Override
    public int returnNumber() {
        return 0;
    }

    @Override
    public String returnText() {
        return null;
    }

    @Override
    public int firstContractMethod() {
        return 0;
    }

    @Override
    public String secondContractMethod() {
        return null;
    }
}
