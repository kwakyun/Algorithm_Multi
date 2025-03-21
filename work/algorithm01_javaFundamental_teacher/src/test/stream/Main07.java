package test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main07 {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        //Hello문자열이 n개 들어있는 컬렉션 배열생성하기
        List<String> list = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            list.add("Hello");
        }
        System.out.println(list);

        //World 문자열이 n개 들어있는 문자열 배열생성하기
        String[] arr = new String[n];
        Arrays.fill(arr, "World");
        System.out.println(Arrays.toString(arr));

        //스트림을 이용해서 배열의 요소 생성하기. generate기능 + limit
        //[java, java, java, java, java]
        System.out.println(Stream.generate(()->"java").limit(5).toList());
        List<String> list2 = Stream.generate(()->"java").limit(5).toList();
        System.out.println(list2);

        String[] arr2 = Stream.generate(()->"java").limit(5).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        //스트림을 이용(generate)해서 배열의 요소 생성하기  >> [10,10,10,10,10]
        System.out.println(Stream.generate(()->10).limit(5).toList());

        //스트림을 이용(iterate)해서 배열의 요소 생성하기  >> [0,1,2,3,4]
        System.out.println(Stream.iterate(0, x->x).limit(5).toList());//[0,0,0,0,0]
        System.out.println(Stream.iterate(0, x->x+1).limit(5).toList());//[0,1,2,3,4]
        System.out.println(Stream.iterate(1, x->x+1).limit(5).toList());//[1,2,3,4,5]
        System.out.println(Stream.iterate(0, x->x+10).limit(5).toList());//[0, 10, 20, 30, 40]
        System.out.println(Stream.iterate(1, x->x+10).limit(5).toList());//[1, 11, 21, 31, 41]
        System.out.println(Stream.iterate(1, x->x*10).limit(5).toList());//[1, 10, 100, 1000, 10000]
        System.out.println();

        //랜덤객체를 이용해서 랜덤한 정수값들을 배열에 할당하기.
        List<Integer> list3 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list3.add(random.nextInt());
        }
        System.out.println(list3);
        //랜덤객체를 이용(ints)해서 랜덤한 정수값들을 배열에 할당하기.
        System.out.println(new Random().ints(5).boxed().toList());

        //랜덤객체를 이용(doubles)해서 랜덤한 난수값들을 배열에 할당하기.
        System.out.println(new Random().doubles(5).boxed().toList());

    }//end main
}//end class