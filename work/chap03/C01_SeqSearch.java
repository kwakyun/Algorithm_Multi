package chap03;
// 선형검색
// 반복문안에 분기문 2개
import java.util.Scanner;

class C01_SeqSearch {
	// --- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색 ---//
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)
				return -1; // 검색 실패(-1을 반환)
			if (a[i] == key)
				return i; // 검색 성공(인덱스를 반환)
			i++;
		}
	}
	//요소를 순서대로 검색하는 선형 검색은 요소가 
	// 정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법이다.
//    요솟수: 7
//    x[0]: 6
//    x[1]: 4
//    x[2]: 3
//    x[3]: 2
//    x[4]: 1
//    x[5]: 2
//    x[6]: 8
//    검색할 값: 2
//    검색 값은 x[3]에 있습니다.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
//		int num = stdIn.nextInt();
//		int[] x = new int[num]; // 요솟수가 num인 배열
//
//		for (int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = stdIn.nextInt();
//		}
//
//		System.out.print("검색할 값: "); // 키값을 입력받음
//		int ky = stdIn.nextInt();
		
		int num = 7;  //요소의 개수
		int[] x = new int[] {6,4,3,2,1,2,8};
		int ky = 2;  //찾아야하는 키값

		int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
	}
}