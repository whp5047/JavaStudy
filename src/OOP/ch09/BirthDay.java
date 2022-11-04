package OOP.ch09;

public class BirthDay {
	
	/* 접근 제어 지시자 (Access modifier), 정보 은닉(Infomation hiding)
	 * 
	 * 접근 제어 지시자 (Access modifier) 
	 * 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
	 * private : 같은 클래스 내부에서만 접근가능(외부, 상속 클래스에서 접근 불가)
	 * 아무것도 없음 (default) : 같은 패키지 내부에서만 접근가능( 상속관계여도 다른패키지 접근불가)
	 * protected : 같은 패키지나 상속관계으 ㅣ클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
	 * public : 클래스의 외부 어디서나 접근 할 수 있음.
	 * 
	 * get()/ set 메서드
	 * private로 선언된 멤버 변수(필드)에 접근, 수정 할 수 있는 메서드를 pulic으로 제공
	 * get()메서드만 제공 되는 경우 read-only 필드 수정 불가
	 * 이클립스에서 자동으로 생성됌
	 * 
	 * 정보 은닉
	 * private로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만 변수가 public으로
	 * 공개되었을 때보다 private일 때 각 변수에 대한 제한을 public 메서드에서 제어 할 수 있다.
	 * 
	 * 
	 */
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		switch (getMonth()) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			
			if(day < 1 || day < 32){
				this.day = day;
				isValid = true;
			}else{
				System.out.println(getMonth() + "월은 31일까지 있습니다." + day + "일을 입력하셨습니다." );
				isValid = false;
			}
			break;
			
		case 2 :
			if(getYear() % 4 == 0) {
				if(day < 1  || day < 30) this.day = day;
				isValid = true;
				System.out.println("윤년입니다.");
				
			}else if(day < 1 || day < 29) {
				isValid = true;
				this.day = day;
			
			}else {
				System.out.println(getMonth() + "월은 28일까지 있습니다." + day + "일을 입력하셨습니다." );
				isValid = false;
			}	
			break;
			
		case 4 : case 6 : case 9 : case 11 :
			if(day < 1  || day < 31) {
				this.day = day;
				isValid = true;
				
			}else {
				System.out.println(getMonth() + "월은 30일까지 있습니다." + day + "일을 입력하셨습니다." );
				isValid = false;
			}
			break;
			
		default:
			isValid = false;
			break;
		}
			
	}
		
		
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean getIsValid() {
		return isValid;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println( year + "년 " + month + "월 " + day + "일 입니다." );
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		
	}
	
	
	
	
	
	
}
