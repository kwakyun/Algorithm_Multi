package test01_string;

import java.util.Scanner;

public class Main04_reverse {

    /**
     * 입력받은(주어진) 문자열을 뒤집어서
     * 출력하는 프로그램을 작성하세요
     * abdcefg 인경우 gfecdba 가 출력됨.
     *
     * 입력예지:
     * abdcefg
     *
     * 출력예시:
     * gfecdba
     *
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
//        String str = "abdcefg";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        //System.out.println(str);

        String answer = "";

//        for (int i = str.length()-1; i >= 0; i--) {
//            answer += str.charAt(i);
//        }

//        char[] cs2 = str.toCharArray();
//        answer = "";
//        for (int i = cs2.length-1; i >= 0; i--) {
//            answer += cs2[i];
//        }

        answer = new StringBuilder(str).reverse().toString();

        return answer;
    }


}//end class