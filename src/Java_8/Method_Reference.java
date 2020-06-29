package Java_8;

import java.util.function.BiFunction;

public class Method_Reference {
    public static void main(String[] args) {
        Write write=Method_Reference::writeSomething;
        write.write();

        Write1 write1=Method_Reference::printstring;
        System.out.println(write1.printString("Sagar"));

        Thread thread=new Thread(Method_Reference::threadStatus);
        thread.start();

        BiFunction<Integer,Integer,Integer> biFunction=Method_Reference::add;
        System.out.println(biFunction.apply(44,22));
    }

    public static void writeSomething(){
        System.out.println("Hello World");
    }
    public static String printstring(String string){
        return string;
    }
    public static void threadStatus(){
        System.out.println("Thread running");
    }
    public static int add(int a,int b){
        return a+b;
    }
}

@FunctionalInterface
interface Write{
    void write();
}

@FunctionalInterface
interface Write1{
    String printString(String s);
}
