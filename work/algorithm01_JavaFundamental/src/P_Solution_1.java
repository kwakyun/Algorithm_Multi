import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class P_Solution_1 {
    public static void main(String[] args) {
        String[] players = new String[50000];
        players[0] = "mumu";
        players[1] = "soe";
        players[2] = "poe";
        players[3] = "kai";
        players[4] = "mine";


        String[] callings = new String[1000000];
        callings[0] = "kai";
        callings[1] = "kai";
        callings[2] = "mine";
        callings[3] = "mine";
// 나머지 요소는 기본값 null로 유지됩니다.


        System.out.println(Arrays.toString(solution(players, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        // 순서를 변경할 players 배열을 복사하여 사용
        for (String calling : callings) {
            int index = IntStream.range(0, players.length)
                    .filter(i -> players[i].equals(calling))
                    .findFirst()
                    .orElse(-1); // 호출된 플레이어의 인덱스 찾기

            if (index > 0) { // 해당 플레이어가 첫 번째가 아니라면
                swap(players, index, index - 1); // 호출된 플레이어와 바로 앞의 플레이어를 교환
            }
        }
        return players;
    }

    public static void swap(String[] players, int i, int j) {
        String temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }
}
