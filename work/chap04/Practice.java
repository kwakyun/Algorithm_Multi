package chap04;

import javax.security.auth.x500.X500Principal;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        C01_IntStack s = new C01_IntStack(5);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프 (5)클리어 (6)데이터검색　(0)종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.println("데이터: ");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    } catch(C01_IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                    case 2: //팝
                        try{
                            x = s.pop();
                            System.out.println("팝한 데이터는 " + x + "입니다.");
                        }catch(C01_IntStack.EmptyIntStackException e){
                            System.out.println("스택이 비어있습니다.");
                        }
                        break;

                    case 3: //피크
                        try {
                            x = s.peek();
                            System.out.println("피크한 데이터는 " + x + "입니다.");
                        }catch (C01_IntStack.EmptyIntStackException e){
                            System.out.println("스택이 비어있습니다.");
                        }
                        break;

                   case 4: //덤프
                        s.dump();
                        break;

                   case 5: //clear
                        s.clear();
                        break;

                   case 6: // indexOf(???)
                       System.out.println("검색 데이터: ");
                       x = stdIn.nextInt();
                       int idx = s.indexOf(x);
                       System.out.println("검색결과:" + idx);
                       break;


            }//end switch

        }
    }
}
