package Java_8;

import java.util.Arrays;

public class Parallel_Array_Sort {
    public static void main(String[] args) {
        int arr[]={33,4,23,4,3,55,6,9,1,0};
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));

        Arrays.parallelSort(arr);
        System.out.println();
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));

        int arr1[]={133,14,123,14,13,155,16,19,11,10};
        Arrays.parallelSort(arr1,0,4);
        System.out.println();
        Arrays.stream(arr1).forEach(i-> System.out.print(i+" "));
    }
}
