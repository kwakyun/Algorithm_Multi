package test.stream;

import java.util.Arrays;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! \n");

        Double[] ds = new Double[]{1.1,2.2,3.3,4.4};
        //스트림을 사용해서
        //ㄱ. 3이상인 요소들은 몇개?
        List<Double> list = Arrays.asList(ds);
        long count = list.stream().filter((x)->x>=3.0).count();
        System.out.println("Total count: " + count);
        list.stream().filter((x)->x >= 3.0).toList();
        System.out.println(list);
        System.out.println();

        //ㄴ. 각 요소에 10배를 했을때 20이상인 요소는 몇개?
        list = Arrays.asList(ds); // 다시 초기화
        count = list.stream().filter((x)->x * 10 >= 20).count();
        System.out.println("Total count: " + count);

        list = list.stream().filter((x)->x*10 >= 20).toList();
        System.out.println(list);


    }//end main
}//end class
