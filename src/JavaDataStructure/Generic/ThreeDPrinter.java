package JavaDataStructure.Generic;

public class ThreeDPrinter {
	
	/* ���׸� �ڷ��� : Ŭ�������� ����ϴº����� �ڷ����� ������ �� �� �ְ�, �� �״��� ������ ��� Ŭ������ �ڷ����� Ư������ �ʰ�
	 * ���� �ش� Ŭ������ ����� �� ���� �� �� �ֵ��� ����
	 * ���� ���Ǵ� �ڷ����� ��ȯ�� �����Ϸ��� ���� �����Ǿ� �������� ���α׷��� �����
	 * �÷��� �����ӿ�ũ���� ���� ���,
	 *
	 * �ڷ��� �Ű����� T(type parameter) : �� Ŭ������ ����ϴ� ������ ������ ����� �ڷ����� ����, static ���� ��� �Ұ�
	 * GenericPrinter : ���׸� �ڷ���
	 * E : element, K : key, V : value : �� ���� ���ĺ��� �ǹ̿� �����밡��
	 * 
	 * */
	
	
	private Powder material;
		  		
    public void setMaterial(Powder material) {
	  		this.material = material;
    }
		  
    public Powder getMaterial(){
	  		return material;
    }

	@Override
	public String toString() {
		return "���� Powderf �Դϴ�.";
	}
     
}
