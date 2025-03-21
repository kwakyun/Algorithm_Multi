package test01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_substring2 {
    /**
     * 입력받은 (주어진) 문자열의 3번째부터 5번째까지를 뽑아서
     * 출력하는 프로그램을 작성하세요
     * abcdefg 인경우 def 가 출력됨.
     *
     * 문자열은 0번째부터 시작됨
     *
     * 입력예시:
     * abcdefg
     *
     * 출력예시:
     * def
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));




    }//end main

    private static String solution(String str) {

        String answer = str.substring(3,5+1);
        return answer;
    }

}
