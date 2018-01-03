
public class StringApi {

	public void text() {

		String a = "String Test";

		// 길이
		System.out.println(a.length());

		// 위치검색
		System.out.println(a.indexOf("Test"));

		// 특정 구분자로 분해
		String temp[] = a.split("/");
		for (String item : temp) {
			System.out.println(item);

		}

		// 빈 문자열로 자르면 글자 하나 단위로 쪼개준다.
		String temp2[] = a.split("");

		// 문자열 자르기
		System.out.println(a.substring(2, 7));

		// 문자열 바꾸기
		System.out.println(a.replace("Te", "Px"));

		// 특정 문자열로 시작되는지를 검사
		a.startsWith("Str");

		String address = "never.com";
		if (!address.startsWith("http:")) {
			address = "http://" + address;
		}
	}

	public void builderVsBuffer() {

		// jdk 1.5버전 이상부터는 일반적인 스트링 연산을 StringBuilder로
		// 컴파일러가 자동변환 해준다.
		String result = "안" + "녕하" + "세요" + "! 반갑습니다.";// 메모리상에는 안, 안녕하, 안녕하세요,
														// 안녕하세요 ! 반갑습니다로 연산이 됨.

		// 속도가 빠름
		// 비동기에서 안정성이 보장된다.

		StringBuffer buffer = new StringBuffer();
		buffer.append("안");
		buffer.append("녕하").append("세요");
		buffer.append("반갑습니다.");
		System.out.println(buffer.toString());

		// 속도 가장 빠름
		// 비동기에서 안정성 보장되지 않는다.
		// 다중 thread환경에서는 StringBuilder로 변수를 사용하지 않는다.

		StringBuilder builder = new StringBuilder();
		builder.append("안");
		builder.append("녕하").append("세요");
		builder.append("반갑습니다.");
		System.out.println(builder.toString());
	}

	public void stringConstantPool() {

		// 값에 대한 key가 integer로 들어가고, 해시코드로 변환됨.
		// 문자열로 검색하는 거보다 해시코드를 활요하는 게 더 빠름.

		String a = "안녕하세요";
		String b = "안녕하세요";

		System.out.println(a == b); // 주소 체크
		System.out.println(a.equals(b));// 값 체크

		String c = new String("안녕하세요");// c는 콘스탄트플로우에 들어가지 않아서 위와 다름.

		String d = c.intern(); // new로 만들어진 객체를 constant pool로 이동시킨다.

	}

}
