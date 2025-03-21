package test06_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main02_map_max {

    /*
     * 입력받은(주어진) 문자열에서 가장 긴 단어 찾아서
     * 출력하는 프로그램을 작성하세요(스트림을 되도록 사용)
     *
     * 입력 예시 :
     *
     * hello java javascript
     *
     * 출력 예시 :
     * 
     * javascript
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "hello java javascript";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        System.out.println(str);
        String answer = "";
        String[] arr = str.split(" ");

        //가장 긴 단어 찾기
        answer = Arrays.asList(arr).stream().max(Comparator.comparing(String::length)).get();

        //가장 긴 단어의 길이를 알고 싶다면
        System.out.println(Arrays.asList(arr).stream().map(String::length).max(Integer::compare).get());

        return answer;
    }


}//end class