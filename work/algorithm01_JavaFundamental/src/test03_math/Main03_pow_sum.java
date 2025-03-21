package test03_math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03_pow_sum {

    /*
    * 입력받은(주어진) 정수의 15제곱을 한 후 결과를 각각의 수의 합을 계산해서
    * 출력하는 프로그램을 작성하세요
    *
    * 2**15  = 32768 :  3+2+7+6+8+ = 26
    *
    * 입력 예시:
    *
    * 2
    *
    * 15
    *
    * 출력 예시:
    *
    * 26
    *
    **/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int input = Integer.parseInt(br.readLine());
       int power = Integer.parseInt(br.readLine());

        System.out.println(solution3(input,power));


    }//end main

    private static long solution(int input,int power) {

        String str = String.valueOf(Math.pow(input,power)).replaceAll("\\D", "") ;
        String[] arr = str.split("");
        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
    private static long solution2(int input, int power) {
        return String.valueOf(Math.pow(input, power))
                .replaceAll("\\D", "") // 숫자만 남김
                .chars() // 각 문자를 스트림으로 변환
                .map(Character::getNumericValue) // 문자 -> 숫자 변환
                .sum(); // 모든 숫자 더하기
    }

    private static long solution3(int input, int power) {
        long result = (long) Math.pow(input, power);
        long answer = 0;
        char[] cs = String.valueOf(result).toCharArray();
//        System.out.println("'0' : "+(int)'0');
        for (int i = 0; i < cs.length; i++) {
            answer += cs[i] - '0'; //'0'==48
        }
        return answer;
    }

}//end class