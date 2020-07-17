package Java_8;

interface RedCar{
    void printCarName();

    default void printDetails(){
        System.out.println("it's a red car");
    }
    static void classDetails(){
        System.out.println("From RedCar class");
    }
}

interface GreenCar{
    void printClassName();

    default void printDetails(){
        System.out.println("it's a green car");
    }
    static void classDetails(){
        System.out.println("From GreenCar class");
    }
}

public class Default_And_Static_Method implements RedCar,GreenCar{
    public static void main(String[] args) {
        Default_And_Static_Method default_And_static_method =new Default_And_Static_Method();
        default_And_static_method.printDetails();
        default_And_static_method.printClassName();
        default_And_static_method.printCarName();

        RedCar.classDetails();
        GreenCar.classDetails();
    }

    //default method must be override when two interface have same default method orElse error
    @Override
    public void printDetails() {
        System.out.println("From main class Default static method");
    }

    @Override
    public void printCarName() {
        System.out.println("Default static method class");
    }

    @Override
    public void printClassName() {
        System.out.println("It's from main class");
    }

}

