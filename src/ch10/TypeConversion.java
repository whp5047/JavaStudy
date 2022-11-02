package ch10;

public class TypeConversion {
	public static void main(String[] args) {
		
		/* 명시적 형 변환(강제), 묵시적 형 변환(자동)이 존재
		 * 
		 * 묵시적 int -> Long 작은 것에서 큰 것으로 -> 자료의 유실이 없기 때문
		 * 명시적 double -> int 실수이기 때문에 정수로 변환시 자료의 유실발생  
		 * 
		 * */
		
		byte bNum = 125; 
		int iNum = bNum;
		System.out.println(iNum);
		
		int iNum1 = 255;
		byte bNum1 = (byte)iNum1; // byte -128~ 127까지 표현가능하기 때문에 범위를 초과함 따라서 오버플로우 발생
								  // 127이후 -128부터 나머지를 + 하여 -1 을 출력
		System.out.println(bNum1);
		
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println(iNum2); //실수부를 전부 버려 3이 출력
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum;
		int iNum4 = (int)(dNum1 + fNum);
		
		System.out.println(iNum3); // 먼저 형변환하여 1 + 0 = 0
		System.out.println(iNum4); // 계산 후 형변환하여 2.1  =>  2
		
	}
}
