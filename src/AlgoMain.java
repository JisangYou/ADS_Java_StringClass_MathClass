
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
		System.out.println("1~max���� ���� : " + result);
		System.out.println("1~max���� Ȧ�� ���� : " + result2);
		System.out.println("1~max���� ¦�� ���� : " + result3);
		System.out.println("1���� ���� m�����߿� ���� n�� ��� �ִ����� ī��Ʈ �� : " + result4);
		for (int a : result5) {
			System.out.println("�ζ� ��ȣ : " + a);
		}
	}

	public long sum(long max) {
		//
		// for (int i = 1; i < max; i++) {
		//
		// result = result+i;
		// }
		long result = 0;
		result = max * (max + 1) / 2; // ������ ����
		return result;
	}

	public long sumOdd(long max) {// Ȧ���϶�,
		
		//�������� ã����, ����*2��� ���� �� ������.
		
		if (max % 2 == 1) //����ó��
			max = max + 1; // 7�϶��� 8�� ���͵� ������� 7���� ���ϹǷ� �������.
		long count = max / 2; 
		return count * count;

	}

	public long sumEven(long max) {// ¦���϶�,

		// 2+4=6, 2+4+6=12, 2+4+6+8=20....
				// ���� n * n+1 = ��� ����
		
		if (max % 2 == 1) //����ó��
			max = max - 1; // 9�϶��� 8���� ���ؾ��ϹǷ� -1
		long count = max / 2; //���� 
		return count * count + count; 

	}
}