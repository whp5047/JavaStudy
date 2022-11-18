package JavaInnerClass.OOPAndLamndaComparison;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		
		StringConcat concat = (s, v) -> System.out.println(s1  + "," + v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override 
			public void makeString(String s1, String s2) { // Anonymous 익명 클래스가 만들어지는게 생략된 것 @FunctionalInterface
				
				System.out.println(s1 + "...." + s2);
			}
		};
			
		concat2.makeString(s1, s2);
		
	}
	
	/* 익명 내부 클래스에서와 마찬가지로 람다식 내부에서도 외부에 있는 지역 변수의 값을 변경하면 오류가 발생
	 * 람다식은 함수를 변수처럼 사용
	 * 
	 * 기존 변수
	 * 특정 자료형으로 변수를 선언 한 후 값을 대입 int num = 10;
	 * 매개 변수로 전달하여 사용 add(int num, int num2)
	 * 메서드의 반환 값으로 반환하기 return num;
	 * 
	 * 람다식
	 * 
	 * 함수형 인터페이스로 사용
	 * PrintString lambdaStr = s-> System.out.println(s); // 람다식을 변수에 대입
	 * 
	 * 매개변수로 전달하는 람다식
	 * showMyString(lambdaStr);
	 * public static void showMyString(PrintString p){
	 * 		p.showString("Hello lambda_2")
	 * }
	 * 
	 * 반환값으로 쓰이는 람다식
	 * public static PrintString returnString(){
	 * 		return s-> System.out.println(s + "world");
	 * }
	 * 
	 * PrintString reStr = returnString();
	 * reStr.showString("hello");
	 * 
	 * */

}
