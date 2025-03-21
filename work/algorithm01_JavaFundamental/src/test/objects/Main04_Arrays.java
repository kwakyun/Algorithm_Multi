package test.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main04_Arrays {
    public static void main(String[] args) {

        //1.정렬 - 오름차순 모든타입
        int[] arr = new int[]{11,2,33,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//오름차순(기본)
        System.out.println(Arrays.toString(arr));

        //2.정렬 - 내림차순 Integer[]와 같은 객체타입만 가능
        Integer[] arr2 = new Integer[]{11,2,33,4};
        Arrays.sort(arr2, Collections.reverseOrder());//내림차순 : int[]는 안됨.
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        //3.배열복사(주소가다르다) - 배열 재할당(주소가같다)과는 다르다.
        int[] copy0 = arr;
        int[] copy1 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr);
        System.out.println(copy0);
        System.out.println(copy1);
        System.out.println(Arrays.toString(copy1));//[2, 4, 11, 33]

        //4.배열 부분(범위)복사
        int[] copy2 = Arrays.copyOfRange(arr, 0,2);//인텍스0~1
        System.out.println(Arrays.toString(copy2));//[2, 4]
        System.out.println();

        //5.배열초기화 및 채우기
        int[] arr3 = new int[5];
        System.out.println(Arrays.toString(arr3));//[0, 0, 0, 0, 0]
        Arrays.fill(arr3, 5);//모두 5로 채우기
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        //6.배열(랩퍼클래스,문자열)을 리스트 컬렉션으로 변환 : int[]불가,Integer[]가능
        //List<Integer> list = Arrays.asList(1,2,3,4,5);//수정불가
        Integer[] arr4 = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr4);//수정불가
        System.out.println(list);

//        List<String> list2 = Arrays.asList("a","b","c","d","e","f");//수정불가
        String[] strs = new String[]{"a","b","c","d","e","f"};
        List<String> list2 = Arrays.asList(strs);//수정불가
        System.out.println(list2);

        //7.수정불가 리스트컬렉션을 수정가능 리스트컬렉션으로 변환
        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        //list3.remove(0);//에러
        System.out.println(list3);
        List<Integer> list4 = new ArrayList<>(list3);//수정가능
        list4.remove(0);
        System.out.println(list4);


        //8.정수 배열의 통계(합계,최소,최대,평균,카운트)
        int[] arr5 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.stream(arr5).count());
        System.out.println(Arrays.stream(arr5).min().getAsInt());
        System.out.println(Arrays.stream(arr5).max().getAsInt());
        System.out.println(Arrays.stream(arr5).sum());
        System.out.println(Arrays.stream(arr5).average().getAsDouble());
        System.out.println(Arrays.stream(arr5).average().orElse(0));

    }//end main
}//end class
