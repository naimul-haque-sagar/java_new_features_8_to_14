package Java_8;

import java.util.StringJoiner;

public class StringJoiner_Example {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",");
        stringJoiner.add("Naimul");
        stringJoiner.add("my name");
        System.out.println(stringJoiner);
        System.out.println(stringJoiner.length());
        System.out.println(stringJoiner.toString());

        StringJoiner stringJoiner1=new StringJoiner(",","[","]");
        stringJoiner1.add("Naimul");
        stringJoiner1.add("haque");
        stringJoiner1.add("sagar");
        System.out.println(stringJoiner1.setEmptyValue("Empty value provided"));

        System.out.println(stringJoiner.merge(stringJoiner1));
    }
}
