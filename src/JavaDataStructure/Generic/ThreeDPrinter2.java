package JavaDataStructure.Generic;

public class ThreeDPrinter2 {
	
	 private Plastic material;
		  		
     public void setMaterial(Plastic material) {
	  		this.material = material;
     }
		  
     public Plastic getMaterial(){
	  		return material;
     }

	@Override
	public String toString() {
		return "재료는 Powderf 입니다.";
	}
     
}
