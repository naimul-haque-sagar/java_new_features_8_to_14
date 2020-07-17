package Java_8;

interface Interface1{
    void printDetails();
    default void printName(){
        System.out.println("Interface1 class");
    }
    static void className(){
        System.out.println("class name is interface1");
    }
}

public class Default_And_Static_Method1 implements Interface1{
    public static void main(String[] args) {
        Default_And_Static_Method1 default_And_static_method1 =new Default_And_Static_Method1();
        default_And_static_method1.printDetails();
        default_And_static_method1.printName();

        Interface1.className();
    }

    @Override
    public void printDetails() {
        System.out.println("Default_static_method class");
    }
}

