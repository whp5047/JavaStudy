package design.strategy;

public interface EncodingStrategy {
	/*
	 * Strategy 
	 * 유사한 행위를 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여
	 * 유연한 확장을 도모 SOLID 중에 개방폐쇄 원칙(OCP)와 의존 역전 원칙(DIP)를 따름
	 * 
	 * 전략 메서드를 가진 전략객체와 전략객체를 사용하는 컨텍스트가 존재
	 * 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트
	 * 
	 * */
	
	String encode(String text);
	
}
