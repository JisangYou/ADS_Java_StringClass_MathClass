
public class AlgoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgoMain main = new AlgoMain();
		AlgoCountNumber algocount = new AlgoCountNumber();
		AlgoMath algomath = new AlgoMath();
		long result = main.sum(10);
		long result2 = main.sumOdd(10);
		long result3 = main.sumEven(7);
		int result4 = algocount.count(10000, 8);
		int[] result5 = algomath.lottoNumbers2();
		System.out.println("1~max까지 총합 : " + result);
		System.out.println("1~max까지 홀수 총합 : " + result2);
		System.out.println("1~max까지 짝수 총합 : " + result3);
		System.out.println("1부터 정수 m까지중에 정수 n이 몇개가 있는지의 카운트 값 : " + result4);
		for (int a : result5) {
			System.out.println("로또 번호 : " + a);
		}
	}

	public long sum(long max) {
		//
		// for (int i = 1; i < max; i++) {
		//
		// result = result+i;
		// }
		long result = 0;
		result = max * (max + 1) / 2; // 성능이 좋은
		return result;
	}

	public long sumOdd(long max) {// 홀수일때,
		
		//패턴으로 찾으면, 개수*2라는 것을 알 수있음.
		
		if (max % 2 == 1) //예외처리
			max = max + 1; // 7일때는 8이 나와도 상관없이 7부터 더하므로 상관없음.
		long count = max / 2; 
		return count * count;

	}

	public long sumEven(long max) {// 짝수일때,

		// 2+4=6, 2+4+6=12, 2+4+6+8=20....
				// 개수 n * n+1 = 결과 도출
		
		if (max % 2 == 1) //예외처리
			max = max - 1; // 9일때는 8부터 더해야하므로 -1
		long count = max / 2; //개수 
		return count * count + count; 

	}
}