package JavaDataStructure.Generic;

public class ThreeDPrinter3 {
	// Object
	
	private Object material;
		  		
    public void setMaterial(Object material) {
	  	this.material = material;
    }
		  
    public Object getMaterial(){
	  	return material;
    }

	@Override
	public String toString() {
		return "재료는 Powderf 입니다.";
	}
     
}
