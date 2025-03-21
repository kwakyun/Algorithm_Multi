package test05_collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;



public class Main_str {
    /*
    입력받은 (주어진) 문자열에서 끝에서 3단어를 제거하여 출력하는 프로그램을 작성하세요

    입력 예시 :

    Hello world java html css

    출력 예시:

    Hello world

    aa bb cc dd ee ff
    aa bb cc

    * **/


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));


    }//end main

    private static String solution(String str) {
        String[] arr = str.split(" ");

        String answer = "";

        for (int i = 0; i < arr.length-3; i++) {
            answer += arr[i] + " ";
        }

        return answer;
    }


    private static String solution2(String str) {
        for (int i = 0; i < 3; i++) { // 3번 반복하여 끝에서 3단어 제거
            int endIndex = str.lastIndexOf(" ");
            if (endIndex == -1) return ""; // 공백이 없으면 그대로 반환
            str = str.substring(0, endIndex); // 마지막 단어 제거
        }
        String answer = str;
        return answer;
    }


}//end class