package test01_string;

import java.io.IOException;
import java.util.Scanner;

public class Main01_length {
    /**
     * abcdefg 문자열을 입력받으면 문자열의 길이를 구해서
     * 아래와 같이 출력되도록 작성하세요
     * 7
     */
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(solution(a));


    }//end main

    private static String solution(String str){
        String answer = "" +  str.length();
        return answer;
    }

}
