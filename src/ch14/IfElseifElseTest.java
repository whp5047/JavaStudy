package ch14;

public class IfElseifElseTest {
	public static void main (String[] args) {
		
		/*
		 *  if - else if - else �� 
		 *  �� ������ ��ȣ ��Ÿ������
		 *  
		 *  if(���ǹ�1){
		 *  	���๮;	���ǽ��� "��"�� ��� ���� ���� ���ǹ� Ż��
		 *  
		 *  }else if(���ǹ�2){
		 *  	���๮;	���ǽ��� "��"�� ��� ���� ���� ���ǹ� Ż��
		 *  
		 *  }else if(���ǹ�3){
		 *  	���๮;	���ǽ��� "��"�� ��� ���� ���� ���ǹ� Ż��
		 *  
		 *  }else{
		 *  	���๮; ����Ʈ ����� ���� ������ �ϳ��� ������Ű�� ���Ѵٸ� ����
		 *  }
		 *  
		 *  ���๮; ���ǹ��� ������ ����	
		 * 
		 */
		
		int age = 15;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
			
		}else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
			
		}else if(age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
			
		}else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
			
		}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
				
		
		
		
		
	}
}
