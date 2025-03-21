package test03_math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02_pow2 {

    /*
    * 입력받은(주어진) 정수의 15제곱을 출력하는 프로그램을 작성하세요
    *
    * 입력 예시:
    *
    * 2
    *
    * 15
    *
    * 출력 예시:
    *
    * 32768
    *
    **/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int input = Integer.parseInt(br.readLine());
       int power = Integer.parseInt(br.readLine());

        System.out.println(solution(input,power));


    }//end main

    private static long solution(long input, long power) {

        long answer = (long) Math.pow(input,power);
        return answer;
    }
}//end class