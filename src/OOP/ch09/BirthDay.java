package OOP.ch09;

public class BirthDay {
	
	/* ���� ���� ������ (Access modifier), ���� ����(Infomation hiding)
	 * 
	 * ���� ���� ������ (Access modifier) 
	 * Ŭ���� �ܺο��� Ŭ������ ��� ����, �޼���, �����ڸ� ����� �� �ִ��� ���θ� �����ϴ� Ű����
	 * private : ���� Ŭ���� ���ο����� ���ٰ���(�ܺ�, ��� Ŭ�������� ���� �Ұ�)
	 * �ƹ��͵� ���� (default) : ���� ��Ű�� ���ο����� ���ٰ���( ��Ӱ��迩�� �ٸ���Ű�� ���ٺҰ�)
	 * protected : ���� ��Ű���� ��Ӱ����� ��Ŭ�������� ���� �����ϰ� �� �� �ܺο����� ���� �� �� ����
	 * public : Ŭ������ �ܺ� ��𼭳� ���� �� �� ����.
	 * 
	 * get()/ set �޼���
	 * private�� ����� ��� ����(�ʵ�)�� ����, ���� �� �� �ִ� �޼��带 pulic���� ����
	 * get()�޼��常 ���� �Ǵ� ��� read-only �ʵ� ���� �Ұ�
	 * ��Ŭ�������� �ڵ����� ������
	 * 
	 * ���� ����
	 * private�� ������ ��� ������ public �޼��尡 �����Ǹ� ���� ���������� ������ public����
	 * �����Ǿ��� ������ private�� �� �� ������ ���� ������ public �޼��忡�� ���� �� �� �ִ�.
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
				System.out.println(getMonth() + "���� 31�ϱ��� �ֽ��ϴ�." + day + "���� �Է��ϼ̽��ϴ�." );
				isValid = false;
			}
			break;
			
		case 2 :
			if(getYear() % 4 == 0) {
				if(day < 1  || day < 30) this.day = day;
				isValid = true;
				System.out.println("�����Դϴ�.");
				
			}else if(day < 1 || day < 29) {
				isValid = true;
				this.day = day;
			
			}else {
				System.out.println(getMonth() + "���� 28�ϱ��� �ֽ��ϴ�." + day + "���� �Է��ϼ̽��ϴ�." );
				isValid = false;
			}	
			break;
			
		case 4 : case 6 : case 9 : case 11 :
			if(day < 1  || day < 31) {
				this.day = day;
				isValid = true;
				
			}else {
				System.out.println(getMonth() + "���� 30�ϱ��� �ֽ��ϴ�." + day + "���� �Է��ϼ̽��ϴ�." );
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
			System.out.println( year + "�� " + month + "�� " + day + "�� �Դϴ�." );
		}else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		
	}
	
	
	
	
	
	
}
