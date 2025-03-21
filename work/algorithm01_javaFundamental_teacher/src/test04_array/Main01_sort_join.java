package test04_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main01_sort_join {

    /*
     * 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * 33 22 44 11 111
     *
     * 출력 예시 :
     *
     * 11 22 33 44 111
     *
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "33 22 44 11 111";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        System.out.println(str);
        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);//문자열에대한 정렬이된다.[11, 111, 22, 33, 44]
//        System.out.println(Arrays.toString(arr));

        Integer[] sus = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sus[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(sus);
        //System.out.println(Arrays.toString(sus));

        //다시 문자열배열에 할당
        for (int i = 0; i < sus.length; i++) {
            arr[i] = sus[i].toString();
        }
        //배열의 내용을 띄어쓰기 구분자로 문자열로 바꾸기
        String answer = String.join(" ",arr);

        return answer;
    }


}//end class