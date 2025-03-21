package test.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class Main08 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        //미션 :  문자열 >>> java:spring:html:css
        //주어진 문자열을 이용해서 's'가 들어있는 문자열만 배열에 할당하고 출력하기
        //스트림 사용할 것.


//        String s = "java:spring:html:css";
//        내가 짠 코드
//        String[] result = Arrays.stream(s.split(":"))
//                .filter(x -> x.contains("s"))
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(result));

        String str = "java:spring:html:css";
        String[] arr = str.split(":");
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        System.out.println(list.stream().filter(x -> x.contains("s")).toList());
        System.out.println(Arrays.asList(str.split(":")).stream().filter(x -> x.contains("s")).toList());
        System.out.println();


        //패턴객체를 이용해서 스트림처리 가능
        String[] arr2 = Pattern.compile(":").split(str);
        System.out.println(Arrays.asList(arr2));
        System.out.println(Pattern.compile(":").splitAsStream(str).filter((x)->x.contains("s")).toList());


        //6. 스트림을 이용하여 가장 긴 문자열의 길이만 출력
        List<String> list1 = Arrays.asList("javascript","css","servlet","spring");
        System.out.println(list1.stream().map(String::length).toList()); //글자수로 매핑
        System.out.println(list1.stream().map(String::length).max(Integer::compare).get()); //글자수로 매핑


        //7. 스트림을 이용하여 가장 긴 문자열만 출력
        System.out.println(list1.stream().max(Comparator.comparing(String::length)).get()); //긴문자열 반환

    }//end main
}//end class
