package test02_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main03_sum3 {
    /**
     * 문자열 ("11:22:33")을 한번에 입력 받아서 (예:11+22+33=66)
     * 아래와 같이 출력되도록 작성하세요
     * 66
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));


    }//end main

    private static int solution(String input) {
        String[] arr = input.split(":");
        int answer = Arrays.stream(arr)
                .mapToInt(Integer::parseInt) // 문자열을 정수로 변환
                .sum(); // 합계 계산

        return answer;
    }

    private static int solution2(String input) {
        int answer = 0;
        String[] arr = input.split(":");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }


}//end class