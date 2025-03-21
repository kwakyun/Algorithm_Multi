package test03_math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01_pow {

    /*
    * 입력받은(주어진) 정수의 제곱을 출력하는 프로그램을 작성하세요
    *
    * 입력 예시:
    *
    * 10
    *
    * 출력 예시:
    *
    * 100
    *
    **/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int input = Integer.parseInt(br.readLine());

        System.out.println(solution(input));


    }//end main

    private static int solution(int input) {

        int answer = (int) Math.pow(input,2);
        return answer;
    }
}//end class