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
	 * �ڹ��� ����� ��Ʈ���� decorator pattern��
	 * ���� decorator���� Ȱ���Ͽ� �پ��� ����� ����
	 * ��Ӻ��� ������ ���� ���
	 * ���ڷ����ʹ� �ٸ� ���ڷ����ͳ� �� ������Ʈ�� �����ؾ���
	 * �������� ����� �߰��� ���Ű� ������
	 * decorator�� component�� ������ ���� �ƴ� (��� ��Ʈ�� Ŭ������ ���� �а� ���� ����, ���� ��Ʈ���� �߰����� ��� ����)
	 * 
	 * Ȱ�� -> Ŀ�� �����
	 * �Ƹ޸�ī��
	 * ī�� �� = �Ƹ޸�ī�� + ����
	 * ��ī Ŀ�� = �Ƹ޸�ī�� + ���� + ��ī�÷�
	 * ũ�� �ö� ��ī Ŀ��= �Ƹ޸�ī�� + ���� + ��ī�÷� + ����
	 * 
	 * Ŀ�Ǵ� ������Ʈ, ����, ��ī�÷�, ������ ���ڷ�����
	 * 
	 * */
	
	
	
	
}
