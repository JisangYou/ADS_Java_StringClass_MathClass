/**
 * �Է°��� ���� m,���ڸ� �� ���� ���� n�� �޾�����
 * 
 * 1���� ���� m�����߿� ���� n�� ��� �ִ��� ī��Ʈ �ϼ���.
 * 
 * ��) �Է°� m = 10000, n =8
 * 
 * 1���� 10000���̿� 8�̶�� ���ڰ� ��� �ִ��� ī��Ʈ�ϴµ� 8888�� ��� 4�� ī��Ʈ�˴ϴ�.
 * 
 * @author Jisang
 *
 */
public class AlgoCountNumber {

	public int count(int limit, int target) {
		int result = 0;

		String strTarget = target + "";

		for (int i = 0; i < limit; i++) {

			String temp = i + "";
			String[] splitNum = temp.split("");

			for (int j = 0; j < splitNum.length; j++) {
				if (splitNum[j].equals(strTarget)) {
					result++;
				}
			}
		}
		return result;
	}

	public int count2(int limit2, int target2) {// ���� ����.
		int result = 0;

		String strtarget = target2 + ""; // ���ڷ� ����ȯ�ϱ� ���� ""

		for (int i = 0; i < limit2; i++) {

			String temp = i + ""; //for���� ���鼭 �־����� ���ڸ� ���ڷ� ����ȯ
			String[] splitNum = temp.split(""); //����ȯ�� ���ڸ� �迭�� ����.
			
			for(int j =0; j<splitNum.length; j++){ // ����ȯ�� �迭 ũ�⸸ŭ for���� ��
				if(splitNum[j].equals(strtarget)){ // ���ǹ��� �ְ�, �־��� ���ڰ��� ���� ���� ����ִ� �迭�� �������� ������� �ö�.
					result++;
				}
			}
		}
		
		return result;

	}

}
