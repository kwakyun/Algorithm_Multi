package test.stream;

import java.util.Arrays;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        //mapToInt(),mapToDouble(),,,,,.
        //min,max,sum 등을 쉽게 획득할 수 있다.
        List<Double> list = Arrays.asList(1.1, 2.2, 3.3,4.4);
        System.out.println(list.stream().mapToDouble(x->x).min());//OptionalDouble[1.1]
        System.out.println(list.stream().mapToDouble(x->x).min().getAsDouble());//1.1
        System.out.println(list.stream().mapToDouble(x->x).max().getAsDouble());//4.4
        System.out.println(list.stream().mapToDouble(x->x).sum());//11.0
        System.out.println();

        List<Integer> list2 = Arrays.asList(11,22,33,44);
        //min,max,sum 등을 쉽게 획득할 수 있다.
        System.out.println(list2.stream().mapToInt(x->x).sum());
        System.out.println(list2.stream().mapToInt(x->x).min().getAsInt());//11
        System.out.println(list2.stream().mapToInt(x->x).max().getAsInt());//44
        System.out.println();

        /// /기본타입배열을 사용할 경우///
        int[] sus = new int[]{55,66,77};
        System.out.println(Arrays.toString(sus));

        System.out.println(Arrays.stream(sus).sum());//int type
        System.out.println(Arrays.stream(sus).min().getAsInt());
        System.out.println(Arrays.stream(sus).max().getAsInt());
        System.out.println();

        System.out.println(Arrays.stream(sus).mapToLong(x->x).sum());//long type
        System.out.println(Arrays.stream(sus).mapToLong(x->x).min().getAsLong());
        System.out.println(Arrays.stream(sus).mapToLong(x->x).max().getAsLong());

    }//end main
}//end class