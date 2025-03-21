package test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        //배열에 0~9까지 할당하기

        //1. int[] 에 할당하기
        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
        Arrays.setAll(arr, i->i);
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr, i->i+1);
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr, i->(i+1)*10);
        System.out.println(Arrays.toString(arr));
        System.out.println();



        //2. List<Integer> 에 할당하기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(i);
        }
        System.out.println(list);

        //3. 정수배열인 경우 - IntStream
        List<Integer> list2 = IntStream.range(0,10).boxed().toList();
        System.out.println(list2);
        System.out.println();


        //forEach(System.out.::print) 개행없이 출력가능
        for(Integer x : list2){
            System.out.println(x);
        }
        System.out.println();
        IntStream.range(0,10).boxed().forEach(System.out::print);

        //forEach(System.out.::println) 개항하면서 출력가능
        IntStream.range(0,10).boxed().forEach(System.out::println);
        System.out.println();

        //filter + forEach :    0~9 정수들 중 2의 배수들만 출력하기.
        IntStream.range(0,10).boxed().filter((x)->x%2==0).forEach(System.out::print);
        System.out.println();


        //map 각 요소의 10배로 변경하기.
        System.out.println(IntStream.range(0,10).boxed().map(x->x*10).toList());

        //map + forEach
        IntStream.range(0,10).boxed().map(x->x*10).forEach(System.out::print);








    }//end main
}//end class
