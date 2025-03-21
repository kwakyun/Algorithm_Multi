package test.stream;

import java.util.Arrays;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! \n");

        double[] ds = new double[]{1.1,2.2,3.3,4.4};

        //기본타입 배열의 경우는 리스트 컬렉션에 직업 할당할 수 없기 때문에
        //Arrays.stream() 메소드에 인자로 전달해서 사용가능하다.

        long count = Arrays.stream(ds).filter((x)->x >= 3.0).count();
        System.out.println("Total count: " + count);

        //Arrays.stream() 필터링 후 객체는 DoublePipeline$8 타입
        System.out.println(Arrays.stream(ds).filter((x)->x >= 3.0));

        //toArray()메소드로 재할당 가능
        ds = Arrays.stream(ds).filter((x)->x >= 3.0).toArray();
        System.out.println(Arrays.toString(ds));

        //리스트컬렉션에 할당하기 위해서는 boxed()메소드 + toList()를 이용해서 컬렉션 배열에 할당가능.
        List<Double> list = Arrays.stream(ds).filter((x)->x >= 3.0).boxed().toList();
        System.out.println(list);
        System.out.println();

        //int[], Integer[]을 생성해서 스트림필터링 후 위와같이 확인해보세요.
        int[] sus1 = {1,2,3,4,5};

        //3보다 작은 요소들만 출력하기.
        System.out.println(Arrays.stream(sus1).filter((x)-> x < 3).boxed().toList());

        Integer[] sus2 = {1,2,3,4,5};
        //3보다 작은 요소들만 출력하기.
        System.out.println(Arrays.asList(sus2).stream().filter((x)-> x < 3).toList());


    }//end main
}//end class
