package chap05;

import java.io.IOException;

public class EvenFibonacciSum {

    public static void main(String[] args) throws IOException {

        int limit = 4000000; // 최대값 설정
        int a = 1; // 첫 번째 피보나치 항
        int b = 2; // 두 번째 피보나치 항
        int sum = 0; // 짝수 항 합계 초기화

        while (b <= limit) {
            if (b % 2 == 0) { // 짝수인지 확인
                sum += b;
            }
            // 다음 피보나치 항 계산
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("4백만 이하의 짝수 피보나치 수의 합: " + sum);



    }//end main


}
