package Java_9;

//in jdk 7 abstract method and static,public,final variable was only allowed for interface
//in jdk 8 default method and static method was allowed in interface
//in jdk 9 private method is also allowed in interface
interface PrivateMethod{
    //private method is used for code reusability
    private void printSomething(){
        System.out.println("I'm from private method");
    }

    private static void printAgain(){
        System.out.println("I'm from private static method");
    }
    default void print(){
        printSomething();
        printAgain();
    }
}

public class Private_Method_In_Interface implements PrivateMethod{
    public static void main(String[] args) {
        PrivateMethod privateMethod=new Private_Method_In_Interface();
        privateMethod.print();
    }
}
