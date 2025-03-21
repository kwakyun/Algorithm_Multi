package test01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main02_max_length {
    /**
     * java jsp Servlet javascript 문자열을 배열에 입력받고
     * 이중에서 가장 긴 문자열의 길이를
     * 아래와 같이 출력되도록 작성하세요
     * 10
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");

        System.out.println(solution(arr));


    }//end main

    private static String solution(String[] arr) {
//        System.out.println(Arrays.toString(arr));

        String answer = "" + Arrays.asList(arr).stream().map(String::length).max(Integer::compare).get();

        return answer;
    }

}
