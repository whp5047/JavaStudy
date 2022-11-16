package JavaDataStructure.GenericTExtends;

public class GenericPrinter<T extends Material> {
	
	/* 제네릭 자료형 : 클래스에서 사용하는변수의 자료형이 여러개 일 수 있고, 기 그닝은 동일한 경우 클래스의 자료형을 특정하지 않고
	 * 추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언
	 * 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되어 안정적인 프로그래밍 방식임
	 * 컬렉션 프레임워크에서 많이 사용,
	 *
	 * 자료형 매개변수 T(type parameter) : 이 클래스를 사용하는 시점에 실제로 사용할 자료형을 지정, static 변수 사용 불가
	 * GenericPrinter : 제네릭 자료형
	 * E : element, K : key, V : value : 등 여러 알파벳을 의미에 따라사용가능
	 * 
	 * */
	
	
	private T material;
		  		
    public void setMaterial(T material) {
	  		this.material = material;
    }
		  
    public T getMaterial(){
	  		return material;
    }

	@Override
	public String toString() {
		
		if(material instanceof Powder) {
			return "재료는 Powderf 입니다.";
			
		}else if( material instanceof Plastic) {
			return "재료는 Flasticf 입니다.";
			
		}else {
			return "재료가 비었습니다.";
		}
		
	}
     
}
