package ch04;

public class BinaryTest {
	
	public static void main(String[] args) {
		
		int num = 10; 
		int bNum = 0B1010; // 2���� ù��° 0 >  ��� ������ȣ, >  B 2���� ǥ��
		int oNum = 012; // 8���� 0> ��ȣ  10 = 8,   ex) 010 + 01 = 9 
		int xNum = 0XA; // 16���� 0 > ��ȣ , X 16���� ǥ�� 0~9, A~F = 10 ~ 15 , 10 = 16
		
		System.out.println("num : " + num);
		System.out.println("bNum : " + bNum);
		System.out.println("oNum : " + oNum);
		System.out.println("xNum : " + xNum);
		System.out.println(010 + 01);
		
	}
}
