package JavaInnerClass.IOStream.DecoratorPattern;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		
		coffee.brewing();
	}
	
	
	/* Decorator Pattern
	 * 자바의 입출력 스트림은 decorator pattern임
	 * 여러 decorator들을 활용하여 다양한 기능을 제공
	 * 상속보다 유연한 구현 방식
	 * 데코레이터는 다른 데코레이터나 또 컴포넌트를 포함해야함
	 * 지속적인 기느의 추가와 제거가 용이함
	 * decorator와 component는 동일한 것이 아님 (기반 스트림 클래스가 직접 읽고 쓸수 있음, 보조 스트림은 추가적인 기능 제공)
	 * 
	 * 활용 -> 커피 만들기
	 * 아메리카노
	 * 카페 라떼 = 아메리카노 + 우유
	 * 모카 커피 = 아메리카노 + 우유 + 모카시럽
	 * 크림 올라간 모카 커피= 아메리카노 + 우유 + 모카시럽 + 휘핑
	 * 
	 * 커피는 컴포넌트, 우유, 모카시럽, 휘핑은 데코레이터
	 * 
	 * */
	
	
	
	
}
