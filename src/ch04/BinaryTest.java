package ch04;

public class BinaryTest {
	
	public static void main(String[] args) {
		
		int num = 10; 
		int bNum = 0B1010; // 2진수 첫번째 0 >  양수 음수부호, >  B 2진수 표식
		int oNum = 012; // 8진수 0> 부호  10 = 8,   ex) 010 + 01 = 9 
		int xNum = 0XA; // 16진수 0 > 부호 , X 16진수 표식 0~9, A~F = 10 ~ 15 , 10 = 16
		
		System.out.println("num : " + num);
		System.out.println("bNum : " + bNum);
		System.out.println("oNum : " + oNum);
		System.out.println("xNum : " + xNum);
		System.out.println(010 + 01);
		
	}
}
