package chap02;
// 1,000 이하의 소수를 나열(버전 3）

class C05_PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0; // 1.곱셈과 나눗셈의 횟수
		int ptr = 0; // 2.찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2; // 2는 소수입니다
		prime[ptr++] = 3; // 3은 소수입니다
		//System.out.println(prime[0]);
		//System.out.println(prime[1]);
		for (int n = 5; n <= 1000; n += 2) { // 조사 대상은 홀수만
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) { // 나누어떨어지면 소수가 아님
					flag = true;
					break; // 더 이상 반복은 불필요
				}
			}
			if (!flag) { // 마지막까지 나누어떨어지지 않음
				prime[ptr++] = n; // 소수로 배열에 저장
				counter++;
			}
		}

		for (int i = 0; i < ptr; i++) // 찾은 ptr개의 소수를 출력
			System.out.println(prime[i]);

		System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
	}
}