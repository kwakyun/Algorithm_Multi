import java.util.Stack;

public class P_Solution_2 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // moves[i]는 열 번호이므로 -1을 해서 배열 인덱스에 맞춤
                if (board[j][moves[i] - 1] != 0) {
                    int currentItem = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0; // 해당 위치를 빈 공간으로 설정

                    // 스택이 비어있는지 확인
                    if (!stack.isEmpty() && stack.peek() == currentItem) {
                        stack.pop(); // 같은 아이템 제거
                        answer += 2; // 터진 인형 개수 추가
                    } else {
                        stack.push(currentItem); // 다른 아이템은 스택에 추가
                    }
                    break; // 해당 열에서 작업 완료 후 다음 move로 이동
                }
            }
        }

        return answer;
    }
}
