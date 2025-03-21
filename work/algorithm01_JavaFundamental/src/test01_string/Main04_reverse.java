package test01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04_reverse {
    /**
     * 입력받은 (주어진) 문자열을 뒤집어서
     * 출력하는 프로그램을 작성하세요
     * abcdefg 인경우 gfedcba 가 출력됨.
     *
     * 입력예시:
     * abcdefg
     *
     * 출력예시:
     * gfedcba
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));




    }//end main

    private static String solution(String str) {


        String answer = new StringBuilder(str).reverse().toString();
        return answer;
    }

}
