package test02_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03_sum3 {

    // 문자열("11:22:33") 을 한번에 입력받아서 (예:11+22+33=66)
    // 아래와 같이 출력되도록 작성하세요
    // 66

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
//        String str = "11:22:33";
        System.out.println(solution(str));

    }//end main

    private static int solution(String str) {
        //System.out.println(n);
        int answer = 0;
        String[] strArr = str.split(":");
        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }

        return answer;
    }

}//end class