package test01_string;

import java.util.Arrays;
import java.util.Scanner;

public class Main02_max_length {

    /**
     * java jsp Servlet javascript 문자열을 배열에 입력받고
     * 이중에서 가장 긴문자열의 길이를
     * 아래와 같이 출력되도록 작성하세요
     * 10
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        //String str = "java jsp Servlet javascript";
        String[] arr = str.split(" ");

        System.out.println(solution(arr));

    }//end main

    private static String solution(String[] arr) {
        //System.out.println(Arrays.toString(arr));

        String answer = ""+Arrays.asList(arr).stream().map(String::length).max(Integer::compare).get();
        return answer;
    }


}//end class