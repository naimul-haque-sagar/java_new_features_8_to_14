package Java_8;

import java.util.ArrayList;
import java.util.List;

public class Lambd_Expression {
    public static void main(String[] args) {
        Interface5 interface5=(x,y)->(x+y);
        System.out.println(interface5.add(3,4));

        Interface6 interface6=()-> System.out.println("Hello");
        interface6.print();

        Interface7 interface7=(name)->{
            var result=name+"is my name";
            return result;
        };
        System.out.println(interface7.name("sagar "));

        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++) list.add(i);
        list.forEach((i)-> System.out.print(i+" "));

        Thread thread=new Thread(()-> System.out.println("Thread is running"));
        thread.start();
    }
}

@FunctionalInterface
interface Interface5{
    int add(int x,int y);
}

@FunctionalInterface
interface Interface6{
    void print();
}

@FunctionalInterface
interface Interface7{
    String name(String name);
}


