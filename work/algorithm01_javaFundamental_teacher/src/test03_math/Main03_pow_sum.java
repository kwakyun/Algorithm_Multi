package test03_math;

import java.util.Scanner;

public class Main03_pow_sum {

    /*
     * 입력받은(주어진) 정수의 15제곱을 한후 결과를 각각의 수의 합을 계산해서
     *  출력하는 프로그램을 작성하세요
     * 2**15 = 32768 : 3+2+7+6+8 = 26
     * 입력 예시 :
     *
     * 2
     *
     * 15
     *
     * 출력 예시 :
     *
     * 26
     *
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
        int n1 = 2;
        int n2 = 15;

        System.out.println(solution(n1,n2));

    }//end main

    private static long solution(int n1,int n2) {
        //System.out.println(n);//32768
        long result = (long)Math.pow(n1,n2);
        long answer = 0;
        //1.split() 사용
//        String[] str = String.valueOf(result).split("");
//        for (int i = 0; i < str.length; i++) {
//            //System.out.println(str[i]);
//            answer += Integer.parseInt(str[i]);
//        }
        //2.toCharArray() 사용
        char[] cs = String.valueOf(result).toCharArray();
        //System.out.println("'0' : "+(int)'0');//'0'==48
        for (int i = 0; i < cs.length; i++) {
            answer += cs[i] - '0';
        }
        return answer;

    }


}//end class