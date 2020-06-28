package Java_8;

@FunctionalInterface
interface Interface2{
    void printSomething();

    //functional interface should have only one abstract method .....but
    //it can also declare Object class methods in it
    int hashCode();

    String toString();
}

public class Functional_Interface1 implements Interface2 {
    public static void main(String[] args) {
        Functional_Interface1 functional_interface1=new Functional_Interface1();
        functional_interface1.printSomething();
    }

    @Override
    public void printSomething() {
        System.out.println("Functional interface can also declare object class methods");
    }
}
