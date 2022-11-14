package JavaClass.Object;

import java.util.Objects;

public class Student implements Cloneable{
	
	/* equals() : �� �ν��Ͻ��� �ּ� ���� ���Ͽ� true/ false �� ��ȯ
	 * ������ �Ͽ� �� �ν��Ͻ��� �������� �������� ���θ� ������
	 * �ν��Ͻ��� �ٸ����� �������� ������ ��� true�� ��ȯ�ϵ��� ������ �� �� ���� (�����й�, �������, ���� ���̵��� ȸ��)
	 * 
	 * hashCode() : �ν��Ͻ��� ���� �ּҸ� ��ȯ��
	 * ���޸𸮿� �ν��Ͻ��� ����Ǵ� ����� hash ���
	 * ������ ����, �˻��ϴ� �ڷᱸ�� > hash
	 * �ڷ��� Ư�� ��(Ű ��) �� ���� ������ġ�� ��ȯ���ִ� �ؽ� �Լ��� ��� index = hash(key)
	 * 
	 * clone()�޼���
	 * ��ü�� ������ �����ϴµ� ����ϴ� �޼���
	 * ���������� ������ ������ �ݺ����� �ʰ� ���� �� �� ����
	 * 
	 * clone() �޼��带 ����ϸ� ��ü�� ����(��� ���� ����)�� ������ �� �ٸ��ν��Ͻ��� �����Ǵ� ���̹Ƿ�, ��ü���� ���α׷��ֿ��� ������ ����
	 * ��ü ��ȣ�� �������� ���� �� �� ����
	 * 
	 * �ش� Ŭ������ clone() �޼����� ����� ����Ѵٴ� �ǹ̷� cloneable �������̽��� �������
	 * 
	 * 
	 * 
	 * */
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override //���� ������
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if( this.studentName == std.studentName) {
				return true;
				
			}else {
				return false;
			}
				
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
