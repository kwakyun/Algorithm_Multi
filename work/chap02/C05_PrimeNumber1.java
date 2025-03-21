package chap02;

import java.util.ArrayList;
import java.util.List;

public class C05_PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;
        List<Integer> list = new ArrayList<>();

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) { // 소수가 아님을 확인하면 바로 반복문 종료
                    break;
                }
            }
            if (n == i) { // 마지막까지 나누어 떨어지지 않으면 소수임
                System.out.println(n);
                list.add(n);
            }
        }

        System.out.println("list.size() = " + list.size()); // 소수의 개수
        System.out.println(list.stream().mapToInt(x -> x).sum()); // 소수의 합

        System.out.println("나눗셈을 수행한 횟수 : " + counter);

    } // end main
} // end class
