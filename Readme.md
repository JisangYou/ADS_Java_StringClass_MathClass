# ADS04 Java 

## 수업 내용
- String class 학습
- Math class 학습

## Code Review String Class

### String Api

1. __length__ - 문자열의 길이를 나타내는 함수

```Java
  System.out.println(a.length());

```

2. __indexOf__ - 문자열의 위치를 검색하는 함수

```Java
  System.out.println(a.indexOf("Test"));
```

3. __split__ - 특정 구분자로 분해하는 함수 -

```Java
    String temp[] = a.split("/");

    ※빈 문자열로 자르면 글자 하나 단위로 쪼깨짐

    String temp2[] = a.split("");
```
4. __substring__ - 문자열 자르는 함수

```Java
  System.out.println(a.substring(2, 7));
```

5. __replace__ - 문자열 바꾸는 함수

```Java
  System.out.println(a.replace("Te", "Px"));
```
6. __startsWith__ - 특정 문자열로 시작되는지를 검사하는 함수

```Java
  a.startsWith("Str");
EX)
String address = "never.com";
    if (!address.startsWith("http:")) {
      address = "http://" + address;
    }
```

### builder vs buffer

1. _buffer 특징_                          
  - 속도가 빠름
	- 비동기에서 안정성이 보장된다.
  - 예)
   ``` Java
		StringBuffer buffer = new StringBuffer();
		buffer.append("안");
		buffer.append("녕하").append("세요");
		buffer.append("반갑습니다.");
		System.out.println(buffer.toString());
  ```

2. _builder 특징_
	- 속도 가장 빠름
	- 비동기에서 안정성 보장되지 않는다.
	- 다중 thread환경에서는 StringBuilder로 변수를 사용하지 않는다.
  - 예)
  ```Java
		StringBuilder builder = new StringBuilder();
		builder.append("안");
		builder.append("녕하").append("세요");
		builder.append("반갑습니다.");
		System.out.println(builder.toString());
  ```
### StringConstantPool

- 특징  

  - 값에 대한 key가 integer로 들어가고, 해시코드로 변환됨.
  - 문자열로 검색하는 거보다 해시코드를 활요하는 게 더 빠름.

```Java
		String a = "안녕하세요";
		String b = "안녕하세요";

		System.out.println(a == b); // 주소를 체크하는 것.
		System.out.println(a.equals(b)); // 값을 체크하는 것

		String c = new String("안녕하세요"); // c는 constant pool에 들어가지 않아서 위와 다름.

		String d = c.intern(); // new로 만들어진 객체를 constant pool로 이동시킨다.
```

## 보충설명

- String은 문자열을 대표하는 것으로 문자열을 조작하는 경우 유용하게 사용할 수 있습니다. 문자열, 숫자, char 등은 concat할때는 StringBuffer, StringBuilder를 사용할 수 있습니다. 단, 복잡한 경우 의미가 있고, 단순한 경우에는 굳이 StringBuffer, StringBuilder를 쓰지 않고 +연산자를 활용해 직접 합칠 수있음. 그러나 문자열 연산이 많은 경우 성능이 좋지 않음.

- String 객체는 한번 생성되면 할당된 메모리 공간이 변하지 않습니다. 

- + 연산자 또는 concat 메서드를 통해 기존에 생성된 String 클래스 객체 문자열에 다른 문자열을 붙여도 기존 문자열에 새로운 문자열을 붙이는 것이 아니라, 새로운 String 객체를 만든 후, 새 String 객체에 연결된 문자열을 저장하고, 그 객체를 참조하도록 합니다. (즉, String 클래스 객체는 Heap 메모리 영역(가비지 컬렉션이 동작하는 영역)에 생성. 한번 생성된 객체의 내부 내용을 변화시킬 수 없습니다. 기존 객체가 제거되면 Java의 가비지 컬렉션이 회수합니다.)

- Immutable한 객체는 간단하게 사용가능하고, 동기화에 대해 신경쓰지 않아도 되기때문에(Thread-safe),  내부 데이터를 자유롭게 공유 가능합니다.

