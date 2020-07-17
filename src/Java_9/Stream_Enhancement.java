package Java_9;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//in jdk 9 four methods were added
//two default methods (takeWhile(),dropWhile())
//two static methods (iterate(),ofNullable())
public class Stream_Enhancement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,6,7,4,8);
        List<Integer> list1= Arrays.asList(12,22,42,62,73,4,8);

        System.out.println(list.stream().takeWhile(i->i%2==0).collect(Collectors.toList()));
        System.out.println(list1.stream().takeWhile(i->i%2==0).collect(Collectors.toList()));
        System.out.println(list1.stream().dropWhile(i->i%2==0).collect(Collectors.toList()));

        Stream.iterate(0,i->i+1).limit(10).forEach(i -> System.out.print(i+" "));

        List<Integer> list2=Arrays.asList(32,23,42,34);
        Stream.ofNullable(list2).forEach(i-> System.out.println(i));
    }
}
