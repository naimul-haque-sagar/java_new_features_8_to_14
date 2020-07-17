package Java_9;

import java.util.Arrays;
import java.util.List;

//before jdk 9 we can use @SafeVarargs with static,final,constructor only
//but in jdk 9 we can also @SafeVarargs in private method
public class SafeVarargs {
    @java.lang.SafeVarargs
    public SafeVarargs(List<Integer>... value) {
        for(List<Integer> x:value) System.out.println(x);
    }

    @java.lang.SafeVarargs
    public static void add(List<Integer>... value){
        for(List<Integer> x:value) System.out.println(x);
    }

    @java.lang.SafeVarargs
    public final void add1(List<String>... value){
        for(List<String> x:value) System.out.println(x);
    }

    @java.lang.SafeVarargs
    private void add2(List<Integer>... value){
        for(List<Integer> x:value) System.out.println(x);
    }

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4);
        List<Integer> list1=Arrays.asList(5,6,7,8);
        List<String> list2=Arrays.asList("a","b","c","d");
        List<String> list3=Arrays.asList("e","f","g","h");

        SafeVarargs safeVarargs=new SafeVarargs(list,list1);

        add(list,list1);
        safeVarargs.add1(list2,list3);
        safeVarargs.add2(list,list1);
    }

//@SafeVarargs is used to prevent heap pollution problem
}
