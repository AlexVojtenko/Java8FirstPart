package classes;

import interfaces.FirstInterface;
import interfaces.FourthInterface;

public class InterfaceImplementationClass implements FirstInterface, FourthInterface {
    @Override
    public boolean isTrue() {
        return false;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public int interfaceNumber() {
        return 0;
    }

    @Override
    public String interfaceName() {
        return null;
    }
}
