package test03_math;

import java.util.Scanner;

public class Main01_pow {

    /*
     * 입력받은(주어진) 정수의 제곱을 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * 10
     *
     * 출력 예시 :
     *
     * 100
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int n = 10;

        System.out.println(solution(n));

    }//end main

    private static int solution(int n) {
        //System.out.println(n);
        int answer = (int)Math.pow(n,2);
        return answer;
    }


}//end class