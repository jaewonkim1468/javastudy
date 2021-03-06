# 람다식

* 함수로 구성된 프로그래밍 기법
* 데이터를 매개값으로 전달하고 결과를 받는 코드들로 구성
* __익명 함수를 생성하기위한 식__ 
  * 매개 변수를 가진 코드블록
  * 런타임시에 익명 구현 객체를 생성

* __(매개변수)->{실행코드}__

## 익명구현객체

```java
Runnable runnable = new Runnable(){
  public void run(){...}
}
```

## 람다식

```java
Runnable runnable = ()->{...};
```

## 기본문법

* 마지막에 세미콜론(;)을 붙여야함

```java
(int a)->{System.out.println(a);}
(a)->{System.out.println(a);}//타입 생략 가능
a->System.out.println(a);//매개변수가 1개이면 ()생략가능, 실행코드가 한줄이면 {} 생략가능

()->{실행문}//매개변수가 없으면 () 꼭 써야함

(x,y)->{return x+y;}//리턴값 가능
(x,y)->x+y//return문 생략가능
```

## 타켓타입

람다식은 인터페이스 변수에 대입

* 타겟타입: __람다식이 대입될 인터페이스__
* 인터페이스에 따라 작성방법이 다름

람다식은 하나의 메소드를 정의

* 두 개 이상의 메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다
* 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타겟타입이 될 수 있다
  * __함수정 인터페이스__ 
* @FunctuinalInterface 어노테이션

## 생성자 참조

* 메소드 참조는 생성자 참조도 포함
* (a,b)->{return new 클래스(a,b);} -> 클래스::new