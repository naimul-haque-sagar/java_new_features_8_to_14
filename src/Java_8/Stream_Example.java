package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Example {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(22,33,11,23,43,55,33);
        List<Integer> subList=list.stream()
                .filter(integer -> integer%2!=0).map(integer -> integer*2).collect(Collectors.toList());
        System.out.println(subList.toString());

        List<Integer> list1=Stream.iterate(0,e->e+2).limit(10).collect(Collectors.toList());
        System.out.println(list1.toString());

        List<Integer> list2=Stream.iterate(3,i->i+1).filter(i->i%3==0).limit(10).collect(Collectors.toList());
        System.out.println(list2.toString());
    }
}
