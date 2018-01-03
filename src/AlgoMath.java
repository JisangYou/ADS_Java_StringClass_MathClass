import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * �ζǹ�ȣ �����⸦ �����ϼ���.
 * 
 * @author Jisang
 *
 */

public class AlgoMath {

	public int[] getLottoNumber() {

		int[] result = new int[6];
		Random random = new Random();

		for (int index = 0; index < result.length; index++) {
			// random �Լ����� �߻��Ǵ� ������ �ߺ��� �� �ִ�.
			// �Ʒ��������� ������� ó���� 33�� ������ ���
			// �� ��° ���̽������� 33�� ���� �� �ִ�.
			result[index] = random.nextInt(45) + 1;
			// �ߺ��忡 ���� ����ó��
			for (int j = 0; j < index; j++) {
				if (result[index] == result[j]) {
					index--;
					break;
				}
			}
		}

		return result;
	}

	public int[] lottoNumbers2() {
		int[] result = new int[6];

		Random random = new Random();
		int temp = 0;
		int cnt = 0;
		for (int i = 0; i < result.length; i++) {
			temp = random.nextInt(45) + 1;
			if (cnt > 0) {
				for (int item : result) {
					while (item == temp) {
						temp = random.nextInt(45) + 1;
					}
				}
			}
			result[cnt] = temp;
			cnt++;
		}
		return result;
	}

	public ArrayList<Integer> getLottoNumber3() {
		ArrayList<Integer> result = new ArrayList(); // ���׸� <>��
		Set<Integer> treeSet = new TreeSet<>();

		Random random = new Random();

		// ���� �迭 = ũ�⸦ �������� �ʴ� ��ü �迭
		// ���� : List, set, map
		// List = �ε��� ���� �������ִ� �迭
		// Set = ����Ʈ�� �����ѵ� �ߺ����� �Էµ��� �ʴ´�.
		// Map = Ű�� ���� ������ �ִ� ���� �迭, ���� �ߺ��� ���ȴ�.
		// Map map = new HashMap();
		// map.put("Ű",33);

		for (/* ���۰� */; 6 > treeSet
				.size(); /* ������ �� ��� �������� �� �� ����, ������ �Ƚᵵ �ȴ�. */) {
			treeSet.add(random.nextInt(45) + 1);
		}
		Iterator<Integer> iterator = treeSet.iterator(); //
		while (iterator.hasNext()) {
			result.add(iterator.next());
		}
		return result;
	}

	/**
	 * �Ƴ��׷� �˰���
	 * 
	 * �ΰ��� ���ڿ� �Է��� �޾Ƽ� �ΰ��� ���谡 �Ƴ��׷��������� Ȯ���ϴ� ���α׷��� �����ϼ���
	 * 
	 * option. ���� ���ڿ��� �������� 1. ���� ���ڿ��� ���̸� üũ -> ���̰� �ٸ��� �˻����� �ʴ´�. 2. ���� ���ڿ��� ����
	 * 3. ���ĵ� ���ڿ��� ��
	 * 
	 * cat -> act
	 * 
	 * listen -> silent dormitory -> dirty room the country side -> no city dust
	 * here
	 * 
	 */

	public boolean checkAnagram(String a, String b) {
		boolean result = false;
		// ��ҹ��� ó��
		a = a.toLowerCase();
		b = b.toLowerCase();

		// option : �������� �� ���ڿ� �ɰ���
		a = a.replace(" ", "");
		b = b.replace(" ", "");

		// ���� ��
		if (a.length() != b.length()) {
			return false;
		}

		// ������ �ϱ����ؼ� char �迭�� ����
		char aTemp[] = a.toCharArray();
		char bTemp[] = b.toCharArray();

		// ĳ���� �迭����
		Arrays.sort(aTemp);
		Arrays.sort(bTemp);

		return Arrays.equals(aTemp, bTemp);
	}

	public void testMath() {
		// ���밪 ���ϱ�
		int a = Math.abs(-123);// static���� ����Ǿ��ִ� ��� Math math = new Math();�� �ȵ�
		// �ݿø�
		long b = Math.round(123.5);
		// �ø�
		double c = Math.ceil(343.1543);
		// ����
		double d = Math.floor(563.8);

		System.out.println("���밪" + a + b + c + d);

		Math.random(); // 0���� ũ�ų� ���� 1���� ���� �Ǽ��� ����

		Random random = new Random();
		// 1���� 100������ ������ ���� ��������

		random.nextInt(100); // ->0~99 ������ ������ ����
		int r = random.nextInt(100) + 1;

	}

}
