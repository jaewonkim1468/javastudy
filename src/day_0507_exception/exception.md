# Exception

* __사용자의 잘못된 조작 또는 개발자의 잘못된 코딩__ 으로 인해 발생하는 프로그램 오류
  * 예외가 발생하면 프로그램은 바로 종료됨(에러와 동일)
    * 예외는 예외처리를 통해 프로그램을 종료하지 않고 정상 실행 상태를 유지할 수 있음

## 예외 종류

* __일반 예외__
  * 컴파일 시 예외 처리 코드 검사
    * 강제적으로 예외 처리 코드 작성 요구
* __실행 예외__
  * 컴파일 시 예외 처리 코드 검사 없음
    * 개발자가 알아서 예외 처리 코드를 작성해야함
    * 해당 예외가 발생하면 프로그램이 바로 종료됨

* 컴파일 시 예외 처리를 확인하는 차이일뿐
* __두가지 모두 예외 처리가 필요__

### 예외와 예외 클래스

* 예외를 클래스로 관리함
* 모든 예외 클래스는 java.lang.Exception클래스를 상속받음

### 실행예외

* 자주 발생되는 실행 예외들
  1. NullPointerException
  2. ArrayOunOfBoundsException
  3. NumberFormatException
  4. ClassCastException

## 예외 처리 코드

* 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막음

* __try_catch_block__ 

  * 생성자,메소드 내부에 작성

  * 예외가 발생할 경우 예외 처리를 도와줌

  * ```java
    try{
      //예외 발생 가능 코드
    }catch(Exception e){ //	발생된 예외의 종류(해당 타입의 예외가 발생하면 실행)
      //예외 처리
    }finally{
      //항상 실행
    }
    ```

  * catch가 여러개여도 단 하나의 catch블록만 실행
  * 상위 예외 클래스가 하위 예외 클래스보다 아래에 위치해야함

  * 멀티 catch

    * ```java
      try{
        //ArrayOutOfBoundsException 또는 NumberFormatException발생
      }catch(ArrayOutOfBoundsException|NumberFormatException e){
        //예외처리
      }catch{
        //예외 처리
      }
      ```

      

## 예외 떠넘기기

* __throws__:메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할

* throws키워드가 붙어있는 메소드는 반드시 try블록 내에서 호출 되어야함

* ```java
  public void method1(){
    try{
      method2();//throw 키워드가 붙어있는 메소드
    }catch(ClassNotFoundException e){
      //예외 처리 코드
    }
  }
  
  public void method2() throws ClassNotFoundException{
    Class clazz = Class.forName("java.lang.String2");
  }
  ```

* Main()에서 try_catch블록으로 예외를 최종 처리하는 것이 바람직

## 사용자 정의 예외와 예외 발생

```java
public class ???Exception extends Exception|RuntimeException{
  public ???Exception () {}
  public ???Exception (String message) {super(message);}
}
```

* 클래스 이름은 Exception으로 끝나는 것이 좋음
* 대부분 생성자 선언만을 포함
* 생성자는 두 개를 선언하는것이 일반적

### 예외 발생시키기

```java
throw new ???Exception();
throw new ???Exception("메시지");
```

* 대부분 자신을 호출한 곳에서 예외를 처리하도록 throws키워드로 예외를 떠넘김

## 예외 정보 얻기

* 예외 객체를 catch블록의 매개 변수에서 참조하게 되므로 매개 변수를 이용하면 예외 객체의 정보를 알 수 있다
* Exception 클래스를 상속하기 때문에 Exception이 가지고 있는 메소드들은 모든 객체에서 호출 가능
  * 가장 많이 호출되는 메소드
  * __getMessage()__:예외 메시지는 catch 블록에서 getMessage()메소드의 리턴값으로 얻을 수 있음
  * __printStackTrace()__:예외 발생 코드를 추적해서 모두 콘솔에 출력