package test.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.stream().toList());

        //Stream 객체에 데이터 add하는 기능이 있다.
        List<Object> list2 = Stream.builder().add(1).add(2).add(3).build().toList();
        System.out.println(list2);
        System.out.println(Stream.builder().add(1.1).add(2.2).add(3.3).build().toList());
        //필터링 가능
        System.out.println(Stream.builder().add(1.1).add(2.2).add(3.3).build().filter(x->(Double) x<2).toList());
        //문자열도 할당가능
        System.out.println(Stream.builder().add("kim").add("lee").add("yang").build().filter(x->((String)x).length()==4).toList());
        //매핑도 가능
        System.out.println(Stream.builder().add("kim").add("lee").add("yang").build().map(x->"Hello"+ x.toString()).toList());
        System.out.println();

        //여러타입도 add 가능 ->   build가 Object 타입이라서
        System.out.println(Stream.builder().add(11).add(22.22).add("yang").build().toList());

        //제네릭선언을 이용해서 add하는 타입을 제한할 수 있다. <Object>는 생략가능
        System.out.println(Stream.<Object>builder().add(11).add(22.22).add("yang").build().toList());
        System.out.println(Stream.<Integer>builder().add(11).add(22).add(33).build().toList());
        System.out.println(Stream.<String>builder().add("11").add("22.22").add("yang").build().toList());






    }//end main
}//end class
