package JavaDataStructure.GenericTExtends;

public class GenericPrinter<T extends Material> {
	
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
			return "���� Powderf �Դϴ�.";
			
		}else if( material instanceof Plastic) {
			return "���� Flasticf �Դϴ�.";
			
		}else {
			return "��ᰡ ������ϴ�.";
		}
		
	}
     
}
