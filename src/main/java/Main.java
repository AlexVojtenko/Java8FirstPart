import classes.InterfaceImplementationClass;
import classes.OtherInterfaceImplementationClass;
import interfaces.FirstInterface;
import interfaces.FourthInterface;
import interfaces.SecondInterface;
import interfaces.ThirdInterface;
import util.OptionalHelper;

public class Main {

    public static void main(String[] args) {
        FirstInterface.print();
        SecondInterface.print();
        ThirdInterface.print();
        FourthInterface.print();
        FirstInterface first = new InterfaceImplementationClass();
        first.sameDefaultMethod(true, 'c');
        FourthInterface fourth = new InterfaceImplementationClass();
        fourth.sameDefaultMethod("c");
        SecondInterface second = new OtherInterfaceImplementationClass();
        second.sameDefaultMethod('c');
        ThirdInterface third = new OtherInterfaceImplementationClass();
        third.sameDefaultMethod(4, 2);
        first.interfaceName();
        first.interfaceNumber();
        second.returnNumber();
        second.returnText();
        third.firstContractMethod();
        third.secondContractMethod();
        fourth.doubleValue();
        fourth.isTrue();
        OptionalHelper optional = new OptionalHelper();
        System.out.println(optional.returnOptional("example@email.com").get());
        System.out.println(optional.returnOptional("exampleemail.com").get());

    }
}
