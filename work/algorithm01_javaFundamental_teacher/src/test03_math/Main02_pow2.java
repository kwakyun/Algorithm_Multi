package test03_math;

import java.util.Scanner;

public class Main02_pow2 {

    /*
     * 입력받은(주어진) 정수의 15제곱을 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * 2
     *
     * 15
     *
     * 출력 예시 :
     *
     * 32768
     *
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        int n1 = 2;
//        int n2 = 15;

        System.out.println(solution(n1,n2));

    }//end main

    private static long solution(int n1,int n2) {
        //System.out.println(n);
        long answer = (long)Math.pow(n1,n2);
        return answer;
    }


}//end class