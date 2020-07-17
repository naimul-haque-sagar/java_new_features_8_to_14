package Java_9;

//with diamond operator anonymous class throws error
//but in jdk 9 it works fine
public class Diamond_Operator_For_Anonymous_Class {
    public static void main(String[] args) {
        Input<Integer> input=new Input<>() {
            @Override
            public Integer add(Integer a, Integer b) {
                return a+b;
            }
        };
        System.out.println(input.add(2,2));
    }
}

interface Input<T>{
     T add(T a,T b);
}