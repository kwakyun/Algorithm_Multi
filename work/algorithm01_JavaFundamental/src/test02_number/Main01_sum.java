package test02_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main01_sum {
    /**
     * 11 22 33 을 각각 입력받아서 (예:11+22+33=66)
     * 아래와 같이 출력되도록 작성하세요
     * 66
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(arr));




    }//end main

    private static int solution(int[] arr ) {
//        System.out.println(n);
        int answer = Arrays.stream(arr).sum();
        return answer;
    }
}//end class