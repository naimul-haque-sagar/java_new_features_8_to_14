package Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++) list.add(i);

        list.forEach(System.out::println);
        list.forEach((i)-> System.out.print(i+" "));
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer +" ");
            }
        });
    }
}
