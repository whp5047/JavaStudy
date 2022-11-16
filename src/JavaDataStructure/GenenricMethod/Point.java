package JavaDataStructure.GenenricMethod;

public class Point<T, V> {
	
	/* 두 점(tom, bottom)을 기준으로 사각형을 만들떄 사각형의 너비를 구하는 메서드
	 * 정수인 경우도 있고 실수인 경우도 있으니 제네릭타입으로 구현
	 * 
	 * */
	
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
}
