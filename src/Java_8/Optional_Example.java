package Java_8;

import java.util.Optional;

public class Optional_Example {
    public static void main(String[] args) {
        Optional<String> optional= Optional.of("sagar");
        System.out.println(optional);

        Optional<String> optional2=Optional.ofNullable("naim");
        System.out.println(optional2.map(string->string.toUpperCase()));
        System.out.println(optional2);

        String []arr=new String[5];
        Optional<String> value=Optional.ofNullable(arr[2]);
        System.out.println(value);
        value.ifPresent(s-> System.out.println(s));
        value.ifPresentOrElse(s-> System.out.println(s.toUpperCase()),()-> System.out.println("NO value provided"));
    }
}
