package Java_10;

import java.util.ArrayList;

public class Var_Keyword {

    //var string="var"; //var can not be declared in global places

    public static void main(String[] args) {

        //var can only be declared in local places
        var string1="Naimul";
        var num=1;
        var dou=2.2;

        System.out.println(string1);
        System.out.println(num);
        System.out.println(dou);

        var list=new ArrayList();
        list.add(1);list.add(2);list.add(3);
        System.out.println(list.toString());

        //array in var
        //class in var
    }
}

