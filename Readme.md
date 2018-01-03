# ADS04 Java 

## 수업 내용
- String Api 학습

## Code Review

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

## TODO

- 시간이 날때 Java내부 다양한 api를 공부해보기
- 깊게는 이해를 못하더라도, 어느 api가 있다라는 정도는 파악해둘 필요성이 있음.
- 알고리즘을 많이 풀면서 해당 api들을 적용시켜보는 연습을 하기
- 해당 프로젝트에 있는 알고리즘 공부하기

## Retrospect

- 학원을 다니면서 알고리즘 문제를 처음으로 접했을 때, 해당 api들이 굉장히 중요하다는 것을 느꼈다.
- 그동안 따로 알고리즘 문제를 풀어보지 않아 처음에는 많이 어려웠는데, 알고리즘을 계속 풀다보니 해당 api가 눈에는 익었으나 부족한 점이 여전히 있음


## Output

- 생략







