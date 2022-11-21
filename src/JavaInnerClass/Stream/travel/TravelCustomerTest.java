package JavaInnerClass.Stream.travel;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
	
	/* ����翡 ��Ű�� ���� ��ǰ�� �ֽ��ϴ�. ���� ����� 15�� �̻��� 100����, �� �̸��� 50���� �Դϴ�.
	 * �� �� ���� ��Ű�� ������ �����ٰ� ���� �� ��� ���� �� ��� �˻�� ���� ������ ��Ʈ���� Ȱ���Ͽ� ������ ���ϴ�.
	 * ���� ���� Ŭ������ ����� ArrayList�� ���� �����մϴ�.
	 * 
	 * ���� ���
	 * ���� ����� ����մϴ�
	 * �� ����� ����մϴ�.
	 * �� �� 20�� �̻��� ����� �̸��� �����Ͽ� ����մϴ�.
	 * 
	 * */
	
	
	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("�� ��� ���");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("���� ���");
		int sum = customerList.stream().mapToInt(c->c.getPrice()).sum(); 
		System.out.println(sum);
		
		System.out.println("20�� �̻� ���̸� ����"); // �߰� ������ Ƚ�� ���x
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	
		
	}

}