- 결론적으로,

```Java
String은 짧은 문자열을 더할 경우에
StringBuffer는 스레드에 안전한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우에
StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 프로그램을 개발할 경우에
```
사용한다.

출처: http://12bme.tistory.com/42 [goorm>=5; 길은 가면, 뒤에 있다]

-----------------------------------------------------------------------------------------------------------------------------------------------

## Code Review Math Class

### Math Class

```Java
public void testMath() {
		// 절대값 구하기
		int a = Math.abs(-123);// static으로 선언되어있는 경우 Math math = new Math();가 안됨
		// 반올림
		long b = Math.round(123.5);
		// 올림
		double c = Math.ceil(343.1543);
		// 내림
		double d = Math.floor(563.8);

		System.out.println("절대값" + a + b + c + d);

		Math.random(); // 0보다 크거나 같고 1보다 작은 실수를 리턴

		Random random = new Random();
		// 1부터 100사이의 랜덤한 숫자 가져오기

		random.nextInt(100); // ->0~99 사이의 정수가 리턴
		int r = random.nextInt(100) + 1;
 }
```

### SUM 

1. 총합 구하기(가우스 방정식을 활용)

```Java
public long sum(long max) {

		long result = 0;
		result = max * (max + 1) / 2;
		return result;
	}
```
- for문을 사용하는 것보다 성능이 우수

2. 홀수 더하기

```Java
	public long sumOdd(long max) {// 홀수일때,

		if (max % 2 == 1) //예외처리
			max = max + 1; // 7일때는 8이 나와도 상관없이 7부터 더하므로 상관없음.
		long count = max / 2;
		return count * count;

	}
```
- 패턴을 활용함. 개수*2

3. 짝수 더하기

```Java
	public long sumEven(long max) {// 짝수일때,

		// 2+4=6, 2+4+6=12, 2+4+6+8=20....
				// 개수 n * n+1 = 결과 도출

		if (max % 2 == 1) //예외처리
			max = max - 1; // 9일때는 8부터 더해야하므로 -1
		long count = max / 2; //개수
		return count * count + count;

	}
```
-패턴을 활용함. 개수*개수+1

### lotto program

1. case 1

```Java
public int[] getLottoNumber() {

		int[] result = new int[6];
		Random random = new Random();

		for (int index = 0; index < result.length; index++) {
			// random 함수에서 발생되는 난수는 중복될 수 있다.
			// 아래예제에서 결과값이 처음에 33이 나왔을 경우
			// 두 번째 케이스에서도 33이 나올 수 있다.
			result[index] = random.nextInt(45) + 1;
			// 중복값에 대한 예외처리
			for (int j = 0; j < index; j++) {
				if (result[index] == result[j]) {
					index--;
					break;
				}
			}
		}

		return result;
	}
```
-for문이 한번 돌때 배열크기만큼 랜덤값 생성하나, 중복처리를 위해 for문 한번 더 생성

2. case 2

```Java
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
```


## 보충설명

- Math 클래스는 수학적 연산과 관련된 메소들을 제공하는 클래스로 random() 메소드를 사용하여 0.0 <= double value <1.0의 값을 생성할 수 있다.

- Randome 클래스로 무작위 난수를 생성할 수 있음.
ex) 
```Java
random.nextInt(10) + 1; 
```
이런식으로 next타입(갯수)로 사용한다.  

- for 문을 돌때 조건 모두를 공란으로 할 수 있음. 
```Java
for (/* 시작값 */; 6 > treeSet
				.size(); 
        /* 세개의 식 모두 공란으로 둘 수 있음, 증감값 안써도 된다. */) {
				}
```


## TODO

- 유용하게 쓰일만한 클래스인 것 같다. 자바에서 제공하는 다양한 클래스들에 대한 공부가 필요

- 알고리즘 연습


## Retrospect

- 알고리즘을 계속해서 공부해야 이러한 클래스들도 능수능란하게 사용할 수 있을 것 같다.


## Output

- 생략







