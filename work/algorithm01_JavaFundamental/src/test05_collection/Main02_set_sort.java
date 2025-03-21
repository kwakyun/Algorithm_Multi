package test05_collection;

import java.util.*;

public class Main02_set_sort {

    /*
     * 입력받은(주어진) 문자열에서 중복된 문자열 배제하여 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * Hello java java html java
     *
     * 출력 예시 : 출력순서는 상관없음.
     *
     * Hello html java
     *
     *
     */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "Hello java java html java";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        System.out.println(str);

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String answer = "";

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        answer = String.join(" ", set);

        //**추가 : 문자열로 오름차순 정렬이 되도록 구현하기.1
//        String[] arr2 = answer.split(" ");
//        Arrays.sort(arr2);
//        answer = String.join(" ", arr2);

        //**추가 : 문자열로 오름차순 정렬이 되도록 구현하기.2
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = String.join(" ", list);

        return answer;
    }


}//end class