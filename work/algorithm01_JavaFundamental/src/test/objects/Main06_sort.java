package test.objects;

import java.util.*;

public class Main06_sort {
    public static void main(String[] args) {

        //1. 정수 정렬
        Integer[] arr = new Integer[]{6,7,8,9,3,1,2,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println();

        //2. 문자 정렬
        String[] arr2 = new String[]{"b11","22","c55","a66","77","33","44"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        //3. 객체 정렬
        Person p1 = new Person("kim1",33);
        Person p2 = new Person("kim2",22);
        Person p3 = new Person("kim3",11);
        List<Person> list = new ArrayList<>();
        list.add(p3);
        list.add(p1);
        list.add(p2);
        System.out.println(list);
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return o1.name.compareTo(o2.name);//name으로 순정렬
//                return o2.name.compareTo(o1.name);//name으로 역정렬
//                return o1.age - o2.age;//age로 순정렬
                return o2.age - o1.age;//age로 역정렬
            }
        });
        System.out.println(list);
        System.out.println();

        //4.문자열의 길이로 정렬
        List<String> list1 = Arrays.asList("javascript","css", "servlet", "spring");
        Collections.sort(list1);//영문알파벳 정렬
        System.out.println(list1);
        list1.sort(Comparator.comparingInt(String::length));//문자열의 길이로 정렬
        System.out.println(list1);

        //5.배열에서 가장 긴 문자열만 출력
        System.out.println(list1.get(list1.size()-1));

        //6.스트림을 이용하여 가장 긴 문자열 길이만 출력
        System.out.println(list1.stream().map(String::length).toList());//글자수로 매핍
        System.out.println(list1.stream().map(String::length).max(Integer::compare).get());//긴글자수 반환

        //7.스트림을 이용하여 가장 긴 문자열만  출력
        System.out.println(list1.stream().max(Comparator.comparing(String::length)).get());//긴문자열 반환


    }//end main
}//end class
