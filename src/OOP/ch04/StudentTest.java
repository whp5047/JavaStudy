package OOP.ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		/* �ν��Ͻ� : Ŭ������ ��ü�� �Ӽ��� �����ϰ�, ����� �����Ͽ� ����� ���� �ڵ� ����
		 * ���� Ŭ���� ������� ������ ��ü(�ν��Ͻ�)�� ���� �ٸ� ��� ������ ����
		 * �л��� Ŭ�������� ������ ������ �ν��Ͻ��� ���� �ٸ� �̸�, �й�, �г��� �������� new �� ���� �ν��Ͻ� ����
		 * 
		 * 
		 * �� �޸� : ������ �ν��Ͻ��� �����޷��� �� ���޸𸮿� �Ҵ��
		 * C, C++ ���� ����ϴ� ���� �޸𸮸� ���α׷��Ӱ� free(), delete�� ����� ���� ���Ѿ�������
		 * �ڹٴ� Garbage Collector�� �ֱ������� ������� �ʴ� �޸𸮸� ���� 
		 * �ϳ��� Ŭ������ ���� �������� �ν��Ͻ��� �����ǰ� ���� �ٸ� �޸� �ּҸ�����
		 * 
		 * ��ü : ��ü ���� ���α׷��� ���, ������ �ν��ʹ�
		 * Ŭ���� : ��ü�� ���α׷��� �ϱ� ���� �ڵ�� ������ ���� ����
		 * ��� ���� : Ŭ������ �Ӽ�, Ư��
		 * �޼��� : ��� ������ �̿��� Ŭ������ ����� ������ �Լ�
		 * ���� ���� : �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����
		 * ���� �� : ������ �ν��Ͻ��� �޸� �ּ� ��
		 * 
		 * */
		
		
		Student studentLee = new Student(); // ��������
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "����� ������";
		
		studentLee.showStudentInfo();
		System.out.println(studentLee); // JVM�� �Ҵ����� ������ �ּ�
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim); // JVM�� �Ҵ����� ������ �ּ�
		
		
		
	}

}
