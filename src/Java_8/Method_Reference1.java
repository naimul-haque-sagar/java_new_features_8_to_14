package Java_8;

import java.util.function.BiFunction;

public class Method_Reference1 {
    public static void main(String[] args) {
        Sayable sayable=new Helper()::saySomething;
        sayable.say();

        Helper helper=new Helper();
        Sayable sayable1=helper::writeSomething;
        sayable1.say();

        BiFunction<Integer,Integer,Integer> biFunction=new Helper()::add;
        System.out.println(biFunction.apply(12,2));

        BiFunction<Integer,Integer,Integer> biFunction1=helper::mul;
        System.out.println(biFunction1.apply(4,3));
    }
}

class Helper{
    public void saySomething(){
        System.out.println("Hello world");
    }
    public void writeSomething(){
        System.out.println("Write hello");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int mul(int a,int b){
        return a*b;
    }
}

@FunctionalInterface
interface Sayable{
    void say();
}
