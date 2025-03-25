import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_Solution_3 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();

        while (progresses.length > 0) {
            // 하루 동안 작업 진행
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            // 완료된 작업 수 세기
            int count = 0;
            while (progresses.length > 0 && progresses[0] >= 100) {
                count++;
                progresses = removeFirstElement(progresses);
                speeds = removeFirstElement(speeds);
            }

            if (count > 0) {
                answerList.add(count);
            }
        }

        // List를 배열로 변환하여 반환
        return answerList.stream().mapToInt(i -> i).toArray();
    }

    // 배열의 첫 번째 요소를 제거하는 메서드
    private static int[] removeFirstElement(int[] array) {
        return Arrays.copyOfRange(array, 1, array.length);
    }
}
