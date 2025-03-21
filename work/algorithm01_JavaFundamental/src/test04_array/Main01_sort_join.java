package test04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01_sort_join {
    /**
     * 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램을 작성하세요
     *
     * 입력 예시:
     *
     * 33 22 44 11 111
     *
     * 출력 예시:
     *
     * 11 22 33 44 111
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(solution2(str));
    }

    private static String solution(String str) {
        String[] arr = str.split(" "); // 문자열 배열 생성
        int[] numbers = Arrays.stream(arr)
                .mapToInt(Integer::parseInt) // ✅ 문자열을 int로 변환
                .sorted() // ✅ 정렬
                .toArray();

        return Arrays.toString(numbers); // 배열을 문자열로 변환하여 반환
    }

    private static String solution2(String str) {
        System.out.println(str);
        String[] arr= str.split(" ");
//        System.out.println(Arrays.toString(arr));

        Integer[] sus = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sus[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(sus);
//        System.out.println(Arrays.toString(sus));

        //다시 문자열 배열에 할당
        for (int i = 0; i < sus.length; i++) {
            arr[i] = sus[i].toString();
        }

        //배열의 내용을 띄어쓰기 구분자로 문자열로 바꾸기
        String answer = String.join(" ",arr);

        return answer;
    }
}//end class