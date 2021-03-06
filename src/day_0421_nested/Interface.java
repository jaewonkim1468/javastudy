package day_0421_nested;

public interface Interface {
	//인터페이스는 클래스와는 달리 다중 상속을 허용한다
	// 인터페이스 끼리의 다중상속을 허용한다
	
	/*
	 * 상위인터페이스가 갖고있는 모든 추상메소드 까지도 실체 메소드를 가지고 있어야한다.
	 * 하위인터페이스를 구현한 클래스에서는 상위인터페이스의 추상메소드도 구현되어야한다
	 */
	
	/*
	 * 
	 * 하위인터페이스 변수 = new 구현클래스();
	 * 상위인터페이스 변수 = new 구현클래스();
	 * 상위인터페이스1 변수 = new 구현클래스(); 
	 */
	
	/*
	 * 하위 인터페이스로 타입 변환되면 상*하위 인터페이스에 선언된 모든 메소드를 구현가능
	 * 상위 인터페이스로 타입 변환하면 상위인터페이스에 선언된 메소드만 구현가능
	 */
	
	/*
	 * 디폴트 메소드의 필요성
	 * 
	 * 기존 인터페이스를 확장해서 새로운 기능(메소드)을 추가하기 위해서
	 * 
	 * interface{
	 * 
	 * method1();
	 * 
	 * method2();
	 * 
	 * default method3(){...}
	 * }
	 * 
	 * 구현class implements{
	 * method1(){...}
	 * method2(){...}
	 * 
	 * 
	 * method3(){...} 기존 인터페이스에 정의된것일수도 있다
	 */
	
	/*
	 * 부모 인터페이스에 디폴트 메소드가 정의 되어 있을경우
	 * 자식 인터페이스에서 디폴트 메소드를 활용하는 방법
	 * 1. 디폴트 메소드를 단순히 상속만 받는다
	 * 2. 디폴트 메소드를 재정의해서 실행내용을 변경한다
	 * 3. 디폴트 메소드를 추상메소드로 재선언한다
	 */
	
	/*
	 * 인터페이스 VS 추상클래스
	 * 
	 * 공통점
	 * 1. 추상 메소드라는 것을 가진다
	 * 2. 둘 다 객체 생성은 불가능하고, 타입으로만 사용된다.
	 * -변수나 파라미터,리턴타입,자료구조를 유연하게 쓰기 위한 도구
	 * 
	 * 차이점
	 * 1. 인터페이스는 스펙이나 원하는 기능을 정의하고자 쓴다 : 추상클래스는 상속+약간의 강제성이 목적
	 * 2. 인터페이스는 상수,추상메소드만 존재 : 추상클래스는 상속이 원래 목적이므로 실제 변수나 메소드를 그대로 가지고 있음
	 * 3. 인터페이스는 다중상속이 가능 : 추상클래스는 다중상속 불가능(단일상속)
	 */
}
