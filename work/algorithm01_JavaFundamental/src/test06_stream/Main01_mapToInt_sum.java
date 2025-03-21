package test06_stream;

import java.util.Arrays;
import java.util.Scanner;

public class Main01_mapToInt_sum {

    /*
     * 입력받은(주어진) 문자열에서 합계 및
     * 출력하는 프로그램을 작성하세요(스트림을 되도록 사용)
     *
     * 입력 예시 :
     *
     * 11 22 33 44
     *
     * 출력 예시 :
     * 
     * 110 11-22-33-44
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "11 22 33 44";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        System.out.println(str);
        String answer = "";
        String[] arr = str.split(" ");

        //String[] >> int[]
        int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(sus).sum());
        System.out.println(Arrays.stream(arr).mapToInt(Integer::parseInt).sum());

        answer += Arrays.stream(sus).sum() +" ";

        //int[] >> String[]
        arr = Arrays.stream(sus).mapToObj(String::valueOf).toArray(String[]::new);
        answer += String.join("-", arr);

        return answer;
    }


}//end class