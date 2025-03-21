package test02_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main02_sum2 {
    /**
     * 3 :  입력갯수
     * 11 22 33을 각각 입력받아서 (예:11+22+33=66)
     * 아래와 같이 출력되도록 작성하세요
     * 66
     * 4 : 입력개수
     * 11 22 33 44 을 각각 입력받아서 (예:11+22+33+44 = 110)
     * 아래와 같이 출력되도록 작성하세요
     * 110
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input_num = Integer.parseInt(br.readLine());
        int[] arr = new int[input_num];

        for (int i = 0; i < input_num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution(arr));





    }//end main

    private static int solution(int[] arr ) {

        int answer = Arrays.stream(arr).sum();

        return answer;
    }
    private static int solution2(int[] arr) {

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}//end class