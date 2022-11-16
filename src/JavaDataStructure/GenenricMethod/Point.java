package JavaDataStructure.GenenricMethod;

public class Point<T, V> {
	
	/* �� ��(tom, bottom)�� �������� �簢���� ���鋚 �簢���� �ʺ� ���ϴ� �޼���
	 * ������ ��쵵 �ְ� �Ǽ��� ��쵵 ������ ���׸�Ÿ������ ����
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
