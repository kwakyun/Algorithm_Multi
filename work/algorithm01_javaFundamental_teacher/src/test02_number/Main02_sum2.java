package test02_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main02_sum2 {

    // 3 : 입력갯수
    // 11 22 33 을 각각 입력받아서 (예:11+22+33=66)
    // 아래와 같이 출력되도록 작성하세요
    // 66
    // 4 : 입력개수
    // 11 22 33 44을 각각 입력받아서 (예:11+22+33+44=110)
    // 아래와 같이 출력되도록 작성하세요
    // 110

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        //int count = 4;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            list.add(sc.nextInt());
//        }
//        System.out.println(solution(list));
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution2(arr));

    }//end main

    private static int solution2(int[] arr) {
        //System.out.println(n);
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

//        int answer = Arrays.stream(arr).sum();
        return answer;
    }

    private static int solution(ArrayList<Integer> list) {
        //System.out.println(n);
//        int answer = 0;
//        for (int i = 0; i < list.size(); i++) {
//            answer += list.get(i);
//        }

        int answer = list.stream().mapToInt(x -> x).sum();
        return answer;
    }


}//end class