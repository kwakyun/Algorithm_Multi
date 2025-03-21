package test.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        //자바 스트림이란? : jdk8에 추가된 객체,함수형 프로그래밍을 지향
        //제어문 또는 검색쿼리문 기능을 함수로 대체해서 표현하는것이 가능한 문법을 내포한다.
        //컬렉션과 배열등의 요소들을 참조하여 람다식을 적용할 수 있다.
        //반복수행하는 기능구현이 뛰어나다.

        //예:List내에 있는 임의의 문자열 중에서 a라는 문자가 들어있는 요소들은 몇개(카운팅)?
        List<String> list = Arrays.asList("Helloa", "Worlda","java","css","spring");
        System.out.println(list);

        //1.일반적인 방법으로 카운팅
        int count = 0;
        for (String x : list) {
            System.out.println(x);
            if(x.contains("a")){
                count++;
            }
        }
        System.out.println("Total count: " + count);


        //2.스트림으로 카운팅
        long count2 = list.stream().filter((x)->x.contains("a")).count();
        System.out.println("Total count2: " + count2);

        list = Arrays.asList("aHello", "Worlda","java","acss","springa");
        //a로 시작하는 문자열들의 카운팅.
        count2 = list.stream().filter((x)->x.startsWith("a")).count();
        System.out.println("Total count2: " + count2);

        //a로 끝나는 문자열들의 카운팅.
        count2 = list.stream().filter((x)->x.endsWith("a")).count();
        System.out.println("Total count2: " + count2);

        //3.스트림필터링 결과를 다시 컬렉션으로 반환가능 : ReferencePipeline$2 type
        System.out.println(list.stream().filter((x)->x.endsWith("a")));
        System.out.println();

        Object[] arr = list.stream().filter((x)->x.endsWith("a")).toArray();
        System.out.println(Arrays.toString(arr));

        List<String> list2 = list.stream().filter((x)->x.endsWith("a")).toList();
        System.out.println(list2);

        //참고>별도의 스레드처리가 필요하거나 요소의 개수가 엄~~청 많을때 사용하는 스트림
        count2 = list.parallelStream().filter((x)->x.endsWith("a")).count();
        System.out.println("Total count2: " + count2);

    }//end main
}//end class