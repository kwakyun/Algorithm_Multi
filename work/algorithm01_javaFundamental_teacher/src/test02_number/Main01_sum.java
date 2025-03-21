package test02_number;

import java.util.Scanner;

public class Main01_sum {

    // 11 22 33 을 각각 입력받아서 (예:11+22+33=66)
    // 아래와 같이 출력되도록 작성하세요
    // 66

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
//        int n1 = 11;
//        int n2 = 22;
//        int n3 = 33;

        System.out.println(solution(n1,n2,n3));

    }//end main

    private static int solution(int n1, int n2, int n3) {
        //System.out.println(n);
        int answer = n1 + n2 + n3;
        return answer;
    }


}//end class