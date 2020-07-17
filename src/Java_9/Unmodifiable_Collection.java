package Java_9;

import java.util.List;

public class Unmodifiable_Collection {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4,55);
        List<Integer> list1=List.copyOf(list);

        System.out.println(list);
        System.out.println(list1);

        // list.add(22);
        // list.add(99);

        //Above two lines will throw UnsupportedOperationException exception
        // because of trying to add values in unmodifiable collection
    }
}
