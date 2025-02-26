# 자바 중급 공부

<br>

# Chapter 1

<br>

## java.lang
자바가 기본으로 제공하는 라이브러리 중에 가장 기본이 되는 것이 `java.lang` 패키지다  
자바 언어를 이루는 가장 기본이 되는 클래스들을 보관

<br>

### java.lang 패키지의 대표적인 클래스들
- `Object`: 모든 자바 객체의 부모 클래스
- `String`: 문자열
- `Integer`, `Long`, `Double`: 래퍼 타입, 기본형 데이터 타입을 객체로 만든 것
- `Class`: 클래스 메타 정보
- `System`: 시스템과 관련된 기본 기능들을 제공

<br>

> `java.lang` 패키지는 모든 자바 애플리케이션에 자동으로 임포트된다. 따라서 임포트 구문을 사용하지 않아도 됨

<br><br><br>

## Object 클래스
- 자바에서 **모든 클래스의 최상위 부모 클래스**
  - 공통기능 제공
    - toString(), equals(), getClass() 등등...
  - 다형성의 기본 구현
    - 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할 수 있다
- 클래스에 상속받을 부모 클래스가 없으면 묵시적으로 `Object` 클래스를 상속받는다

<br>
묵시적: 개발자가 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행<br>
명시적: 개발자가 코드에 직접 기술해서 작동하는 것

### Object 다형성의 한계 
- object로 객체를 받았을때, object는 최상위 부모이므로 자식을 불러낼 수 없다
- 그럴때 다음과 같이 다운캐스팅을 해야한다
```
        if (obj instanceof Dog dog) {
            dog.sound();
        } 
```

### Object 활용
- 모든 객체를 받을 수 있는 메서드, 배열을 만들 수 있다

### toString()
```java
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
- `object`가 제공하는 `toString()` 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)을 16진수로 제공

<br>

```java
        Object o = new Object();
        String string = o.toString();

        // tostring 반환값 출력
        System.out.println(string);

        // object 직접 출력
        System.out.println(o);
```
- 두 결과값이 같게 나온다
- `Object`타입 인수로 전달되면 `println()`메서드 내부에서 `toString()`메서드를 호출해 주기 때문

### toString() 오버라이딩
- 보통 toString()을 재정의 해서 보다 유용한 정보를 제공하는 것이 일반적
- 자식이 오버라이딩 해서 참조값을 알 수 없다면?
  - ```java
        // 이렇게 참조값을 알아낼 수 있다
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue);
    ```
    
### OCP 원칙
- **Open**: 새로운 클래스를 추가하고, `toString()`을 오버라이딩해서 기능을 확장할 수 있다
- **Closed**: 새로운 클래스를 추가해도 `Object`와 `toString()`을 사용하는 클라이언트 코드인 `ObjectPrinter`는 변경하지 않아도 됨

### System.out.println()
- `System.out.println()` 메서드도 `Object` 매개변수를 사용하고 내부에서 `toString()`을 호출

<br>

정적 의존관계: 컴파일 시간에 결정되며, 주로 클래스 간의 관계를 의미<br>
동적 의존관계: 프로그램을 실행하는 런타임에 확인할 수 있는 의존관계

### equals()
- **동일성**: `==`연산자를 사용해서 두 객체의 참조가 동일한 객체인지 확인
- **동등성**: `equals()`메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
- 동등성 비교를 사용하고 싶으면 `equals()`메서드를 재정의 해야 한다.
- 그렇지 않으면 동일성 비교를 기본으로 제공

<br>

> 동등성을 비교하는 메서드는 `Objects.equals(a, b)`가 있다

<br>

