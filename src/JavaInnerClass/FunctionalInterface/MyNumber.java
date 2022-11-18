package JavaInnerClass.FunctionalInterface;

@FunctionalInterface
public interface MyNumber {
	
	/* 함수형 인터페이스 람다식을 선언하기 위한 인터페이스
	 * 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함
	 * @FunctionalInterface 어노테이션을 사용
	 * 내부에 여러 개의 메서드를 선언하면 에러 발생
	 * 
	 * */
	int getMax(int num1, int num2);
	
}
