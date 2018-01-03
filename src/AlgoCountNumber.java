/**
 * 입력값을 정수 m,한자리 수 정수 으로 n을 받았을때
 * 
 * 1부터 정수 m까지중에 정수 n이 몇개가 있는지 카운트 하세요.
 * 
 * 예) 입력값 m = 10000, n =8
 * 
 * 1부터 10000사이에 8이라는 숫자가 몇개가 있는지 카운트하는데 8888의 경우 4로 카운트됩니다.
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

	public int count2(int limit2, int target2) {// 예제 연습.
		int result = 0;

		String strtarget = target2 + ""; // 문자로 형변환하기 위해 ""

		for (int i = 0; i < limit2; i++) {

			String temp = i + ""; //for문을 돌면서 주어지는 숫자를 문자로 형변환
			String[] splitNum = temp.split(""); //형변환된 문자를 배열에 넣음.
			
			for(int j =0; j<splitNum.length; j++){ // 형변환된 배열 크기만큼 for문을 돔
				if(splitNum[j].equals(strtarget)){ // 조건문을 주고, 주어진 인자값과 같은 값이 들어있는 배열이 있을때만 결과값이 올라감.
					result++;
				}
			}
		}
		
		return result;

	}

}
