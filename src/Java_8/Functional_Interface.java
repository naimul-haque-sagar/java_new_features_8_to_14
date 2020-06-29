package Java_8;

@FunctionalInterface
interface Example{
    void printSomething();

    default void writeSomething(){
        System.out.println("Write something");
    }

    static void staticMethod(){
        System.out.println("Static method of Example");
    }
}

public class Functional_Interface implements Example{
    public static void main(String[] args) {
        Functional_Interface functional_interface=new Functional_Interface();
        functional_interface.printSomething();
        functional_interface.writeSomething();

        Example.staticMethod();
    }

    @Override
    public void printSomething() {
        System.out.println("Hello");
    }

    @Override
    public void writeSomething() {
        System.out.println("Write something overridden");
    }
}
