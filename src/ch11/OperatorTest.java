package ch11;

public class OperatorTest {
	public static void main(String[] args) {
		
		/* 항(operand) : 연산에 사용되는 값
		 * 연산자(operator) : 항을 이용하여 연산하는 기호
		 * 
		 * 대입연산자(assignment operator) : 변수에 다른 변수나 값을 대입
		 *							 	  이항 연산자 중 우선순위가 가장 낮은 연산자들
		 * 							      왼쪽 변수 = 오른쪽 변수(또는 식, 값)
		 *
		 * 부호연산자 : 단항연산자 , 변수의 부호를 유지하거나(+) , 바꿈(-), 실제변수의 부호가 변하려면 대입 연산자를 사용해야함
		 * int examNum = 10;
		 * int iNum = -examNum 
		 * 
		 * 
		 * 산술 연산자 : 사칙연산자 +, -, *, /, % 나머지 연산자 숫자 n의 나머지 범위는  0 ~ n-1
		 * 
		 * 복합 대입연산자 : 대입 연산자와 다른 연산자가 함께 쓰임
		 * 
		 *  +=  : 두 항의 값을 더해서 왼족 항에 대입  num1 += 2; 와 num1 = num1 + 2; 같음
		 *  -=  : 두 항의 값을 빼서 왼쪽 항에 대입 num1 -= 2; 와 num1 = num1 - 2; 같음
		 *  *=  : 두 항의 값을 곱해서 왼쪽 항에 대입 num1 *= 2; 와 num1 = num1 * 2; 같음
		 *  /=  : 두 항의 값을 나눠서 왼쪽 항에 대입 num1 /= 2; 와 num1 = num1 / 2; 같음
		 *  %=  : 왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입 num1 %= 2; 와 num1 = num1 % 2; 같음
		 *  <<= : 비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입 num1 <<= 2; 와 num1 = num1 << 2; 같음 ex) 0B0001 << 2 ==  0B100 , num = 10; num << 1 == 20
		 *  >>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입 (왼쪽에 채워지는 값은 부호비트와 동일) num1 >>= 2; 와 num1 = num1 >> 2; 같음  ex) 0B0100 >> 0B001
		 *  >>>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 (왼쪽에 채워지는 값은 0) num1 >>>= 2; 와 num1 = num1 >>> 2; 같음  ex) 0B0100 >>> 2 == 0B0001
		 *  &= : 두항의 & 비트 연산 후 그 값을 왼쪽 항에 대입합니다. num1 &= 2; 와 num1 = num1 & 2; 같음 num1 = 2;  
		 *  |= : 두항의 | 비트 연산 후 그 값을 왼쪽 항에 대입 num1 |= 2; 와 num1 = num1 | 2; 같음
		 *  ^= : 두항의 ^ 비트 연산 후 그 값의 왼쪽 항에 대입 num1 ^= 2; 와 num1 = num1 ^ 2; 같음
		 */
		
		int gameScore = 150;
		int lastScore = gameScore++; // 뒤에있으면 이 문장이 끝나고 +1, 앞에 있으면 먼저 더하고 사용  -도 동일
		
		System.out.println(gameScore);
		System.out.println(lastScore);
		
	}
	
	
}
