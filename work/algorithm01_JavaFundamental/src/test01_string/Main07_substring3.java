package test01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07_substring3 {
    /**
     * 입력받은 (주어진) 문자열의 알파벳 한개(처음 받은 값)에서 부터 끝까지를
     * 출력하는 프로그램을 작성하세요
     * abcdefg 인경우 cdefg 가 출력됨.
     *
     * 첫줄의 문자는 1개의 알파벳, 2번째줄에는 여러 문자열을 입력받는다.
     *
     * 입력예시:
     *
     * c
     *
     * abc def gccc ddd
     * 출력예시:
     *
     * c abc def gccc ddd
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1,str2));



    }//end main

    private static String solution(String str1, String str2) {

        String answer = str2.substring(str2.indexOf(str1));
        return answer;
    }

}
