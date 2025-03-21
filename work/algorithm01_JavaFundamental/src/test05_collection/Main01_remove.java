package test05_collection;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main01_remove {

    /*
     * 입력받은(주어진) 문자열에서 끝에서 3단어를 제거하여 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * Hello world java html css
     *
     * 출력 예시 :
     *
     * Hello world
     *
     * aa bb cc dd ee ff
     * aa bb cc
     */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "Hello world java html css";

        System.out.println(solution(str));

    }//end main

    private static String solution(String str) {
        System.out.println(str);

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String answer = "";

        //1.일반배열로 구현하기
//        String[] temp = new String[arr.length-3];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(temp));
//        answer = String.join(" ",temp);

        //2.컬렉션배열로 구현하기
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        for (int i = arr.length-1; i >= arr.length-3; i--) {
//            list.remove(i);
//        }
//        answer = String.join(" ", list);

        //3.Stack 으로 구현
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < arr.length-3; i++) {
            stack.push(arr[i]);
        }
        answer = String.join(" ", stack);

        return answer;
    }


}//end class