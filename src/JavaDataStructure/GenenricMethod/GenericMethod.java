package JavaDataStructure.GenenricMethod;

public class GenericMethod {

	/* 제네릭 메서드 :
	 * 자로형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드
	 * 자료형 매개변수가 하나 이상인 경우 존재
	 * 제네릭 클래스가 아니여도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음
	 * 
	 * 구조 > public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수) {}
	 * 
	 * 
	 * */
	public static <T, V> double makeRactangle(Point<T, V> p1, Point<T, V> p2) {
		
		double left = ((Number)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
		
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0); // 다이아몬드 연산자 생략가능
		
		double size = GenericMethod.<Integer, Double>makeRactangle(p1, p2);
		System.out.println("사각형의 넓이 : " + size);
		
	}
	
	
	
}
