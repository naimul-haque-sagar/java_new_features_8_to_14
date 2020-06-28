package Java_8;

@FunctionalInterface
interface Interface3 extends Interface4{
    void printSomething();
}

interface Interface4{
    default void defaultMethod(){
        System.out.println("Default method");
    }
}

public class Functional_Interface2 implements Interface3{
    public static void main(String[] args) {
        Functional_Interface2 functional_interface2=new Functional_Interface2();
        functional_interface2.printSomething();
        functional_interface2.defaultMethod();
    }

    @Override
    public void printSomething() {
        System.out.println("Functional interface can extends non functional interface");
    }
}
