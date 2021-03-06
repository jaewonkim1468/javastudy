package day_0416_interface.a;

public class TestClass implements A{
	/*
	 *  상속은 같은 종류의 하위 클래스를 만드는 기술
	 *  자식 클래스
	 *  
	 *  인터페이스는 사용 방법이 동일한 클래스를 만드는 기술
	 *  구현 클래스
	 */
	
	/*
	 * 모든 메소드는 기본적으로 public 접근제한을 갖기 때문에 public보다 더 낮은 접근 제한으로 작성할 수 없다.
	 */
	
	/*
	 * 인터페이스 변수를 선언하고 구현 객체를 대입해야함
	 * 자동 타입 변환 가능
	 * A a = new구현객체();
	 */
	
	/*
	 * 강제타입변환
	 * 자동타입변환이 일어난 객체를 다시 바꿀때 가능
	 */
	
	/*
	 * 익명 구현 객체
	 * 인터페이스 변수 = new 인터페이스(){
	 * -인터페이스에 선언된 추상 메소드의 실체 메소드 선언
	 * };
	 */
	
	/*
	 * 인터페이스는 클래스의 필드, 생성자 또는 메소드의 매개변수, 생성자 또는 메소드의 로컬변수로 선언될 수 있다.
	 */
	
	/*
	 * 디폴트 메소드는 구현객체가 있어야 호출 가능하다
	 */
		
}