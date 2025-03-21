package test03_math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04_pow_sum_binary {

    /*
     * 입력받은(주어진) 정수의 15제곱을 한 후 결과를 각각의 수의 합을 계산해서
     * 출력하는 프로그램을 작성하세요
     *
     * 2**15  = 32768 :  3+2+7+6+8+ = 26
     *
     * 입력 예시:
     *
     * 2
     *
     * 15
     *
     * 출력 예시: 바이너리텍스트로 출력
     *
     * 11010
     *
     **/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int power = Integer.parseInt(br.readLine());

        System.out.println(solution(input, power));


    }//end main

    private static long solution(int input, int power) {

        String str = String.valueOf(Math.pow(input, power)).replaceAll("\\D", "");
        String[] arr = str.split("");
        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

//        answer = Long.parseLong(Long.toBinaryString(answer));
        answer = Long.parseLong(Long.toString(answer, 2));


        return answer;
    }

    private static StringBuilder solution2(int input, int power) {
        //temp ->  계산과정의 bridge 역할
        long temp = String.valueOf(Math.pow(input, power))
                .replaceAll("\\D", "") // 숫자만 남김
                .chars() // 각 문자를 스트림으로 변환
                .map(Character::getNumericValue) // 문자 -> 숫자 변환
                .sum(); // 모든 숫자 더하기

        StringBuilder answer = new StringBuilder(); //answer -> binary 역할

        while(temp > 0) {
            answer.append(temp%2); //나머지 추가
            temp/=2; //몫 갱신
        }



        return answer.reverse();
    }

    private static StringBuilder solution3(int input, int power) {
        long result = (long) Math.pow(input, power);
        long temp = 0;
        char[] cs = String.valueOf(result).toCharArray();
//        System.out.println("'0' : "+(int)'0');
        for (int i = 0; i < cs.length; i++) {
            temp += cs[i] - '0'; //'0'==48
        }

        StringBuilder answer = new StringBuilder();
        while (temp > 0) {
            answer.append((temp & 1) == 1 ? "1" : "0"); // 비트 AND 연산 사용
            temp >>= 1; // num을 오른쪽으로 한 칸 이동 (2로 나누는 효과)
        }



        return answer.reverse();

    }

}//end class