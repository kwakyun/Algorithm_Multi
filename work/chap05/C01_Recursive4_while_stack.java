package chap05;

import java.util.Scanner;

class C01_Recursive4_while_stack {
    //--- 재귀를 제거한 recur Stack---//
    static void recur(int n) {
        C01_Recursive4IntStack s = new C01_Recursive4IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);                  // n 값을 푸시
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {    // 스택이 비어 있지 않으면
                n = s.pop();              // 저장하고 있던 값을 n에 팝
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
//        int x = stdIn.nextInt();
        int x = 4;

        recur(x);
        System.out.println("end main...");
    }
}
